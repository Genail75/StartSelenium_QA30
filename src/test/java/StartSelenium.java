import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;


    @BeforeMethod
    public void preCondition(){
        wd=new ChromeDriver();

       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        //wd.navigate().forward();

    }

    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("a"));

        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector(" "));

        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());


        wd.findElements(By.className("container"));
        wd.findElements(By.cssSelector(".container"));
        wd.findElements(By.className("navbar-component_nav__1X_4m"));
        wd.findElements(By.className("login_login__3EHKB"));

        wd.findElement(By.id("root"));

        wd.findElement(By.tagName(" "));

        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("HO"));


    }
    @Test
    public void testName2(){

    }

    @AfterMethod
    public void postCondition(){
        //wd.close();
        //wd.quit();

    }


}
