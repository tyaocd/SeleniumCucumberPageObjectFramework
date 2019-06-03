package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import net.bytebuddy.asm.Advice.This;
import util.EnvConfiguration;

public class BaiduHome {
    //lazy loading, only generate instance when needed. save the memory
    private static BaiduHome baiduHome;
    WebDriver driver;

    @FindBy(id = "kw")
    private WebElement searchInput;

    @FindBy(id = "su")
    private WebElement searchButton;

    //private the constructor, so no body can initialize the instance.
    private BaiduHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    //Singleton Pattern to ensure one page only has one instance 
    public static BaiduHome getPage(WebDriver driver) {
        if (baiduHome == null) {
            baiduHome = new BaiduHome(driver);
        }
        return baiduHome;
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
