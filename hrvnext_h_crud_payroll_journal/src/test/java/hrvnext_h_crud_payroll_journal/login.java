package hrvnext_h_crud_payroll_journal;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.fail;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class login {
	public login(){}
	public static WebDriver driver;
	  public String baseUrl;
	  public StringBuffer verificationErrors = new StringBuffer();

	@BeforeSuite
	public void setUp() throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\workshop\\Drivers\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");		
	    driver = new ChromeDriver( options);
	    baseUrl = "http://qax3pv12.sagefr.adinternal.com:8124/";
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	 }
	  
	  @BeforeTest
	
	  public void testLogin() throws Exception {
				 
			    String x3Usr = "XATC1";
			    String x3Pwd = "XATC1";	    
			    System.out.println("URL: " +baseUrl);
			    System.out.println("User login: " + x3Usr);
			    driver.get(baseUrl);
			 
			    driver.findElement(By.id("username")).click();
			    driver.findElement(By.id("username")).click();
			    driver.findElement(By.id("username")).clear();
			    driver.findElement(By.id("username")).sendKeys(x3Usr);
			    driver.findElement(By.id("password")).clear();
			    driver.findElement(By.id("password")).sendKeys(x3Pwd);
			    driver.findElement(By.id("go-basic")).click();
			    driver.findElement(By.xpath("//aside[@id='s-site-quality']")).getAttribute("data-s-local");  
			    Thread.sleep(1000);
			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("0".equals(driver.findElement(By.xpath("//aside[@id='s-site-quality']")).getAttribute("data-s-request-count"))) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("0".equals(driver.findElement(By.xpath("//aside[@id='s-site-quality']")).getAttribute("data-s-uilock"))) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    // ERROR: Caught exception [unknown command [if]]
			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("0".equals(driver.findElement(By.xpath("//aside[@id='s-site-quality']")).getAttribute("data-s-request-count"))) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("0".equals(driver.findElement(By.xpath("//aside[@id='s-site-quality']")).getAttribute("data-s-uilock"))) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    // ERROR: Caught exception [unknown command [endIf]]
			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("0".equals(driver.findElement(By.xpath("//aside[@id='s-site-quality']")).getAttribute("data-s-request-count"))) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("0".equals(driver.findElement(By.xpath("//aside[@id='s-site-quality']")).getAttribute("data-s-uilock"))) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("0".equals(driver.findElement(By.xpath("//aside[@id='s-site-quality']")).getAttribute("data-s-request-count"))) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }

			    for (int second = 0;; second++) {
			    	if (second >= 60) fail("timeout");
			    	try { if ("0".equals(driver.findElement(By.xpath("//aside[@id='s-site-quality']")).getAttribute("data-s-uilock"))) break; } catch (Exception e) {}
			    	Thread.sleep(1000);
			    }
			    Thread.sleep(1000);
		/////////////////////////	
	  }
	  
	  @AfterMethod
	  public void tearDown(ITestResult result)
	  	{
	
		  if(ITestResult.FAILURE==result.getStatus())
		  {
			  try 
			  {
	  // Create refernce of TakesScreenshot
	  TakesScreenshot ts=(TakesScreenshot)driver;	   
	  // Call method to capture screenshot
	  File source=ts.getScreenshotAs(OutputType.FILE);
	  
	  // Copy files to specific location here it will save all screenshot in our project home directory and
	  // result.getName() will return name of test case so that screenshot name will be same
	  FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
	  System.out.println("Screenshot taken");
			  } 
			  catch (Exception e)
			  {
				  
	  System.out.println("Exception while taking screenshot "+e.getMessage());
	  } 
	 }
  }

	@AfterSuite(alwaysRun = true)
	 public void tearDown() throws Exception {
		 System.out.println("Logout of System");   
		 Thread.sleep(1000);
		 Assert.assertTrue(driver.findElement(By.xpath("(//*[@id=\"s_app\"]/header/ul/li[6]/a)")).isDisplayed());   
		 driver.findElement(By.xpath("(//*[@id=\"s_app\"]/header/ul/li[6]/a)")).click();
		
		 Thread.sleep(1000);
		 Assert.assertTrue(driver.findElement(By.xpath("(//*[@id=\"s_app_over\"]/div/div/div/div/ul/li[4]/div/a/i)")).isDisplayed());
		 driver.findElement(By.xpath("(//*[@id=\"s_app_over\"]/div/div/div/div/ul/li[4]/div/a/i)")).click();
		 Thread.sleep(5000);
		 
		 System.out.println("Driver Quit");
	     driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	   fail(verificationErrorString);
	   }
	 }
}