package com.mvsk.smc.controller;

import java.io.File; 
import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import 
org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mvsk.smc.entities.Stock;
import com.mvsk.smc.service.ExcelService;


@Controller
public class ImportExcelController {

	@Autowired
	private ExcelService excelService;
	
	@GetMapping("/importExcel")
	ResponseEntity<Void> importExcel()
	    {
		ResponseEntity<Void> response = new ResponseEntity<>(HttpStatus.ACCEPTED);;
Stock stock = null;
		 
	        try
	        {
	            FileInputStream file = new FileInputStream(new File("stock.xlsx"));
	 
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            //Iterate through each rows one by one
	            Iterator<Row> rowIterator = sheet.iterator();
	            while (rowIterator.hasNext())
	            {
	                Row row = rowIterator.next();
	                //For each row, iterate through all the columns
	                Iterator<Cell> cellIterator = row.cellIterator();
	                 
	                Cell cell = cellIterator.next();
	                
	               int stock_id =  (int) cell.getNumericCellValue()	   ;      
	               
	                cell = cellIterator.next();
	                
	                
	                
	               int current_price =  (int) cell.getNumericCellValue()	   ;  
	               
	                cell = cellIterator.next();

	               
	               Date dateD = cell.getDateCellValue();
	               LocalDate date = LocalDate.ofInstant(dateD.toInstant(), ZoneId.systemDefault());
	                cell = cellIterator.next();

	               String  company_name = cell.getRichStringCellValue().getString();
	              
	                cell = cellIterator.next();
	                
	                int stock_exchange_id = (int) cell.getNumericCellValue()	   ;
	                
	              stock = new Stock(stock_id,company_name,stock_exchange_id,current_price,date);
	                System.out.println(stock_id);
	                System.out.println(current_price);
	                System.out.println(date);
	                System.out.println(company_name);
	                System.out.println(stock_exchange_id);
	                System.out.println(stock);
	                excelService.save(stock);

	                
	               
	               	            }
	            file.close();
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }


			return response;
	    }
	/*
	 * public void store(Stock stock) { excelService.save(stock); }
	 */
}
