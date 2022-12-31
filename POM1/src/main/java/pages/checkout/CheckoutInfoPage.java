package pages.checkout;

import org.openqa.selenium.By;

import base.TestBase;

public class CheckoutInfoPage extends TestBase {

	public void getCheckOutHeader() {

		driver.findElement(By.cssSelector("span.title")).getText();

	}

	public void enterCustomerDetails(String firstName, String lastName, String postalCode) {

		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(lastName);
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys(postalCode);

	}

	public void goToCheckOutOverviewPage() {
		driver.findElement(By.cssSelector("input[name='continue']")).click();
	}
	
	
	
}
