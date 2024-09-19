package com.aliexpress.es.tasks;

import com.aliexpress.es.interactions.CerrarIframe;
import com.aliexpress.es.interactions.RandomClick;
import com.aliexpress.es.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.aliexpress.es.userInterface.LandingPageUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class BusquedaExitosa implements Task {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = Excel.readExcel("AliiW11.xlsx", "Hoja");
        } catch (IOException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                //CerrarIframe.en(MODAL_ADD, CLOSE_MODAL),
                Switch.toDefaultContext(),
                WaitUntil.the(TXT_SEARCH, isVisible()).forNoMoreThan(10).seconds(),
                Enter.keyValues(leerExcel.get(0).get("Datos")).into(TXT_SEARCH),
                Enter.keyValues(Keys.ENTER).into(TXT_SEARCH),
                RandomClick.on()
        );
    }

    public static BusquedaExitosa onTheSite(){
        return Instrumented.instanceOf(BusquedaExitosa.class).withProperties();
    }

}
