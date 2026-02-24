package Reverse_domain;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium002 {
    public static void main(String[] args) {
        ChromeDriver driver= new ChromeDriver();

        driver.get("https://www.instagram.com");
        driver.quit();
    }

}
