/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.bo;

import co.za.designacouch.constants.DesignACouchConstants;
import co.za.designacouch.dao.CustomerDao;
import co.za.designacouch.daoimpl.CustomerDaoImpl;
import co.za.designacouch.domain.CustomerDo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 *
 * @author Siyanda
 */
public class CustomerBo {
    
    /** The workbook. */
    private static HSSFWorkbook workbook;
    
    /** The cell. */
    private static Cell cell;
    
    /** The row counter. */
    private static int rowCounter;
    
    /** The sheet. */
    private static HSSFSheet sheet;

    /** The row. */
    private static Row headerRow;    
    
    public static CustomerDo recordCustomerDo(CustomerDo customerDo){
        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.recordCustomerDo(customerDo);
        
        return customerDo;
    }
    
    public static void printCustomerInformation(List<CustomerDo> customerDoList) {
        
        prepareExcelFile("C:\\temp\\NewFile.xls");
        HSSFCellStyle hSSFCellStyle = workbook.createCellStyle();
        hSSFCellStyle.setWrapText(true);
        hSSFCellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        hSSFCellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        hSSFCellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
        hSSFCellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        
        rowCounter = rowCounter + 1;
        headerRow = sheet.createRow(rowCounter);
        cell = headerRow.createCell(0);
        cell.setCellValue(""); // TemplateId
        cell.setCellStyle(hSSFCellStyle);
        cell = headerRow.createCell(1);
        cell.setCellValue(""); // GroupName
        cell.setCellStyle(hSSFCellStyle);
        cell = headerRow.createCell(3);
        cell.setCellValue(""); // From OnlineTransaction
        cell.setCellStyle(hSSFCellStyle);
        cell = headerRow.createCell(4);
        cell.setCellValue(""); // Field Name
        cell.setCellStyle(hSSFCellStyle);
        cell = headerRow.createCell(5);
        cell.setCellValue(""); // Field Type
        cell.setCellStyle(hSSFCellStyle);
        cell = headerRow.createCell(6);
        cell.setCellValue(""); // Field Length
        cell.setCellStyle(hSSFCellStyle);
        cell = headerRow.createCell(7);
        cell.setCellValue(""); // Field Precision
        cell.setCellStyle(hSSFCellStyle);
        
        String outputFile = "C:\\temp\\outputFile.xls";
        writeOutputFile(outputFile);

    }
    
    /**
     * This method prepares the excel file.
     * 
     * @param outputFile
     *            because the output file is a file that exist already, we need to supply it's relative location.
     */
    private static void prepareExcelFile(String outputFile) {
        
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(outputFile));
            workbook = new HSSFWorkbook(fileInputStream);
            
            sheet = workbook.getSheet(DesignACouchConstants.DESIGN_A_COUCH);
            
            if (sheet == null) {
                sheet = workbook.createSheet(DesignACouchConstants.DESIGN_A_COUCH);
                workbook.setSheetOrder(DesignACouchConstants.DESIGN_A_COUCH, 0);
            }
            
            sheet.setAutoFilter(CellRangeAddress.valueOf("A1:J1"));
            sheet.createFreezePane(0, 1);
            
            rowCounter = 0;
            
            headerRow = sheet.createRow(rowCounter);
            headerRow.setHeight((short) 1090);

            HSSFCellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setWrapText(true);
            headerCellStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
            headerCellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
            headerCellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            headerCellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
            headerCellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
            
            cell = headerRow.createCell(rowCounter);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(rowCounter, 4570);

            cell = headerRow.createCell(1);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(1, 5400);

            cell = headerRow.createCell(2);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(2, 2000);

            cell = headerRow.createCell(3);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(3, 3000);

            cell = headerRow.createCell(4);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(4, 6000);

            cell = headerRow.createCell(5);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(5, 2000);

            cell = headerRow.createCell(6);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(6, 2000);

            cell = headerRow.createCell(7);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(7, 2000);

            cell = headerRow.createCell(8);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(8, 20000);

            cell = headerRow.createCell(9);
            cell.setCellValue("");
            cell.setCellStyle(headerCellStyle);
            sheet.setColumnWidth(9, 20000);
        } catch(FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    
        /**
     * This method writes a file to the specified path.
     * 
     * @param outputFilePath
     *            the outputFilePath
     */
    public static void writeOutputFile(String outputFilePath) {
        
        try {
            File file = new File(outputFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            workbook.write(fileOutputStream);
            fileOutputStream.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
