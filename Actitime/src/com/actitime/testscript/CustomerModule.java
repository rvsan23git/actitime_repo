package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass {
	
@Test
	public void createAndDeleteCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	int time=2000;
	Thread.sleep(time);
		HomePage h=new HomePage(driver);Thread.sleep(time);
	     h.setTask();Thread.sleep(time);
	     TaskListPage t=new TaskListPage(driver);Thread.sleep(time);
	     t.getAddNewBtn().click();Thread.sleep(time);
	     t.getNewCustomerBtn().click();Thread.sleep(time);
	    String customerName = f.readDataFromExcel("CreateAndDeleteCustomer", 1, 1);Thread.sleep(time);
	    String description = f.readDataFromExcel("CreateAndDeleteCustomer", 1, 2);Thread.sleep(time);
	    
	     t.getCustomerNameTbx().sendKeys(customerName);Thread.sleep(time);
	     t.getCustomerDescTbx().sendKeys(description);Thread.sleep(time);
	     t.getCompanyDropdown().click();Thread.sleep(time);
	     t.getOurCompanyBtn().click();Thread.sleep(time);
	     t.getCreateBtn().click();Thread.sleep(time);
	    String actualText = t.getCustomerNamefield().getText();Thread.sleep(time);
	    Assert.assertEquals(actualText, actualText);Thread.sleep(time);
	    t.getSettingBtn().click();Thread.sleep(time);
	    t.getActionBtn().click();Thread.sleep(time);
	    t.getDeleteBtn().click();Thread.sleep(time);
	    t.getPermanentlyDeleteBtn().click();Thread.sleep(time);
	     
	
		
	}

}
