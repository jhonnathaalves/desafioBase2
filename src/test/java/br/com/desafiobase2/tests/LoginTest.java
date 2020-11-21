package br.com.desafiobase2.tests;

import br.com.desafiobase2.core.BaseTest;
import br.com.desafiobase2.pages.HomePage;
import br.com.desafiobase2.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {
    String usuario = "jhonnatha.alves";
    String senha = "jhonnatha251217";
    String mensagemErroLogin = "Your account may be disabled or blocked or the username/password you entered is incorrect.";
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void verificarLogin(){
        loginPage.acessarTelaInicial();
        loginPage.logar(usuario,senha);

        Assert.assertEquals( usuario, homePage.confirmaLoginUsuario());

    }

    @Test
    public void loginSemUsuario(){
        loginPage.acessarTelaInicial();
        loginPage.logar("",senha);
        Assert.assertEquals(mensagemErroLogin,loginPage.mensagemErroLogin());

    }

    @Test
    public void loginSemSenha(){
        loginPage.acessarTelaInicial();
        loginPage.logar(usuario,"");
        Assert.assertEquals(mensagemErroLogin,loginPage.mensagemErroLogin());

    }

    @Test
    public void loginSemUsuarioSenha(){
        loginPage.acessarTelaInicial();
        loginPage.logar("","");
        Assert.assertEquals(mensagemErroLogin,loginPage.mensagemErroLogin());

    }

    @Test
    public void loginUsuarioErrado(){
        loginPage.acessarTelaInicial();
        loginPage.logar("jhonnatha.alves1",senha);
        Assert.assertEquals(mensagemErroLogin,loginPage.mensagemErroLogin());

    }

    @Test
    public void loginSenhaErrado(){
        loginPage.acessarTelaInicial();
        loginPage.logar(usuario,"teste123");
        Assert.assertEquals(mensagemErroLogin,loginPage.mensagemErroLogin());

    }


}
