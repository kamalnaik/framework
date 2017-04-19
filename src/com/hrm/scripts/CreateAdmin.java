package com.hrm.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hrm.common.BaseTest;
import com.hrm.common.HomePage;

import generics.Excel;

public class CreateAdmin extends BaseTest{
	@Test
	public void testCreatAdmin() throws InterruptedException{
//	String sheet="CreateAdmin";
//	int stepCount=Excel.getRowCount(INPUT_PATH, sheet);
//	for(int i=1;i<=stepCount;i++){
//	String fn=Excel.getCellValue(INPUT_PATH, sheet, i, 0);
//	String ln=Excel.getCellValue(INPUT_PATH, sheet, i, 1);
		HomePage h=new HomePage(driver);
		h.clickAdmin_Menu();
		h.clickUserManagement_Menu();
		h.clickUsers_Menu();
		h.clickuser();
		h.clickSave();
		h.clickuser_employeeName_txtbox();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Kamal");
		h.clickuser_userName_txtbox();
		driver.findElement(By.id("systemUser_userName")).sendKeys("kamal11111");
		h.clickSave();
	}
	
	}

	
