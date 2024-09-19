package com.aliexpress.es.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

public class CerrarIframe implements Interaction {

    private final Target iframe;
    private final Target closeButton;

    public CerrarIframe(Target iframe, Target closeButton) {
        this.iframe = iframe;
        this.closeButton = closeButton;
    }

    public static Performable en(Target iframe, Target closeButton) {
        return new CerrarIframe(iframe, closeButton);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement frameBy = iframe.resolveFor(actor);

        actor.attemptsTo(
                Switch.toFrame(frameBy),
                Click.on(closeButton),
                Switch.toDefaultContext()
        );
    }
}
