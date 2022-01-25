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
    //static String browser = System.getProperty("browser");

    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Test initiated.");
    }

    @BeforeEach
    public void beforeMethod(){
        driver =  new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void afterMethod(){
        driver.quit();
    }

//    @AfterAll
//    public static void tearDown(){
//        System.out.println("Test finished.");
//        driver.quit();
//    }

   public void login(String userName,String pass){
       loginPage.setUserName(userName);
       loginPage.setPassword(pass);
       loginPage.clickButton();

   }
}
