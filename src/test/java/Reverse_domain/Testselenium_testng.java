package Reverse_domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.ref.WeakReference;

public class Testselenium_testng {



    //@Test
    @Test
    public void test_testng(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(),"VWO login");

        driver.quit();
    }
}
