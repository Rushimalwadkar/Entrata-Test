package homepage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.testbase.TestBase;
import com.waits.WaitFor;

public class HomePage extends TestBase {

	@Test
	public void verifyPropertyMangerButtonShouldVisibleAfterClickingOnSigningButton() {
		String expectedTitle = "Property Manager Login";
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]")).click();
		String accualTitle = driver
				.findElement(
						By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[1]"))
				.getText();
		Assert.assertEquals(accualTitle, expectedTitle);
	}

	@Test
	public void VerifyIfUsernameEnterAndPasswordKeepBlankThenPleaseEnterUsernameAndPasswordMassageShouldDisplayInPropertyManagerLoginUnderSignIn() {
		String expectedTitle = "Please enter username and password";
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"entrata-username\"]")).sendKeys("admin");
		WaitFor.withTimeOut(2);
		driver.findElement(By.xpath("//*[@id=\"fsm_request_demo\"]/ul/li[3]/button")).click();
		String accualTitle = driver.findElement(By.xpath("//*[@id=\"entrata-login-error\"]")).getText();
		Assert.assertEquals(accualTitle, expectedTitle);
	}

	@Test
	public void VerifyIfPasswordEnterAndUserNameKeepBlankThenPleaseEnterUsernameAndPasswordMassageShouldDisplayInPropertyManagerLoginUnderSignIn() {
		String expectedTitle = "Please enter username and password";
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"entrata-password\"]")).sendKeys("abc@123");
		WaitFor.withTimeOut(2);
		driver.findElement(By.xpath("//*[@id=\"fsm_request_demo\"]/ul/li[3]/button")).click();
		String accualTitle = driver.findElement(By.xpath("//*[@id=\"entrata-login-error\"]")).getText();
		Assert.assertEquals(accualTitle, expectedTitle);
	}

	@Test
	public void VerifyIfPasswordAndUserNameKeepBlankThenPleaseEnterUsernameAndPasswordMassageShouldDisplayInPropertyManagerLoginUnderSignIn() {
		String expectedTitle = "Please enter username and password";
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[1]"))
				.click();
		WaitFor.withTimeOut(2);
		driver.findElement(By.xpath("//*[@id=\"fsm_request_demo\"]/ul/li[3]/button")).click();
		String accualTitle = driver.findElement(By.xpath("//*[@id=\"entrata-login-error\"]")).getText();
		Assert.assertEquals(accualTitle, expectedTitle);
	}

	@Test
	public void verifyUsernameAndPasswordAreNotValidShouldDisplayAfterEnteringWrongDetailsInPropertyManagerLoginUnderSignIn() {
		String expectedTitle = "The username and password provided are not valid. Please try again.";
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"entrata-username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"entrata-password\"]")).sendKeys("abcd@1234");
		WaitFor.withTimeOut(2);
		driver.findElement(By.xpath("//*[@id=\"fsm_request_demo\"]/ul/li[3]/button")).click();
		String accualTitle = driver.findElement(By.xpath("//*[@id=\"statusMessage\"]")).getText();
		Assert.assertEquals(accualTitle, expectedTitle);
	}

	@Test
	public void verifyViewAppButtonGetsDisplayedAfterClickingResidentLoginButtonUnderSignIn() {
		String expectedTitle = "View the App";
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[2]"))
				.click();
		String accualTitle = driver.findElement(By.xpath("//*[@id=\"rpap-header\"]/div[2]/div/div[1]")).getText();
		Assert.assertEquals(accualTitle, expectedTitle);
	}

	@Test
	public void verifyViewWebsiteButtonGetsDisplayedAfterClickingResidentLoginButtonUnderSignIn() {
		String OriginalTitle = "View the Website";
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/div/div/div[1]/div/div[3]/a[2]"))
				.click();
		String ExpectedTitle = driver.findElement(By.xpath("//*[@id=\"rpap-header\"]/div[2]/div/div[2]")).getText();
		Assert.assertEquals(OriginalTitle, ExpectedTitle);
	}

}
