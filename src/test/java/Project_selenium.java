import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_selenium {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();



    }
}
