package br.com.desafiobase2.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {}

    public static WebDriver getDriver(){
        if(driver == null) {
            switch (Propriedades.browser) {
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
                    driver = new FirefoxDriver(); break;
                case CHROME:
                    System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
                    driver = new ChromeDriver(); break;
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void killDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }




}
