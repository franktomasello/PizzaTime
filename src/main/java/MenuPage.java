import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class MenuPage {

	public static By pizzaStyleHandTossed()
	{
		return By.xpath("//a[contains(text(),'Hand Tossed')]");
	}

	//large pizza
	public static By pizzaSize()
	{
		return By.xpath("//span[@class='sizes-wrapper__size-code sizes-wrapper__size-code--2 sizes-wrapper__size-code--14']");
	}

	public static By noCheese()
	{
		return By.xpath("//span[contains(text(),'No Thanks')]");
	}

	public static By pepperoniButton()
	{
		return By.xpath("//input[@name='S_PIZZA|Topping|P']");
	}

	public static By halfPepperoni()
	{
		return By.xpath("//div[contains(@class,'RightActive portion')]");
	}

	public static By addToOrderButton()
	{
		return By.xpath("//button[@class='btn btn--large js-isNew js-addPizza btn--block c-order-addToOrder']");
	}

	public static By noThanksToSides()
	{
		return By.xpath("//button[@class='js-noThanks btn--link']");
	}

	public static By checkoutButton()
	{
		return By.xpath("")
	}



}
