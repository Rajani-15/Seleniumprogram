package SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googletest114 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		
		
		if(links.size()>1)
			System.out.println("Second link="+links.get(1).getText());
		else
			System.out.println("other links");
		Thread.sleep(6000);
		d.close();		
	}

}
