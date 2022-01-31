package com.advancity.almsp.pages;

import com.advancity.almsp.contains.LoginContain;
import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginContain {

    public LoginPage(WebDriver driver) {
        super(driver);
        driver.get(baseUrl);
    }

    public void goToProfile(){
        driver.get(profileUrl);
    }

    public String getUserName(){
        waitFor(profileUserName);
        return find(profileUserName).getAttribute("value");
    }

    public void setUserName(String userName){
        type(userNameLocator,userName);
    }

    public void setPassword(String pass){
        type(passwordLocator, pass);
    }

    public void clickButton(){
        click(buttonLocator);
    }

    public void waitLogo(){
        waitFor(almsLogo);
    }


}
