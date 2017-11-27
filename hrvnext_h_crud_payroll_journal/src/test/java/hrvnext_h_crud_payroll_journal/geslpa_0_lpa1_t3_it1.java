package hrvnext_h_crud_payroll_journal;

import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.fail;

import org.openqa.selenium.*;
import hrvnext_h_crud_payroll_journal.login;

public class geslpa_0_lpa1_t3_it1 extends login {
	
	  
  @Test( priority = 2 )
  public void testGESLPA0LPA1T3IT1() throws Exception {
  
    int rowInd = 0;
   
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
    rowInd = rowInd +1;
    Assert.assertNotEquals("true", driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_TYPAMT'])[" + rowInd + "]")).getAttribute("disabled"));
    Assert.assertTrue(driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_TYPAMT'])[" + rowInd + "]")).isDisplayed());
    Thread.sleep(500);
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
    driver.findElement(By.xpath("//a[@data-s-choice-item-title='Variable']")).click();
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

    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_TYPAMT'])[" + rowInd + "]")).sendKeys(Keys.TAB);
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

    Assert.assertTrue(driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_RUBCOD'])[" + rowInd + "]")).isDisplayed());
    Assert.assertTrue(isElementPresent(By.xpath("(//input[@data-s-x3name='LPA1_RUBCOD'])[" + rowInd + "][@maxlength>='10']")));
    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_RUBCOD'])[" + rowInd + "]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_RUBCOD'])[" + rowInd + "]")).clear();
    Thread.sleep(500);
    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_RUBCOD'])[" + rowInd + "]")).sendKeys("BASIC_RATE");
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
