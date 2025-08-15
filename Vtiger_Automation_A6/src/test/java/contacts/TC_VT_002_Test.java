package contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.vtiger.genericutility.BaseClass;
import com.crm.vtiger.genericutility.ListenerUtility;
import com.crm.vtiger.objectrepository.ContactsPage;
import com.crm.vtiger.objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_VT_002_Test extends BaseClass{
	@Test
	public void createContact() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getContactsLink().click();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateIcon().click();
		cp.getLastnameTextField().sendKeys(eutil.getStringDataFromExcel("Contacts", 1, 0));
		cp.getSaveButton().click();
		Assert.assertEquals(cp.getHeaderText().isDisplayed(), true);
		test.log(Status.PASS, "Contact has been created with last name");
	}
}
