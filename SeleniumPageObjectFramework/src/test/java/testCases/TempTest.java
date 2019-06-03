package testCases;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BaiduHome;
import util.EnvConfiguration;
import util.Help;

public class TempTest {

    @Test
    public void testPageObject() {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");
        BaiduHome baiduHome = BaiduHome.getPage(driver);
        try {
            baiduHome.typeSearchInput("Selenium");
            baiduHome.clickSearchButton();
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    @Test
    public void testFocusElement() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://blog.csdn.net/touziss/article/details/81913951");
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-readmore")));
        WebElement readmore = driver.findElement(By.id("btn-readmore"));
        Help.FocusElement(driver, readmore);
        readmore.click();
        Help.TakeScreenshot(driver, "ReadMore");
        WebElement picture = driver.findElement(By.id("comment_content"));
        Help.FocusElement(driver, picture);
        driver.quit();
    }
    
    @Test
    public void testScrollDown() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
//        driver.get("https://blog.csdn.net/jack_zengzhen/article/details/79013841");
        driver.get("https://weibo.com/");
        new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.id("base_scrollToTop")));
        System.out.println(((JavascriptExecutor)driver).executeScript("return document.documentElement.scrollHeight;"));
        System.out.println(((JavascriptExecutor)driver).executeScript("return document.body.scrollHeight;"));

        //        Help.ScrollDown(driver);
    }
    
    @Test
    public void testHighlightElement() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
        driver.get("http://www.baidu.com");
        WebElement searchBox = driver.findElement(By.id("kw"));
        Help.HighlightElement(driver, searchBox);
        Help.TakeScreenshot(driver, "highlightSearchBox");
        driver.quit();
    }

    @Test
    public void printStars() {
        int i = 5;
        while (i>0) {
            int j=i;
            while (j>0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
    }
    
    @Test
    public void tetList() {
        ArrayList mylist = new ArrayList();
        mylist.add("ddd");
        mylist.add("bbb");
        mylist.add("abc");
        Iterator it = mylist.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(((String) obj));
        }
    }
    
    @Test
    public void testString() {
        String a = "hello2";
        String b = "hello";
        String c = b+2;
        System.out.println(c);
        System.out.println(a==c);
    }
    
    @Test
    public void findAppearMost() {
        String sampleString = "this is.my test string,it   is long";
        String[] splitStr = sampleString.split("[ ]+|,|\\.");
        for (int i = 0;i<splitStr.length;i++) {
            System.out.print(splitStr[i]);
        }
        TreeMap<String,Integer> wordCount = new TreeMap<String,Integer>();
        for(String str:splitStr) {
            if(wordCount.containsKey(str)) {
                wordCount.put(str, wordCount.get(str)+1);
            }
            else {
                wordCount.put(str, 1);
            }
        }
        System.out.println(wordCount);
        System.out.println(wordCount.firstKey()+wordCount.get(wordCount.firstKey()));
        
    }
}

final class utilClass {
    
}


