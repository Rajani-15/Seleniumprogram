package SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownkeyfunction125 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		Thread.sleep(4000);
	
		WebElement e1=d.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(e1);
		
		for(WebElement op:s1.getOptions())
		{
	
				op.click();
				Thread.sleep(2000);
		}
		
		
	}

}
