package br.com.desafiobase2.pages;

import br.com.desafiobase2.core.BasePage;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static br.com.desafiobase2.core.DriverFactory.getDriver;

public class HomePage extends BasePage {
    public String confirmaLoginUsuario() {
        return getDriver().findElement(By.xpath("//td[@class='login-info-left']/span[@class='italic']")).getText();
    }
    public void clicarMyView(){
        clicarView("my_view_page.php");
    }
    public void clicarViewIssues(){
        clicarView("view_all_bug_page.php");
    }
    public void clicarReportIssues(){
        clicarView("bug_report_page.php");
    }
    public void clicarChangeLog(){
        clicarView("changelog_page.php");
    }
    public void clicarRoadmap(){
        clicarView("roadmap_page.php");
    }
    public void clicarMyAccount(){
        clicarView("account_page.php");

    }
    public void clicarLogout(){
        //getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clicarView("logout_page.php");
    }
}
