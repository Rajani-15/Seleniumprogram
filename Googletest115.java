package SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googletest115 {

	public static void main(String[] args) 
	{
		int count=0;
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			count++;
			
		}
		System.out.println("Total link="+count);
		
		for(WebElement e1:links)
		{
			String stext=e1.getText();
			String surl=e1.getAttribute("href");
			System.out.println("Text:"+stext+"  "+"URL="+surl);
		
		}
		
		
	}

}
