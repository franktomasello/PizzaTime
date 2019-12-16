import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SetUp
{
	public ChromeDriver driver;
	public ReadPropFile read;

	public SetUp() throws FileNotFoundException
	{
		this.driver = new ChromeDriver();
		this.read = new ReadPropFile();
	}

	public ChromeDriver getDriver() {
		return driver;
	}

	public void setDriver(ChromeDriver driver) {
		this.driver = driver;
	}

	public ReadPropFile getRead() {
		return read;
	}

	public void setRead(ReadPropFile read) {
		this.read = read;
	}

	public void goToURL() throws IOException
	{
		String URL = read.loadPropertyValue("pizza_URL");
		driver.get(URL);
	}

	public void inputStoreValues() throws IOException
	{
		driver.findElement(StoreLocatorPage.streetAddressInputField()).click();
		driver.findElement(StoreLocatorPage.streetAddressInputField()).sendKeys(read.loadPropertyValue("street_Address"));
		driver.findElement(StoreLocatorPage.zipCodeInputField()).click();
		driver.findElement(StoreLocatorPage.zipCodeInputField()).sendKeys(read.loadPropertyValue("zip_Code"));
		driver.findElement(StoreLocatorPage.continueDeliveryButton()).click();
		driver.findElement(MenuPage.pizzaStyleHandTossed()).click();
		driver.findElement(MenuPage.pizzaSize()).click();
		driver.findElement(MenuPage.noCheese()).click();
		driver.findElement(MenuPage.pepperoniButton()).click();
		driver.findElement(MenuPage.halfPepperoni()).click();
		driver.findElement(MenuPage.addToOrderButton()).click();
		driver.findElement(MenuPage.noThanksToSides()).click();
	}




}
