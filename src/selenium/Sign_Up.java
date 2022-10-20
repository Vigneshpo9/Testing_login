package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_Up {
    public static void main(String[] args) throws InterruptedException {


        //Properties..
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh\\IdeaProjects\\Testing_01\\driver\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //get url
        driver.get("https://www.vanillanimoy.com/users/preauth_init");
        Thread.sleep(2000);
        driver.navigate().to("https://www.vanillanimoy.com/sso/sign-up");
        Thread.sleep(2000);

        //Sign-Up
        driver.findElement(By.id("email")).sendKeys("login_new@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("vignesh");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Test@123");
        Thread.sleep(1000);
        driver.findElement(By.id("confirm-password")).sendKeys("Test@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
    }
}
