package organizations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.vtiger.genericutility.BaseClass;
import com.crm.vtiger.genericutility.ListenerUtility;
import com.crm.vtiger.objectrepository.HomePage;
import com.crm.vtiger.objectrepository.OrganizationsPage;

@Listeners(ListenerUtility.class)
public class TC_VT_012_Test extends BaseClass{

	@Test
	public void createOraganzation() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsLink().click();
		
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getCreateIcon().click();
		int number = jutil.getRandomNumber();
		op.getOrganizationNameTextField().sendKeys(eutil.getStringDataFromExcel("Orgnanizations", 1, 0)+number);
		op.getSaveButton().click();
		Assert.assertTrue(op.getHeaderText().getText().contains(eutil.getStringDataFromExcel("Orgnanizations", 1, 0)));
		test.log(Status.PASS, "Organization is created with mandatory field");
	}
}
