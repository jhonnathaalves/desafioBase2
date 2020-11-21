package br.com.desafiobase2.pages;

import br.com.desafiobase2.core.BasePage;
import br.com.desafiobase2.core.DriverFactory;
import org.openqa.selenium.By;

import static br.com.desafiobase2.core.DriverFactory.getDriver;

public class LoginPage extends BasePage {
    public void acessarTelaInicial(){
        DriverFactory.getDriver().get("https://mantis-prova.base2.com.br/login_page.php");
    }

    public void setUsuario(String usuario) {
        escrever("//input[@name='username']", usuario);
    }

    public void setSenha(String senha) {
        escrever("//input[@name='password']", senha);
    }

    public void entrar(){
        clicarBotaoPorTexto("Login");
    }

    public void logar(String usuario, String senha) {
        setUsuario(usuario);
        setSenha(senha);
        entrar();
    }

    public String mensagemErroLogin(){
        return getDriver().findElement(By.xpath("/html/body/div[2]/font")).getText();
    }
}
