package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgot_Password {
    public static void main(String[] args) throws InterruptedException {

        //Properties..
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vignesh\\IdeaProjects\\Testing_01\\driver\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //get url
        driver.get("https://www.vanillanimoy.com/users/preauth_init");
        Thread.sleep(2000);
        driver.navigate().to("https://www.vanillanimoy.com/sso/sign-in");
        Thread.sleep(2000);

        //Forgot Password
        driver.findElement(By.xpath("//a[text()='Forget password']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("vignesh@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.className("button solid orange")).click();




    }
}
