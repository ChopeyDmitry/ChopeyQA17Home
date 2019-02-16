import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        openSite("https://www.ebay.com/");
    }

    public void confirmLogin() {
        click(By.id("sgnBt"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillLoginForm(String user, String pwd) {
        type(By.id("userid"), user);
        type(By.id("pass"), pwd);
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void initLogin() {
        click(By.linkText("Sign in"));
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void stop() {
//        wd.quit();
    }

    public void startSearch() {
        click(By.id("gh-btn"));
    }

    public void typeToTheSearchBar(String item) {
        type(By.cssSelector("[role='combobox']"), item);
    }
}
