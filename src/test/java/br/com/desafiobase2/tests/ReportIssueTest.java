package br.com.desafiobase2.tests;

import br.com.desafiobase2.core.BasePage;
import br.com.desafiobase2.core.BaseTest;
import br.com.desafiobase2.pages.HomePage;
import br.com.desafiobase2.pages.LoginPage;
import br.com.desafiobase2.pages.ReportIssuePage;
import org.junit.Test;

public class ReportIssueTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ReportIssuePage reportIssuePage = new ReportIssuePage();

    @Test
    public void escolherProjeto(){
        loginPage.acessarTelaInicial();
        loginPage.logar("jhonnatha.alves","jhonnatha251217");
        homePage.clicarReportIssues();
        reportIssuePage.selecionarItemComboBox("Jhonnatha Alves´s project");
        reportIssuePage.clicarBotaoSelectProject();

    }
}
