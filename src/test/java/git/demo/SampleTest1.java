package git.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SampleTest1 {
	
	public WebDriver driver;
	
	
  
  @BeforeTest
  public void beforeTest() {
	  
	  ChromeOptions chromeOptions = new ChromeOptions();
	  driver = new ChromeDriver(chromeOptions);
	  
	  driver.get("Https://www.google.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
  }
  
  @Test
  public void test1() throws InterruptedException {
    System.out.println("Selenium Git Test1########");
    driver.findElement(By.name("q")).sendKeys("selenium grid\n");
    System.out.println("Wait for 3s");
    System.out.println("=== Adding for pipe version ===");
    Thread.sleep(3000);
    
  }

  @AfterTest
  public void afterTest() {	
	  driver.close();
	  driver.quit();
  }

}
