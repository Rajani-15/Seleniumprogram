package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googledoubleclick {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=d.findElement(By.xpath("//a[@aria-label=\"Gmail \"]"));
		Actions a1=new Actions(d);
		a1.contextClick(e1).perform();
		
	}

}
