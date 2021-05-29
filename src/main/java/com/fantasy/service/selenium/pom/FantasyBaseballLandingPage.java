package com.fantasy.service.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FantasyBaseballLandingPage {

    private RemoteWebDriver driver;

    public FantasyBaseballLandingPage(final RemoteWebDriver driver) {
        this.driver = driver;
    }

    public void clickLeagueOption(final String leagueName) {
//        String xpath = "//a[text()='" + leagueName.replace("'", "\\\\'") + "']";
//        driver.executeScript(
//            "document.evaluate(\"" + xpath + "\", document, null, XPathResult.ANY_TYPE, null).iterateNext().scrollIntoView(true);"
//        );
//        this.driver.findElement(By.xpath(xpath));
    }
}
