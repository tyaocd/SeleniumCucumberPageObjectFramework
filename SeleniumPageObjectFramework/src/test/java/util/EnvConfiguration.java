package util;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class EnvConfiguration {
  
  public static WebDriver driver;
  
  @Before
  public void StartUp() {
    driver = new FirefoxDriver();
    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @After
  public void CleanUp() {
    driver.quit();
  }
}
