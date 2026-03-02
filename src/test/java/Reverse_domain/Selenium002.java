package Reverse_domain;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium002 {
    public static void main(String[] args) {
        EdgeDriver driver= new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }

}
