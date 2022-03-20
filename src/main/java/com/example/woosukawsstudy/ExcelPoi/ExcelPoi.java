package com.example.woosukawsstudy.ExcelPoi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelPoi {


    public void writeExcel() throws IOException {
        Workbook workBook = new XSSFWorkbook();

        Sheet sheet = workBook.createSheet();

        sheet.setColumnWidth(0,6000);
        sheet.setColumnWidth(1,9000);

        Row header = sheet.createRow(0);
        CellStyle headerStyle = workBook.createCellStyle();
        // 생략
         XSSFFont font = ((XSSFWorkbook) workBook).createFont();
        // 생략
         Cell headerCell = header.createCell(0);
         headerCell.setCellValue("Name");
          headerCell.setCellStyle(headerStyle);
         headerCell = header.createCell(1);
         headerCell.setCellValue("Age");
         headerCell.setCellStyle(headerStyle);
        // Next, let's write the content of the table with a different style:
         CellStyle style = workBook.createCellStyle();
         style.setWrapText(true);
         Row row = sheet.createRow(1);
         Cell cell = row.createCell(0);
         cell.setCellValue("John Smith");
         cell.setCellStyle(style);
         cell = row.createCell(1);
         cell.setCellValue(20);
         cell.setCellStyle(style);

         for(int i = 2; i<1000; i++){
             row = sheet.createRow(i);
             cell = row.createCell(0);
             cell.setCellValue("Woosuk"+i);
             cell.setCellStyle(style);
             cell = row.createCell(1);
             cell.setCellValue("structure"+(i*i));
             cell.setCellStyle(style);
         }

//         row = sheet.createRow(2);
//         cell = row.createCell(0);
//         cell.setCellValue("WooSuk is king!");
//         cell.setCellStyle(style);
//         cell = row.createCell(1);
//         cell.setCellValue(9999);
//         cell.setCellStyle(style);


         //sheet.createRow 하면 Row를 계속 추가 할수 있을것 같다.
//         Row row2 = sheet.createRow(2);
//         Cell cell2 = row2.createCell(0);
//         cell2.setCellValue("WooSuk!");
//         cell2.setCellStyle(style);
//         cell2 = row2.createCell(1);
//         cell2.setCellValue(5000);
//         cell2.setCellStyle(style);

        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        String fileLocation = path.substring(0, path.length() - 1) + "testHandlerExcel.xlsx";
        FileOutputStream outputStream = new FileOutputStream(fileLocation);
        workBook.write(outputStream);
        workBook.close();



    }
}
