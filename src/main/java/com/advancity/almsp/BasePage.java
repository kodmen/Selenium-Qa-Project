package com.advancity.almsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver ;
    String baseUrl = "https://staging.almscloud.com/almsp";

    public BasePage(WebDriver driver){
        this.driver = driver ;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }

    public void waitFor(By locator){
        WebDriverWait wait = new WebDriverWait(driver , 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
