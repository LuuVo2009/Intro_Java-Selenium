import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {
    public static void main(String[] args) {
        //to do auto-generated method stub
//        System.setProperty("web-driver.chrome.driver", "C:\\Users\\Luu Vo\\Documents\\Learning\\chrome_driver_1105481_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //FireFox browser
        //webdriver.geckodriver
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Luu Vo\\Documents\\Learning\\Firefox diver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();

        driver.get("https://www.lazada.vn/#hp-flash-sale");
        driver.findElement(By.id("q")).sendKeys("samsung s22");
        driver.findElement(By.xpath("//button[@class='search-box__button--1oH7']")).click();
        //Click mua sản phẩm Samsung S22
        driver.findElement(By.xpath("//img[@alt='Điện thoại Samsung S22 Ultra 8GB/128GB']")).click();
        System.out.println(driver.findElement(By.xpath("//button[contains(@class,'pdp-button pdp-button_type_text pdp-button_theme_orange pdp-button_size_xl')]")).getText());

        //Roll category
        //driver.findElement(By.xpath("//li[@id='Level_1_Category_No1']")).click();
//        System.out.println(driver.findElement(By.cssSelector("a.card-categories-li-content")).getText());
//        driver.findElement(By.cssSelector("a.card-categories-li-content")).click();


        //List<WebElement> products = driver.findElements()
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //driver.close();
    }
}
