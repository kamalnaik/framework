package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.hrm.common.BasePage;
import com.sun.media.jfxmedia.logging.Logger;

public class CreateEmployee extends BasePage{
	@FindBy(xpath="//a[.='PIM']")
	private WebElement PIM;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement Add;
	

	@FindBy(id="firstName")
	private WebElement firstName;


	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="btnSave")
	private WebElement save;

	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement EmployeeList;
	
	@FindBy(xpath="//a[.='kamal']")
	private WebElement verifyCreatedUser;
	
	@FindBy(id="btnDelete")
	private WebElement delete;
	
	@FindBy(id="ohrmList_chkSelectAll")
	private WebElement selectAll;
	
	@FindBy(id="dialogDeleteBtn")
    private	WebElement popup;
	


	 public CreateEmployee(WebDriver driver){
		 super(driver);
		 PageFactory.initElements(driver, this);
		 
	 }
	 public void Pim(){
		 PIM.click();
	 }
	 public void Add(){
		 Add.click();
	 }
	 public void firstName(){
		 firstName.sendKeys("kamal");
		 String k=firstName.getText();
		 Reporter.log(k,true);
	 }
	 public void lastName(){
		 lastName.sendKeys("Naik");
	 }
	 public void save(){
		 save.click();
	 }
	 public void EmployeeList(){
		 EmployeeList.click();
	 }
//	 public void verifyCreatedUser(){
//		String s=verifyCreatedUser.getText();
//		log.info(s);
//		 Assert.assertEquals("kamal", );
//        //log.info(firstName);

	//}
   public void selectAll(){
	selectAll.click();
	
}
   public void delete(){
	   delete.click();
   }
   public void popup(){
	   popup.click();
   }
	
}


