package com.aliexpress.es.stepDefinitions;

import com.aliexpress.es.tasks.BusquedaExitosa;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class BuyProducStepDefinition {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que el usuario esta en el sitio web")
    public void queElUsuarioEstaEnElSitioWeb() {
        OnStage.theActorCalled("actor").wasAbleTo(Open.url("https://es.aliexpress.com/"));

    }
    @When("intenta agregar productos al carrito")
    public void intentaAgregarProductosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaExitosa.onTheSite());
    }
    @Then("verificara que el valor mostrado sea el correcto")
    public void verificaraQueElValorMostradoSeaElCorrecto() {

    }
    //cierra todos los drivers en segundo plano al finalizar la ejecucion de escenarios
    @After
    public void endingAutomationConfig() {
        Serenity.getWebdriverManager().closeCurrentDrivers();
    }
}
