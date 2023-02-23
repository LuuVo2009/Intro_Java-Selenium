import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AutoSuggesstiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Luu Vo\\Documents\\Learning\\Firefox diver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("xe");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("div.OBMEnb:nth-child(1) > ul:nth-child(1) > li"));
        for (WebElement option : options){
            if(option.getText().equalsIgnoreCase("xe máy điện vinfast")) {
                System.out.println(option.getText());
                option.click();
                break;
            }

        }
    }
}
