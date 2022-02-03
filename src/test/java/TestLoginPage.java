import com.advancity.almsp.utility.LocalProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestLoginPage extends BaseTest{

    @Test
    public void correctLoginSenerio(){
        String userName = LocalProperties.getUserName();
        String pass = LocalProperties.getPassword();

        login(userName,pass);
        loginPage.waitLogo();
        loginPage.goToProfile();

        Assertions.assertEquals(userName,loginPage.getUserName(),"username not correct");
    }

    @Test
    public void nullUsernameLoginSenerio(){
        String userName = "";
        String pass = LocalProperties.getPassword();
        String actualUrl = LocalProperties.getUrl();

        login(userName,pass);
        String expectedUrl = driver.getCurrentUrl();;

        Assertions.assertEquals(actualUrl,expectedUrl,"unexpected url");
    }

    @Test
    public void nullPasswordLoginSenerio(){
        String userName = LocalProperties.getUserName();
        String pass = "";
        String actualUrl = LocalProperties.getUrl();

        login(userName,pass);
        String expectedUrl = driver.getCurrentUrl();;

        Assertions.assertEquals(actualUrl,expectedUrl,"unexpected url");
    }

}
