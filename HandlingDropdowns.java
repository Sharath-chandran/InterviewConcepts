import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdowns {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		
		//By using Index
		WebElement Dropdown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select Index = new Select (Dropdown1);
		Index.selectByIndex(1);
		
		//By using Text
		WebElement Dropdown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select Text = new Select (Dropdown2);
		Text.selectByVisibleText("Appium");
		
		
		
		
		
	}

}
