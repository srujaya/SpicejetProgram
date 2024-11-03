package com.spicejet.tests;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.spicejet.utils.SeWrappersJet;

import com.spicejet.utils.Reports;

import com.spicejet.utils.JetWrappers;

public class LoginJet extends SeWrappersJet
{
	JetWrappers je=new JetWrappers();
	SeWrappersJet se= new SeWrappersJet();
	
	@DataProvider(name="SpicejetData")
	public Object[][] readExcel() throws IOException
	{
		Object[][] data=null;
		XSSFWorkbook workbook=null;
	  
		try
		{
			
			workbook= new XSSFWorkbook(System.getProperty("user.dir")+"/spicejet.xlsx");	
			XSSFSheet sheet= workbook.getSheetAt(0);
			XSSFRow row= sheet.getRow(0);
			
			int noOfRows=sheet.getPhysicalNumberOfRows();
			
			int noOfCells= row.getPhysicalNumberOfCells();
			
			data= new Object[noOfRows-1][noOfCells]; //data[5][2]
			
			for(int i=1; i<noOfRows;i++)
			{
				for(int j=0; j<noOfCells;j++)
				{
					String cellValue=sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println("Cell Value -->"+cellValue);
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			workbook.close();
		}
		
		return data;
	}
	
	@Test(priority=1,dataProvider="SpicejetData")
	public void SpiceJetLoginTestCases()
	{
		try
		{
			Reports.startReport();
			Reports.setTCDesc("Valid Spicejet Login functionality");
			launchBrowser("https://www.spicejet.com/");			//launch browser test case
			je.loginSpicejet();			//login to spicejet test case
			screenshot("loginpage");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@Test(priority=2)
	
	public void SpiceJetInvalidLoginTestCase()
	{
		try
		{
			Reports.startReport();
			Reports.setTCDesc("Valid Spicejet Login functionality");
			launchBrowser("https://www.spicejet.com/");			//launch browser test case
			je.invalidLogin();		
			screenshot("invalidloginpage");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test(priority=3)
	
	public void Roundtrip()
	{
		try
		{
			Reports.startReport();
			Reports.setTCDesc("roundtrip flight search ");
			launchBrowser("https://www.spicejet.com/");			//launch browser test case
			je.loginSpicejet();									//login to spicejet test case
			
			je.RoundTripFlight();
		
			screenshot("roundTrip Flight search");
			je.bookingFlights();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	@Test(priority=4)
	
	public void OnewayFlight()
	{
		Reports.startReport();
		Reports.setTCDesc("Valid Spicejet Login functionality");
		launchBrowser("https://www.spicejet.com/");			//launch browser test case
		je.loginSpicejet();
		je.oneWayFlight();
		je.bookingFlights();
		screenshot("Flightbook");
	}
	
	
	@Test(priority=5)
	
	public void flightStatus() throws InterruptedException
	{
		launchBrowser("https://www.spicejet.com/");			
		je.loginSpicejet();	
		je.FlightStatus();
	}
}	