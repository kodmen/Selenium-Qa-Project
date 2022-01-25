package com.advancity.almsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
        driver.get(baseUrl);
    }

    private final By userNameLocator = By.id("txtUserName");
    private final By passwordLocator = By.id("txtPasswordRef");
    private final By buttonLocator = By.id("submitButton");
    private final By almsLogo = By.cssSelector("img[src='https://s3.cloud.ngn.com.tr/static/logo/85A05D12DAD154D0CD3767F492058562.png']");



    public void setUserName(String userName){
        type(userNameLocator,userName);
    }

    public void setPassword(String pass){
        type(passwordLocator, pass);
    }

    public void clickButton(){
        click(buttonLocator);
    }

    public String getUserName(){
        return find(userNameLocator).getAttribute("value");
    }

    public String getPassword(){
        return find(passwordLocator).getAttribute("value");
    }

    public void waitLogo(){
        waitFor(almsLogo);
    }


}
