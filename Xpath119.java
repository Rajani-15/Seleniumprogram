package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath119 {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Admin/Downloads/learningHTML1.html");
		
		
		
		WebElement e1=d.findElement(By.xpath("//input[@name='fname']"));
		e1.sendKeys("Rajani");
		Thread.sleep(3000);
		
		WebElement e2=d.findElement(By.xpath("//input[@value='Girl']"));
		e2.click();
		Thread.sleep(3000);
		
		WebElement e3=d.findElement(By.xpath("//input[@type='radio'][2]"));
		e3.click();
		Thread.sleep(3000);
		
		WebElement e4=d.findElement(By.tagName("a"));
		e4.click();
		Thread.sleep(3000);
		d.close();

	}

}
