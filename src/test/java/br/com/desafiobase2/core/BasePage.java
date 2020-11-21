package br.com.desafiobase2.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static br.com.desafiobase2.core.DriverFactory.getDriver;

public class BasePage {
    public void escrever(String xpath, String texto) {
        getDriver().findElement(By.xpath(xpath)).clear();
        getDriver().findElement(By.xpath(xpath)).sendKeys(texto);
    }

    public void clicarBotaoPorTexto(String texto) {
        getDriver().findElement(By.xpath("//input[@value='"+texto+"']")).click();
    }

    public void clicarView(String view){
        getDriver().findElement(By.xpath("//a[@href='/"+ view + "']")).click();
    }

    public String getFormTitle(){
        return getDriver().findElement(By.className("form-title")).getText();
    }



}
