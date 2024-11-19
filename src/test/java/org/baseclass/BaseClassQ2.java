package org.baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseClassQ2 {
public static WebDriver driver;
    
	public static void browserLaunch() {
		driver=new ChromeDriver();
	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
	   
	public static void enterAppliUrl(String url) {
		driver.get(url);
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void elementSendKeys(WebElement element,String data) {
		element.sendKeys(data);
	}
	
	public static void elementClick(WebElement element) {
		element.click();
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static WebElement findLocatorById(String attributeValue) {
		WebElement element=driver.findElement(By.id(attributeValue));
		return element;
	}
	
	public static WebElement findLocatorByXpath(String attributevalue) {
		WebElement element=driver.findElement(By.xpath(attributevalue));
		return element;
	}
	
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public static byte[] screenshot() {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;
	}
	

}
