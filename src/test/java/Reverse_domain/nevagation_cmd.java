package Reverse_domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class nevagation_cmd {
    public static void main(String[] args) {


      //  @Test


         WebDriver driver=new FirefoxDriver();
        driver.get("https://google.com");

        //use navigation commands
        //driver.get("url")--> navigate to a url




        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();


    }
}
