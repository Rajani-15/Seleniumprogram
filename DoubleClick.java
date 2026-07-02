package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
    {
            ChromeDriver driver=new ChromeDriver();
            driver.get("https://grotechminds.com/registeration-form/");
            Thread.sleep(3000);
            driver.manage().window().maximize();
            WebElement e1=         driver.findElement(By.id("firstName"));
            e1.sendKeys("Manish");
            Thread.sleep(2000);
            
            Actions a1=new Actions(driver);
            a1.doubleClick(e1).perform();
            
    
    }

}
