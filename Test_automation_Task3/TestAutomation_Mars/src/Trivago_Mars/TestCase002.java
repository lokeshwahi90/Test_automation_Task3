package Trivago_Mars;


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


public class TestCase002 {
	
	@AfterTest
	public void closeBrowser(WebDriver driver){
		 driver.quit();
	}
	@Test
	public void TestCase002_SubscribeNewsletter() throws InterruptedException {
		
		// Create a new instance of the ChromeDriver driver
		WebDriver driver = new SafariDriver();

        //Launch the Online Store WebsitePage
	
        driver.get("http://room5.trivago.com/");
        driver.manage().window().maximize();
        
      //Wait for 5 Seconds
		Thread.sleep(5000);
        //JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver. //https://www.guru99.com/execute-javascript-selenium-webdriver.html
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(5000);
		
		WebElement inputCheck = driver.findElement(By.id("confirm")); 
		if (!inputCheck.isSelected())
        {                    
			inputCheck.click();
        }	
		
		Thread.sleep(5000);
		
		WebElement EmailField = driver.findElement(By.className("et-email"));
		EmailField.sendKeys("alfardo20@gmail.com");
		
		Thread.sleep(5000);
		
		WebElement submitButton = driver.findElement(By.className("submit")); 
		submitButton.click();
		
		Thread.sleep(5000);
		
		WebElement msgElement = driver.findElement(By.className("newsletter"));
		
		//Validating the Newsletter is subscrib by the user 
		Assert.assertTrue(msgElement.isDisplayed(), "Subscription was not Successful");
		
		closeBrowser(driver);
	}

}
