package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexample117 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
        driver.get("file:///D:/Seleniumpractice/learningHTML1.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement e1=driver.findElement(By.xpath("/html/body/form/input"));
        e1.sendKeys("Rajani");

	}

}
