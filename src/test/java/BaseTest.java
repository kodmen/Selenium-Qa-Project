import com.advancity.almsp.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BaseTest {
   protected WebDriver driver ;
   protected LoginPage loginPage;
    static String browser = System.getProperty("browser");


    @BeforeAll
    public static void setUp(){
        if (browser.equals("firefox"))
        WebDriverManager.firefoxdriver().setup();
        else
            WebDriverManager.chromedriver().setup();
        System.out.println("Test initiated.");
    }

    @BeforeEach
    public void beforeMethod(){
        driver =  getDriver(browser);
        loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void afterMethod(){
        driver.quit();
    }

    public WebDriver getDriver(String browser) {
        if (browser.equals("firefox"))
                 return new FirefoxDriver();
            else
                return new ChromeDriver();
    }

    public void login(String userName, String pass){
       loginPage.setUserName(userName);
       loginPage.setPassword(pass);
       loginPage.clickButton();
   }
}
