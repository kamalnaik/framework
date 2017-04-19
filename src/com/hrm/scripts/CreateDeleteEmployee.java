package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.common.BaseTest;
import com.hrm.pages.AddEmployeePage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmployeeListPage;

import generics.Excel;

public class CreateDeleteEmployee extends BaseTest{
	//because of implicit login we have in homepage
	
	@Test
	public void testCreateDeleteEmployee() throws InterruptedException{
		String sheet="CreateDeleteEmployee";
		int stepCount=Excel.getRowCount(INPUT_PATH, sheet);
		for(int i=1;i<=stepCount;i++){
		String fn=Excel.getCellValue(INPUT_PATH, sheet, i, 0);
		String ln=Excel.getCellValue(INPUT_PATH, sheet, i, 1);
		//click PIM
		DashboardPage d=new DashboardPage(driver);
		d.clickPIM_Menu();
		
		//click Add Employee
		d.clickaddEmplyee_Menu();
		
		//click firstName
		AddEmployeePage a=new AddEmployeePage(driver);
		a.setfirstName(fn);
		//click lastName
		a.setlastName(ln);
		//click save
		a.clickSave();
		a.clickPIM_Menu();
		a.clickemployeeList_Menu();
		
		EmployeeListPage e=new EmployeeListPage(driver);
		e.verifyEmployeePresentInTable(fn);
		e.selectEmployeeCheckBox(fn);
//		e.clickDelete();
//		e.clickOK_ofDeleteRecordPopup();
		Thread.sleep(1000);
		e.verifyEmployeeNotPresentInTable(fn);
		Thread.sleep(1000);
		
	}

}
}
