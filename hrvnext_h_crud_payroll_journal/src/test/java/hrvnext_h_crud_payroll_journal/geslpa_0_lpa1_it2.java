package hrvnext_h_crud_payroll_journal;

import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.fail;

import org.openqa.selenium.*;
import hrvnext_h_crud_payroll_journal.login;

public class geslpa_0_lpa1_it2 extends login {
	
	  
  @Test( priority = 4 )
  public void testGESLPA0LPA1IT2() throws Exception {
   
    System.out.println("Click button 'Create'");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[normalize-space(@data-s-menu-title)='Create' and not(contains(@class,'s-disabled'))]")).click();
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

   Assert.assertTrue(driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_DES'])")).isDisplayed());
    Assert.assertTrue(isElementPresent(By.xpath("(//input[@data-s-x3name='LPA1_DES'])[@maxlength>='9']")));
    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_DES'])")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_DES'])")).clear();
    Thread.sleep(500);
    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_DES'])")).sendKeys("Auto test");
    Thread.sleep(500);
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

  }


  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

}
