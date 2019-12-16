import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	private Properties prop;
	private FileInputStream fileInputStream;

	public ReadPropFile() throws FileNotFoundException
	{
		this.prop = new Properties();
		this.fileInputStream = new FileInputStream("C:\\Users\\frank\\Desktop\\PizzaTime\\src\\main\\java\\config.properties");
	}

	public String loadPropertyValue(String key) throws IOException
	{
		prop.load(fileInputStream);
		return prop.getProperty(key);
	}
}
