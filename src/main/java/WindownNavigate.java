import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindownNavigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Luu Vo\\Documents\\Learning\\Firefox diver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://translate.google.com/?sl=en&tl=vi&text=transverse%0A%0Asibling&op=translate");
//        driver.navigate().wait(2000);
        driver.navigate().back();


   }
}
