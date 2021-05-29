package com.fantasy.service.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FantasyLandingPage {

    private RemoteWebDriver driver;
    @FindBy(xpath = "//a[text()='Sign in']")
    private WebElement signInButton;
    @FindBy(xpath = "//a[@title='Fantasy Football']")
    private WebElement fantasyFootballTab;
    @FindBy(xpath = "//a[@title='Fantasy Baseball']")
    private WebElement fantasyBaseballTab;

    public FantasyLandingPage(final RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignInButton() {
        this.signInButton.click();
    }

    public void clickFantasyFootballTab() {
        this.fantasyFootballTab.click();
    }

    public void clickFantasyBaseballTab() {
        this.fantasyBaseballTab.click();
    }
}
