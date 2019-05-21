package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import net.bytebuddy.asm.Advice.This;

public class BaiduHome {
  WebDriver driver;
  
  @FindBy(id="kw")
  private WebElement searchInput;
  
  @FindBy(id="su")
  private WebElement searchButton;
  
  public BaiduHome(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver,this);
  }
  
  public WebElement getSearchInput() {
    return searchInput;
  }
  
  public void typeSearchInput(String searchWords) {
    searchInput.sendKeys(searchWords);
  }

  public void clickSearchButton() {
    searchButton.click();
  }
}
