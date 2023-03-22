import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrendyolObjectPage {
    private WebDriver driver;
    private By girişYap=By.xpath("By.xpath(//div[text()='Giriş Yap']");
    public TrendyolObjectPage(WebDriver driver){
        this.driver=driver;
    }

    public void GirisYapBas(){
        WebElement logIn=driver.findElement(girişYap);
        logIn.click();
    }
}
