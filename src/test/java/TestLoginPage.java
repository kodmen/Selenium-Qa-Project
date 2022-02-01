import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestLoginPage extends BaseTest{

    @Test
    public void correctLoginSenerio(){
        String userName = "yuktesti1";
        String pass = "yuktesti1";
        String actualUrl = "https://staging.almscloud.com/almsp/u/Home/Index";

        login(userName,pass);
        loginPage.waitLogo();
        loginPage.goToProfile();

        Assertions.assertEquals(userName,loginPage.getUserName(),"username not correct");
    }

    @Test
    public void nullUsernameLoginSenerio(){
        String userName = "";
        String pass = "yuktesti1";
        String actualUrl = "https://staging.almscloud.com/almsp";

        login(userName,pass);
        String expectedUrl = driver.getCurrentUrl();;

        Assertions.assertEquals(actualUrl,expectedUrl,"unexpected url");
    }

    @Test
    public void nullPasswordLoginSenerio(){
        String userName = "yuktesti1";
        String pass = "";
        String actualUrl = "https://staging.almscloud.com/almsp";

        login(userName,pass);
        String expectedUrl = driver.getCurrentUrl();;

        Assertions.assertEquals(actualUrl,expectedUrl,"unexpected url");
    }

}
