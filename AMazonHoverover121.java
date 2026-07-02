package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AMazonHoverover121 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver f=new ChromeDriver();
		f.get("https://www.amazon.in/");
		f.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e1=f.findElement(By.xpath("//span[text()=\"Fresh\"]"));
		
		Actions a1=new Actions(f);
		a1.moveToElement(e1).perform();	
		
		WebElement e2=f.findElement(By.xpath("//img[@class=\"f3-cgi-flyout-store-img\"][2]"));
		a1.clickAndHold(e2).perform();
		
	}

}
