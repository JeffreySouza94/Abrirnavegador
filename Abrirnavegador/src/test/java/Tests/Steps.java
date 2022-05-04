package Tests;

import Pages.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodos = new Metodos();
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String appUrl) {
	metodos.AbrirNavegador(appUrl, "abrir navegador");
	   
	}

	@When("pesquisar nike")
	public void pesquisar_nike() {
	  
	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {
	
	}

}
