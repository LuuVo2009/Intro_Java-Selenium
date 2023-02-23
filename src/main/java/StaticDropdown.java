import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Luu Vo\\Documents\\Learning\\Firefox diver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://www.spicejet.com/");

        System.out.println(driver.findElement(By.xpath("//body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input")).getAttribute("value"));
        driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79 r-1ozqkpa']")).getText());
        driver.findElement(By.xpath("//div[text()='BOM']")).click();

        String str = driver.findElement(By.xpath("//body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input")).getAttribute("value");
        System.out.println(str);
        Thread.sleep(1000);
        //Chọn ngày bay
        driver.findElement(By.cssSelector(".r-16ru68a")).click();
        System.out.println(driver.findElement(By.cssSelector("div.r-19h5ruw:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).getText());

        //Chọn số người đi máy bay
        System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
        for(int i=1; i<5;i++){
            element.click();
            Thread.sleep(500);
        }
        System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());

        Thread.sleep(2000);
        driver.close();

        /* WebElement staticDropdown = driver.findElement(By.xpath("//a[@href='/pc-may-in']"));
        Select dropdown =new Select(staticDropdown);
        dropdown.selectByVisibleText("Mực in");
        System.out.println(dropdown.getFirstSelectedOption().getText()); */

    }
}
