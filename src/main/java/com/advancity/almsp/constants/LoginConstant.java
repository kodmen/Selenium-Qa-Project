package com.advancity.almsp.constants;

import com.advancity.almsp.pages.BasePage;
import com.advancity.almsp.utility.LocalProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginConstant extends BasePage {

    public LoginConstant(WebDriver driver) {
        super(driver);
    }

    protected final By userNameLocator = By.id("txtUserName");
    protected final By passwordLocator = By.id("txtPasswordRef");
    protected final By buttonLocator = By.id("submitButton");
    protected final By almsLogo = By.cssSelector("img[src='https://s3.cloud.ngn.com.tr/static/logo/85A05D12DAD154D0CD3767F492058562.png']");
    protected final By profileUserName = By.id("userName");

    protected final String profileUrl= LocalProperties.getProfilUrl();

}
