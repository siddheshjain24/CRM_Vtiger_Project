package contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.vtiger.genericutility.BaseClass;
import com.crm.vtiger.genericutility.ListenerUtility;
import com.crm.vtiger.objectrepository.ContactsPage;
import com.crm.vtiger.objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_VT_003_Test extends BaseClass{
	@Test
	public void createContactWithOrganization() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getContactsLink().click();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateIcon().click();
		cp.getLastnameTextField().sendKeys(eutil.getStringDataFromExcel("Contacts", 1, 0));
		cp.getOrganizationSelectIcon().click();
		
		wutil.switchToWindow(driver, "Accounts&action");
		cp.getFirstOrganization().click();
		
		wutil.switchToWindow(driver, "Contacts&action");
		cp.getSaveButton().click();
		Assert.assertTrue(cp.getHeaderText().isDisplayed());
		test.log(Status.PASS, "Contact has been created with organization name");
	}
}
