package util;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.google.common.io.Files;

public class Help {

    /**
     * Scroll to the top of the page
     * @param driver
     */
    public static void ScrollTop(WebDriver driver) {
        JavascriptExecutor jsExe = (JavascriptExecutor)driver;
        jsExe.executeScript("window.scrollTo(0,0);");
    }


    /**
     * Scroll to the bottom of the page, ensure the page has loaded completely before execute this function.
     * @param driver
     */
    public static void ScrollBottom(WebDriver driver) {
        JavascriptExecutor jsExe = (JavascriptExecutor)driver;
        Long screenHeight = (Long) jsExe.executeScript("return document.body.scrollHeight;");
        String js = "window.scrollTo(0,"+Long.toString(screenHeight)+");";
        jsExe.executeScript(js);

    }

    /**
     * Scroll the screen to a WebElement
     * 
     * @param driver the webdriver need to be used
     * @param targetElement the target element that we need to scroll to.
     */
    public static void FocusElement(WebDriver driver, WebElement targetElement) {
        JavascriptExecutor javaExecutor = (JavascriptExecutor) driver;
        javaExecutor.executeScript("arguments[0].scrollIntoView();", targetElement);
    }

    /**
     * Take a screenshot for current webpage and store it in target/cucumber/screenshots folder. the
     * file name is fileName+shooting time
     * 
     * @param driver
     * @param fileName
     */
    public static void TakeScreenshot(WebDriver driver, String fileName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            String savePath = "target/cucumber/Screenshots/" + fileName + Long.toString(System.currentTimeMillis()) + ".png";
            // copy file to target directory
            Files.copy(scrFile, new File(savePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Highlight webelement by add a red border for it
     * @param driver
     * @param targetElement
     */
    public static void HighlightElement(WebDriver driver, WebElement targetElement) {
        JavascriptExecutor jsExe = (JavascriptExecutor) driver;
        jsExe.executeScript("arguments[0].setAttribute('style','outline:3px solid #f00;');", targetElement);
    }
    
    
}
