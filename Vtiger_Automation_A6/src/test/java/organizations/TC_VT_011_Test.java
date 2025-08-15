package organizations;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.vtiger.genericutility.BaseClass;
import com.crm.vtiger.genericutility.ListenerUtility;
import com.crm.vtiger.objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_VT_011_Test extends BaseClass {

	@Test
	public void clickOnOrganization() {
		HomePage hp = new HomePage(driver);
		hp.getOrganizationsLink();
		Assert.assertTrue(driver.getTitle().contains("Organizations"));
		test.log(Status.PASS, "Organization page is displayed");
	}
}
