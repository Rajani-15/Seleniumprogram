package SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath116 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("file:///D:/Seleniumpractice/learningHTML1.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
         
        List<WebElement> e1=driver.findElements(By.tagName("input"));
        int count=e1.size();
        System.out.println("Total link="+count);
        for(int i=0;i<count;i++)
        {
        	System.out.println("Attribute:"+i+e1.get(i).getAttribute("type"));
        	
        }
        
	}
	

}
