import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class filmTest  extends AppiumTest {

    public static void main(String[] args) throws InterruptedException {
        AndroidDriver<AndroidElement> driver = caps();
        driver.findElement(AppiumBy.accessibilityId("Chrome")).click();
        driver.findElement(By.id("search_box_text")).sendKeys("migration film");
        driver.findElement(By.className("android.view.View")).click();
        Thread.sleep(1000);
        String moveiName =driver.findElement(By.id("firstHeading")).getText();
        Assert.assertEquals("migration film",moveiName);


    }
}