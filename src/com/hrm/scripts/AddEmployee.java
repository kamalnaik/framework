package com.hrm.scripts;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hrm.common.BaseTest;
import com.hrm.pages.CreateEmployee;

public class AddEmployee extends BaseTest {
//	public AddEmployee(){
//		loginRequired=true;
//		logoutRequired=true;
//		}
	@Test
	@Parameters("browsers")
	public void testAddEmployee(){
		CreateEmployee c=new CreateEmployee(driver);
		c.Pim();
		c.Add();
		c.firstName();
		c.lastName();
		c.save();
		//c.verifyCreatedUser();
		c.EmployeeList();
		c.selectAll();
		c.delete();
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
		c.popup();
	}
}