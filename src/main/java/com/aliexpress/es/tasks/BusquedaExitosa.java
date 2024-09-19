package com.aliexpress.es.tasks;

import com.aliexpress.es.interactions.CerrarIframe;
import com.aliexpress.es.interactions.RandomClick;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.aliexpress.es.userInterface.LandingPageUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class BusquedaExitosa implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //CerrarIframe.en(MODAL_ADD, CLOSE_MODAL),
                Switch.toDefaultContext(),
                WaitUntil.the(TXT_SEARCH, isVisible()).forNoMoreThan(10).seconds(),
                Enter.keyValues("calzones de jovencita virgen").into(TXT_SEARCH),
                Enter.keyValues(Keys.ENTER).into(TXT_SEARCH),
                RandomClick.on()
        );
    }

    public static BusquedaExitosa onTheSite(){
        return Instrumented.instanceOf(BusquedaExitosa.class).withProperties();
    }

}
