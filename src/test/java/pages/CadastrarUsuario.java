package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;

public class CadastrarUsuario extends PaginaInicial {
	private String UrlEndereco = "https://srbarriga.herokuapp.com";
	List<List<String>> dadosDeUsuario;
	

	public CadastrarUsuario(WebDriver browser) {
		super(browser);
	}

	public void informarUrlEndereco() {
		browser.get(UrlEndereco);
	}

	public CadastrarUsuario clicarLinkNovoUsuario() {
		browser.findElement(By.linkText("Novo usuário?")).click();

		return this;
	}

	public CadastrarUsuario preencherCampoNome(String nome) {
		browser.findElement(By.id("nome")).sendKeys(nome);

		return this;
	}

	public CadastrarUsuario preencherCampoEmail(String email) {
		browser.findElement(By.id("email")).sendKeys(email);

		return this;
	}

	public CadastrarUsuario preencherCampoSenha(String senha) {
		browser.findElement(By.id("senha")).sendKeys(senha);

		return this;
	}

	public CadastrarUsuario clicarBotaoCadastrar() {
		browser.findElement(By.xpath("//input[@value='Cadastrar']")).click();

		return this;
	}

	public PaginaLogin gerarCadastro(DataTable tabelaDados) {

		dadosDeUsuario = tabelaDados.raw();
		preencherCampoNome(dadosDeUsuario.get(0).get(0));
		preencherCampoEmail(dadosDeUsuario.get(0).get(1));
		preencherCampoSenha(dadosDeUsuario.get(0).get(2));
		clicarBotaoCadastrar();
		
		return new PaginaLogin(browser);

	}

	public void validarMensagem(String mensagemEsperada) {
		String mensagem = browser.findElement(By.xpath("//div[@role='alert']")).getText();
		assertEquals(mensagemEsperada, mensagem);
	}

}
