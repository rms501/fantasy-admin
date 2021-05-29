package com.fantasy;

import com.fantasy.service.selenium.pom.FantasyBaseballLandingPage;
import com.fantasy.service.selenium.pom.FantasyLandingPage;
import com.fantasy.service.selenium.pom.FantasyLoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Override
    public void run(String...args) throws Exception {
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://sports.yahoo.com/fantasy/");
//        System.out.println();
//        FantasyLandingPage landingPage = new FantasyLandingPage(driver);
//        landingPage.clickSignInButton();
//        System.out.println();
//        FantasyLoginPage loginPage = new FantasyLoginPage(driver);
//        loginPage.login("", "");
//        System.out.println();
//        landingPage.clickFantasyBaseballTab();
//        System.out.println();
//        FantasyBaseballLandingPage baseballLandingPage = new FantasyBaseballLandingPage(driver);
//        baseballLandingPage.clickLeagueOption("PED's 4 Life");
//        System.out.println();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
