import com.advancity.almsp.pages.LoginPage;
import com.advancity.almsp.utility.LocalProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.advancity.almsp.utility.LocalProperties;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BaseTest {
   protected WebDriver driver ;
   protected LoginPage loginPage;

    @BeforeAll
    public static void setUp(){

        if (LocalProperties.getGridBrowser().equals("firefox"))
            System.setProperty("webdriver.gecko.driver","src/main/java/com/advancity/almsp/drivers/geckodriver");
        else
            System.setProperty("webdriver.chrome.driver","src/main/java/com/advancity/almsp/drivers/chromedriver");

//        if (LocalProperties.getGridBrowser().equals("firefox"))
//            WebDriverManager.firefoxdriver().setup();
//        else
//            WebDriverManager.chromedriver().setup();


        System.out.println("Test initiated.");
    }


    @BeforeEach
    public void beforeMethod(){
        if (LocalProperties.getGridBrowser().equals("firefox"))
            driver =  new FirefoxDriver();
        else
            driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void afterMethod(){
        driver.quit();
    }

    public void login(String userName, String pass){
       loginPage.setUserName(userName);
       loginPage.setPassword(pass);
       loginPage.clickButton();
   }

}
