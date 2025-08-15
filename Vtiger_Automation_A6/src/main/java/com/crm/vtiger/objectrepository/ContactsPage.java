package com.crm.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createIcon;
	
	@FindBy(name  = "lastname")
	private WebElement lastnameTextField;
	
	@FindBy(xpath  = "(//input[@name='button'])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headerText;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement OrganizationSelectIcon;
	
	@FindBy(id = "1")
	private WebElement firstOrganization;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateIcon() {
		return createIcon;
	}

	public WebElement getOrganizationSelectIcon() {
		return OrganizationSelectIcon;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getFirstOrganization() {
		return firstOrganization;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getHeaderText() {
		return headerText;
	}
}
