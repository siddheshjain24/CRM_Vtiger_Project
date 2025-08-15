package com.crm.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationsLink;
	
	@FindBy(linkText = "Calendar")
	private WebElement calendarLink;
	
	@FindBy(linkText = "Leads")
	private WebElement leadsLink;
	
	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getLastDropdown() {
		return lastDropdown;
	}

	@FindBy(linkText = "Products")
	private WebElement productsLink;
	
	@FindBy(linkText = "Documents")
	private WebElement documentsLink;
	
	@FindBy(linkText = "Email")
	private WebElement emailLink;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement troubleTicketsLink;
	
	@FindBy(linkText = "Dashboard")
	private WebElement dashboardLink;
	
	@FindBy(id = "qccombo")
	private WebElement lastDropdown;
	
	public WebElement getCalendarLink() {
		return calendarLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getDocumentsLink() {
		return documentsLink;
	}

	public WebElement getEmailLink() {
		return emailLink;
	}

	public WebElement getTroubleTicketsLink() {
		return troubleTicketsLink;
	}

	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLink;
	
	@FindBy(xpath = "//img[contains(@src,'user')]")
	private WebElement profileIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOrganizationsLink() {
		return organizationsLink;
	}

	public WebElement getProfileIcon() {
		return profileIcon;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}
}
