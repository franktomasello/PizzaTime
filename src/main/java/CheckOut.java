import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class CheckOut extends SetUp {


	public CheckOut() throws FileNotFoundException {
	}

	public void checkout()
	{
		driver.findElement(By.xpath(MenuPage.addToOrderButton())
	}
}
