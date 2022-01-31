package com.advancity.almsp.contains;

import com.advancity.almsp.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginContain extends BasePage {
    public LoginContain(WebDriver driver) {
        super(driver);
    }

    protected final By userNameLocator = By.id("txtUserName");
    protected final By passwordLocator = By.id("txtPasswordRef");
    protected final By buttonLocator = By.id("submitButton");
    protected final By almsLogo = By.cssSelector("img[src='https://s3.cloud.ngn.com.tr/static/logo/85A05D12DAD154D0CD3767F492058562.png']");
    protected final By profileUserName = By.id("userName");

    protected final String profileUrl="https://staging.almscloud.com/almsp/u/profile";

}
