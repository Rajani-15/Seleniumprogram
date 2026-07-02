package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xapath118 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Admin/Downloads/learningHTML1.html");
		
		WebElement e1=d.findElement(By.xpath("//input[@name='fname']"));
		e1.sendKeys("Rajani");
		Thread.sleep(3000);
		d.quit();
		
		

	}

}
