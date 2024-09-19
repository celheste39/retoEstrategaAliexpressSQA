package com.aliexpress.es.interactions;

import com.aliexpress.es.utils.GlobalVar;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.*;

import java.util.List;
import java.util.Random;

import static com.aliexpress.es.userInterface.LandingPageUI.*;

public class RandomClick implements Interaction{
    @Override
    public <T extends Actor> void performAs(T actor){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        Random ra = new Random();
        List<WebElementFacade> listaBtnModelos = CART_RANDOMIZED.resolveAllFor(actor);
        List<WebElementFacade> listaLblModelos = LBL_RANDOMIZED.resolveAllFor(actor);
        int nRandom = ra.nextInt(listaBtnModelos.size() + 1);
        GlobalVar.modeloAleatorio = listaLblModelos.get(nRandom).getText();
        listaBtnModelos.get(nRandom).click();
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static Performable on(){
        return Instrumented.instanceOf(RandomClick.class).withProperties();
    }
}