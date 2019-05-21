package testCases;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import pageObjects.BaiduHome;

public class TempTest {

  @Test
  public void test() {

    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.baidu.com");
    BaiduHome baiduHome = new BaiduHome(driver);
    try {
      baiduHome.typeSearchInput("Selenium");
      baiduHome.clickSearchButton();
    }catch(Exception e) {
      e.printStackTrace();
    }
    
    driver.quit();
  }

}
