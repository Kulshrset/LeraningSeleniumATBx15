package Reverse_domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_cmd2 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://google.com");
       // System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        //driver.quit();

        driver.manage().window().maximize();
        driver.manage().window().minimize();



    }
}
