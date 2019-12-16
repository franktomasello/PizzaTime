import org.openqa.selenium.By;

public class StoreLocatorPage
{
	public static By streetAddressInputField()
	{
		return By.xpath("//input[@id='Street']");
	}

	public static By zipCodeInputField()
	{
		return By.xpath("//input[@id='Postal_Code_Sep']");
	}

	public static By continueDeliveryButton()
	{
		return By.xpath("//button[@class='btn btn--large btn--search-location js-search-cta c-locationsearch-search-cta']");
	}
}
