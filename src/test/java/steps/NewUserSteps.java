package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Support.Utils;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastrarUsuario;
import pages.PaginaInicial;
import pages.PaginaLogin;

public class NewUserSteps {

	private WebDriver browser;
	CadastrarUsuario cadastrarUsuario;

	
		
	@Before("@novoUsuario")
	public void setUp() {
		browser = Utils.abrirBrowser();
		cadastrarUsuario = new CadastrarUsuario(browser);
		cadastrarUsuario.informarUrlEndereco();
		
	}
	

	@After("@novoUsuario")
	public void tearDown() {
		browser.quit();
		
	}
	
	
	

@Dado("^que estou na tela de Noco Usuário$")
public void que_estou_na_tela_de_Noco_Usuário() throws Throwable {
    cadastrarUsuario.informarUrlEndereco();
}



@Quando("^devo informar os campos$")
//public void devo_informar_os_campos_e_e(String arg1, String arg2, String arg3) throws Throwable {
public void devo_informar_os_campos_e_e(DataTable tabelaDados) throws Throwable {
cadastrarUsuario.gerarCadastro(tabelaDados);
}


@Quando("^devo informar os campos \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
public void devo_informar_os_camposEE(String nome, String email, String senha) throws Throwable {
cadastrarUsuario.preencherCampoNome(nome);
cadastrarUsuario.preencherCampoEmail(email);
cadastrarUsuario.preencherCampoSenha(senha);
}






@E("^clico no botão Cadastrar$")
public void clico_no_botão_Cadastrar() throws Throwable {
    cadastrarUsuario.clicarBotaoCadastrar();
}
	
@Então("^exibe a mensagem \"([^\"]*)\"$")
public void recebo_a_mensagem(String mensagemEsperada) throws Throwable {
   assertEquals(mensagemEsperada, cadastrarUsuario.mensagem());
}



}
