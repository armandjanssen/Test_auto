package hrvnext_h_crud_payroll_journal;

import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.fail;

import org.openqa.selenium.*;
import hrvnext_h_crud_payroll_journal.login;

public class geslpa_0_lpa1_t3_it2 extends login {
	
	  
  @Test( priority = 5 )
  public void testGESLPA0LPA1T3IT2() throws Exception {
  
    String rowInd = "2";
   
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

    Assert.assertNotEquals("true", driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_TYPAMT'])[" + rowInd + "]")).getAttribute("disabled"));
    Assert.assertTrue(driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_TYPAMT'])[" + rowInd + "]")).isDisplayed());
    // ERROR: Caught exception [ERROR: Unsupported command [fireEvent | xpath=(//input[@data-s-x3name='LPA1_TYPAMT'])[${rowInd}] | focus]]
    driver.findElement(By.xpath("(//div[input[@data-s-x3name='LPA1_TYPAMT']])[" + rowInd + "]//a[@data-s-picker='choice']")).click();
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

    System.out.println("Check combo box menu displayed:");
    Assert.assertTrue(isElementPresent(By.xpath("//div[@data-s-dialog-modal='false']")));
    driver.findElement(By.xpath("//a[@data-s-choice-item-title='None']")).click();
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
