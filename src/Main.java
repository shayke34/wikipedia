import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chormedriver", "C:/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wikipedia.org");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        System.out.println((driver.getCurrentUrl()));
        String url1 ="https://www.wikipedia.org/";
        String title1 = "wt";
        System.out.println((driver.getTitle()));
        String title = driver.getTitle();
        if (title.equals(title1))
            System.out.println("true");
        else {
            System.out.println("false");
        }
        if (url.equals(url1))
            System.out.println("true");
        else {
            System.out.println("false");
        }
        }
    }