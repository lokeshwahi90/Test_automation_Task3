package Trivago_Mars;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCase001 {
	

	@AfterTest
	public void closeBrowser(WebDriver driver){
		 driver.quit();
	}
	@Test
	public void TestCase001_ContactForm() throws InterruptedException {
		
		
		// Create a new instance of the Safari Webdriver
				WebDriver driver = new SafariDriver();
				
				//Launch the Online Trivago WebsitePage
				driver.manage().window().maximize();
				driver.get("http://room5.trivago.com/");     
		
                
                
              //Wait for 5 Seconds
				Thread.sleep(5000);
				
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				
				WebElement contactTag = driver.findElement(By.linkText("Contact"));
				contactTag.click();
				
				Thread.sleep(5000);
				System.out.println("It is working till the new contact page");
				
				driver.get("http://magazine.trivago.com/contact/");
				
				//Driver Switch to Next Tab
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));
		
				Thread.sleep(5000);
				
				WebElement textarea = driver.findElement(By.className("contact-msg"));
				textarea.sendKeys("hallo, test message from Selenium");	

				jse.executeScript("window.scrollBy(0,250)", "");  
				
				WebElement inputName = driver.findElement(By.className("contact-input")); 
				inputName.sendKeys("Lokesh");	
				
				WebElement inputEmail = driver.findElement(By.id("contact-email")); 
				inputEmail.sendKeys("lokesh@test.com");		
				
				WebElement inputCheck = driver.findElement(By.id("confirm")); 
				if (!inputCheck.isSelected())
                {                    
					inputCheck.click();
                }	
				
				System.out.println("Contact form is filled");	
		            
				WebElement submitButton = driver.findElement(By.className("contact-submit")); 
				submitButton.click();
				
				Thread.sleep(5000);
				
				WebElement msgElement = driver.findElement(By.className("feedback"));
			    //Validating the the Contact Form is submit successfully
				Assert.assertTrue(msgElement.isDisplayed(), "Contact Form was not submitted successfully");
				
				closeBrowser(driver);
            
      
	
	}
	

}
