package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerBtn;
@FindBy(id="customerLightBox_nameField")
private WebElement customerNameTbx;
@FindBy(id="customerLightBox_descriptionField")
private WebElement customerDescTbx;
@FindBy(xpath="//button[contains(text(),'Select an active customer')]")
private WebElement companyDropdown;
@FindBy(xpath="//a[text()='Our Company']")
private WebElement ourCompanyBtn;
@FindBy(id="customerLightBox_commitBtn")
private WebElement createBtn;
@FindBy(xpath="//div[@id='taskListBlock']//div[@class='header']/div[@class='title ellipsis']")
private WebElement customerNamefield;
@FindBy(xpath="//div[@class='node customerNode selected']//div[@class='editButton available']")
private WebElement settingBtn;
@FindBy(xpath="//div[@class='customerNamePlaceHolder']/..//div[text()='ACTIONS']")
private WebElement actionBtn;
@FindBy(xpath="//div[text()='Delete']")
private WebElement deleteBtn;
@FindBy(id="customerPanel_deleteConfirm_submitTitle")
private WebElement permanentlyDeleteBtn;
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustomerBtn() {
	return newCustomerBtn;
}
public WebElement getCustomerNameTbx() {
	return customerNameTbx;
}
public WebElement getCustomerDescTbx() {
	return customerDescTbx;
}
public WebElement getCompanyDropdown() {
	return companyDropdown;
}
public WebElement getOurCompanyBtn() {
	return ourCompanyBtn;
}
public WebElement getCreateBtn() {
	return createBtn;
}
public WebElement getCustomerNamefield() {
	return customerNamefield;
}
public WebElement getSettingBtn() {
	return settingBtn;
}
public WebElement getActionBtn() {
	return actionBtn;
}
public WebElement getDeleteBtn() {
	return deleteBtn;
}
public WebElement getPermanentlyDeleteBtn() {
	return permanentlyDeleteBtn;
}








}
