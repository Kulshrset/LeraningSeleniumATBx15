package Reverse_domain;

import com.google.common.annotations.VisibleForTesting;
import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestCase_selenium1 {



    @Test
   public void test_selenium_01(){

        //WebDriver driver=new ChromeDriver();
       // driver.get("https://courses.thetestingacademy.com/courses/15x-live-job-ready-automation-tester-blueprint-with-java-by-pramod-dutta-15x/contents/699be318740a1");

  WebDriver driver=new FirefoxDriver();
  driver.get("https://google.com");

  //testng


       // Assert.assertEquals(driver.getCurrentUrl(),"https://google.com");
       //driver.quit();

        Assert.assertEquals(driver.getTitle(),"Google");

       assertThat(driver.getCurrentUrl()).isNotBlank().isNotEmpty().isNotNull().
       isEqualTo("Google");


       driver.quit();




   }
}
