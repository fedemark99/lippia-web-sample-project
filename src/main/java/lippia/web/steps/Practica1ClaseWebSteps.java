package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.Practica1ClaseWebService;

import java.util.Locale;


public class Practica1ClaseWebSteps extends PageSteps {

    @Given("el usuario esta en la web de Automation Practice")
    public void elUsuarioEstaEnLaWebDeAutomationPractice() {
        Practica1ClaseWebService.navegarWeb();
    }

    @When("^el usuario busca la palabra \"(.*)\"$")
    public void elUsuarioBuscaLaPalabra(String text)  {
        Practica1ClaseWebService.criteriodeBusqueda(text);
    }

    @When("el usuario da clik en el boton de buscar")
    public void elUsuarioDaClickEnElBotonDeBuscar(){
        Practica1ClaseWebService.clickBotonBuscar();
    }

    @When("el usuario ordena los productos de menor a mayor precio")
    public void elUsuarioOrdenaLosProductos()  {
            Practica1ClaseWebService.clickBotonSort();
    }

    @When("el usuario pulsa el botón Sign in")
    public void elUsuarioPulsaElBotón() {
        Practica1ClaseWebService.clickBotonIniciar();
    }

    @When("^el usuario introduce su email \"(.*)\" y password \"(.*)\"$")
    public void elUsuarioIntroduceEmail(String email, String pass){
        Practica1ClaseWebService.introducirMail(email);
        Practica1ClaseWebService.introducirPass(pass);
    }

    @When("el usuario pulsa el boton de login")
    public void elUsuarioPulsaElBotonLogin(){
        Practica1ClaseWebService.clickBotonLogin();
    }




    @Then("^el usuario verifica que se muestra la pagina con (.*)$")
    public void elUsuarioVerificaQueSeMuestraLaPaginaConLosResultados(String articulo) {
        Practica1ClaseWebService.verificarResultadosBusqueda(articulo);
    }

    @Then("el usuario verifica que se ordeno de menor a mayor precio")
    public void elUsuarioVerificaQueSeOrdeno(){
        Practica1ClaseWebService.verificarOrdenamiento();
    }

    @Then("el usuario verifica que se enseña la pagina de Sign in")
    public void  elUsuarioVerificaQueMuestraLaPagina(){
        Practica1ClaseWebService.verificarResultadosLogin();
    }

}
