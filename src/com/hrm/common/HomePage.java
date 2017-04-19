package com.hrm.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcome;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	
	@FindBy(xpath="//b[.='Admin']")
	private WebElement  Admin_Menu;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	private WebElement Users_Menu;
	
	@FindBy(xpath="//a[.='user1']")
	private WebElement user;
	
	@FindBy(xpath="//b[.='PIM']")
	private WebElement  PIM_Menu;
	
	@FindBy(xpath="//b[.='Dashboard']")
	private WebElement  Dashboard_Menu;
	
	@FindBy(id="menu_admin_UserManagement")
	private WebElement UserManagement_menu;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmployee_Menu;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement employeeList_Menu;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement ok;
	
	@FindBy(id="btnDelete")
	private WebElement btnDelete;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement user_employeeName_txtbox;
	
	@FindBy(id="systemUser_userName")
	private WebElement user_userName_txtbox;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickWelCome(){
		waitTillElementIsVisible(welcome);
		welcome.click();
	}
	
	public void clickLogout(){
		waitTillElementIsVisible(logout);
		logout.click();
	}
	public void clickPIM_Menu(){
		waitTillElementIsVisible(PIM_Menu);
		PIM_Menu.click();
	}
	public void clickaddEmplyee_Menu(){
		waitTillElementIsVisible(addEmployee_Menu);
		addEmployee_Menu.click();
	}
	public void clickemployeeList_Menu(){
		waitTillElementIsVisible(employeeList_Menu);
		employeeList_Menu.click();
	}
	public void clickDelete(){
		waitTillElementIsVisible(btnDelete);
		btnDelete.click();
		
		
	}
public void clickOK_ofDeleteRecordPopup(){
	waitTillElementIsVisible(ok);
		ok.click();
	}
public void clickAdmin_Menu(){
	waitTillElementIsVisible(Admin_Menu);
	Admin_Menu.click();
}
public void clickUserManagement_Menu(){
	waitTillElementIsVisible(UserManagement_menu);
	UserManagement_menu.click();
}
public void clickUsers_Menu(){
	waitTillElementIsVisible(Users_Menu);
	Users_Menu.click();
}
public void clickuser(){
	waitTillElementIsVisible(user);
	user.click();
}
public void clickuser_employeeName_txtbox(){
	waitTillElementIsVisible(user_employeeName_txtbox);
	user_employeeName_txtbox.click();
}
public void clickSave(){
	waitTillElementIsVisible(btnSave);
	btnSave.click();
}
public void clickuser_userName_txtbox(){
	waitTillElementIsVisible(user_userName_txtbox);
	user_userName_txtbox.click();
}
}
