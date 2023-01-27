package test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstAutomationScript 
{

	public static void main(String[] args) 
	{
		System.out.println("Inside project");
		//Set the chromedriver path
		System.setProperty
		("webdriver.chrome.driver", 
				"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        
		/*
		 //Set the edgedriver path
		System.setProperty
		("webdriver.edge.driver", 
				"C:\\Drivers_New\\BrowserDrivers\\edgedriver_win64\\msedgedriver.exe");
        
		//Set the firefox driver path
				System.setProperty
				("webdriver.gecko.driver", 
						"C:\\Drivers_New\\BrowserDrivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		*/
		
		//Calling the chromedriver
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		//Calling the edge driver
	   // WebDriver driver = new EdgeDriver();
				
				
		//Calling the edge driver
		//WebDriver driver = new FirefoxDriver();

		/*
		//Open browser
		driver.get("http://adactinhotelapp.com");
		//Navigate to a different site
		driver.navigate().to("http://google.com");
		//Navigate back to the first link and back to second link
		driver.navigate().back();
		driver.navigate().forward();
		//Refresh the page
		driver.navigate().refresh();
		//Close browser - 2 ways
		driver.close();
		//driver.quit(); */
		
		
		//Open browser
		driver.get("http://adactinhotelapp.com");
		
		
		//find the user name element
		WebElement uName = driver.findElement(By.id("username"));  
		uName.sendKeys("TPillai567");
				
		//find the password element and enter the password directly
		driver.findElement(By.id("password")).sendKeys("Pillai123");
		
		//Click n the register link by class
		//driver.findElement(By.cssSelector(".login_register")).click();
		
		//Click n the login button link by tag and id
		//driver.findElement(By.cssSelector("input#login")).click();
		
		//Click n the login button link by tag and class
		//driver.findElement(By.cssSelector("input.login_button")).click();
		
		//Click n the login button link by tag and name attribute
		//driver.findElement(By.cssSelector("input[name=login]")).click();

		//Click n the login button link by tag and class and 'type' attribute
		//driver.findElement(By.cssSelector("input.login_button[type=Submit]")).click();
		
		//Click n the login button link by tag and class and 'value' attribute
		driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();

		//Drop down - 3 methods to select the elements - LOCATION
		//new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
		//new Select(driver.findElement(By.className("search_combobox"))).selectByIndex(3);
		new Select(driver.findElement(By.className("search_combobox"))).selectByVisibleText("Melbourne");

        
		//Drop down - HOTELS
		new Select(driver.findElement(By.cssSelector("#hotels.search_combobox"))).selectByValue("Hotel Sunshine");

		//Drop down - ROOMTYPE
		new Select(driver.findElement(By.cssSelector("select[name=room_type]"))).selectByValue("Double");
		
		
		//click on Search
		driver.findElement(By.id("Submit")).click();
		
		//Radio button on next page
		driver.findElement(By.id("radiobutton_0")).click();
		
		//Click on any hyperlink above
		driver.findElement(By.linkText("Booked Itinerary")).click();
		
		driver.findElement(By.partialLinkText("Search")).click();
		
		
		//driver.quit();

	}

}
