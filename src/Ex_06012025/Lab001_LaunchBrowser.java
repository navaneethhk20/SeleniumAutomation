package Ex_06012025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lab001_LaunchBrowser {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Navaneeth H K\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
