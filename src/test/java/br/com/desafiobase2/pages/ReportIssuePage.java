package br.com.desafiobase2.pages;

import br.com.desafiobase2.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static br.com.desafiobase2.core.DriverFactory.getDriver;

public class ReportIssuePage extends BasePage {

    public void selecionarItemComboBox(String valor){
        WebElement element = getDriver().findElement(By.xpath("//td/select[@name='project_id']"));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    public void clicarBotaoSelectProject(){
        selecionarItemComboBox("Select Project");
    }




}
