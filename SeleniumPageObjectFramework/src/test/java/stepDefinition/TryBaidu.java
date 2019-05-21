package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.BaiduHome;
import util.EnvConfiguration;

public class TryBaidu {
  
//  public WebDriver driver = new FirefoxDriver();
  private WebDriver driver = EnvConfiguration.driver;
  BaiduHome baiduHome = new BaiduHome(driver);
  
  @Given("open baidu home page")
  public void open_baidu_home_page() {
      // Write code here that turns the phrase above into concrete actions
      driver.get("http://www.baidu.com");
  }
  
  @Given("input {string} in search box")
  public void input_in_search_box(String string) {
    // Write code here that turns the phrase above into concrete actions
    baiduHome.typeSearchInput(string);
    }

  @Given("I click the search button")
  public void i_click_the_search_button() {
      // Write code here that turns the phrase above into concrete actions
      baiduHome.clickSearchButton();
  }
  
  @Then("{string} shows in every search result")
  public void shows_in_every_search_result(String string) {
      // Write code here that turns the phrase above into concrete actions
      
  }
}
