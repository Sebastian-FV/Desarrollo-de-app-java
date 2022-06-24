/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.utilities;

import com.cwsprog.proyectoBarberia.app.modelo.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ADMIN
 */
public class ExportarExcell {
    
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<Usuario> usuariosList;

    public ExportarExcell(List<Usuario> listUsuarios){
        this.usuariosList=listUsuarios;
        workbook = new XSSFWorkbook();
    }
    
    private void writeHeaderLine() {
        sheet = workbook.createSheet("ListaUsuarios");

        Row row = sheet.createRow(0);

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);

        createCell(row, 0, "id", style);
        createCell(row, 1, "documento", style);
        createCell(row, 2, "nombre", style);
        createCell(row, 3, "apellido", style);
        createCell(row, 4, "telefono", style);
        createCell(row, 5, "ro",style);

    }
    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }

    private void writeDataLines() {
        int rowCount = 1;

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);

        for (Usuario usu : this.usuariosList) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
            createCell(row, columnCount++, usu.getid(), style);
            createCell(row, columnCount++, usu.getIdentificacionUsuario(), style);
            createCell(row, columnCount++, usu.getNombreUsuario(), style);
            createCell(row, columnCount++, usu.getApellidoUruario(), style);
            createCell(row, columnCount++, usu.getTelefonoUsuario(), style);
            createCell(row, columnCount++, usu.getIdRolFk().getNombreRol(),style);

        }
    }

    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();

        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

        outputStream.close();

    }
    
}
