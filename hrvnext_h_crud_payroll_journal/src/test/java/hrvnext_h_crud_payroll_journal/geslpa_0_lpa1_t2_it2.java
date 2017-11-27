package hrvnext_h_crud_payroll_journal;

import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.fail;

import org.openqa.selenium.*;
import hrvnext_h_crud_payroll_journal.login;

public class geslpa_0_lpa1_t2_it2 extends login {
	
	  
  @Test( priority = 6 )
  public void testGESLPA0LPA1T2IT2() throws Exception {
   
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

    // ERROR: Caught exception [ERROR: Unsupported command [isEditable | xpath=(//input[@data-s-x3name='LPA1_CRI'])[${rowInd}] | ]]
    Assert.assertTrue(driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_CRI'])[" + rowInd + "]")).isDisplayed());
    Assert.assertTrue(isElementPresent(By.xpath("(//input[@data-s-x3name='LPA1_CRI'])[" + rowInd + "][@maxlength>='18']")));
    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_CRI'])[" + rowInd + "]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_CRI'])[" + rowInd + "]")).clear();
    Thread.sleep(500);
    driver.findElement(By.xpath("(//input[@data-s-x3name='LPA1_CRI'])[" + rowInd + "]")).sendKeys("[F:HRCTR]BUICODJOB");
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
