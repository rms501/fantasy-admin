package com.fantasy.service.selenium.pom;

import com.fantasy.config.AppConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FantasyLoginPage {

    private RemoteWebDriver driver;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id='login-signin']")
    private WebElement nextButton;
    @FindBy(xpath = "//span[contains(@class,'stay-signed-in')]")
    private WebElement staySignedInCheckbox;

    public FantasyLoginPage(final RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsernameValue(final String username) {
        this.usernameField.sendKeys(username);
    }

    public void enterPasswordValue(final String password) {
        this.passwordField.sendKeys(password);
    }

    public void clickNextButton() {
        this.nextButton.click();
    }

    public void toggleStaySignedInCheckbox() {
        this.staySignedInCheckbox.click();
    }

    public boolean isStaySignedInChecked() {
        return this.staySignedInCheckbox.isEnabled();
    }

    public void login(final String username, final String password) {
        if (this.isStaySignedInChecked()) {
            this.toggleStaySignedInCheckbox();
        }
        this.enterUsernameValue(username);
        this.clickNextButton();
        new WebDriverWait(this.driver, AppConfig.seleniumWaitTime)
            .until(ExpectedConditions.elementToBeClickable(this.passwordField));
        this.enterPasswordValue(password);
        this.clickNextButton();
    }
}
