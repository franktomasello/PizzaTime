import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SetUp
{
	private ChromeDriver driver;
	private ReadPropFile read;

	public SetUp() throws FileNotFoundException
	{
		this.driver = new ChromeDriver();
		this.read = new ReadPropFile();
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
	}



}
