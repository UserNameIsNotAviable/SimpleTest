import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserAction {
    @Test
    public void accountRegister(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"+"/drivers/chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://kontakt.az/profile/login/");

        WebElement registerBtn = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[7]/input[2]"));
        registerBtn.click();




    }

}
