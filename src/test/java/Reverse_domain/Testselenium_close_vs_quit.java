package Reverse_domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testselenium_close_vs_quit {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new FirefoxDriver();
        driver.get("https://google.com");

 Thread.sleep(400);

 driver.close();




    }
}
