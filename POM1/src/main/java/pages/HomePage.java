package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;

public class HomePage extends TestBase {
//	public WebDriver driver;
//
	public boolean getLogo() {

		return driver.findElement(By.cssSelector("div.app_logo")).isDisplayed();

	}

	public String getProductHeader() {

		String prodHeader = driver.findElement(By.cssSelector("span.title")).getText();
		return prodHeader;
	}

	public void selectProduct() {
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
	}

	public void navigateToCartPage() {

		driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
	}

}
