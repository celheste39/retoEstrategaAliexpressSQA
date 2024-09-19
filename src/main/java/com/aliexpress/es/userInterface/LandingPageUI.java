package com.aliexpress.es.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class LandingPageUI {
    public static final Target TXT_SEARCH = Target.the("campo para hacer busquedas")
            .locatedBy("//input[@id='search-words']");
    public static final Target MODAL_ADD = Target.the("cerrar modal publicitario")
            .locatedBy("//iframe[starts-with(@src, 'https://campaign.aliexpress.com/wow/gcp/')]");
    public static final Target CLOSE_MODAL = Target.the("cerrar modal publicitario parte 2")
            .locatedBy("//img[@class='rax-image ' and starts-with(@src, 'https://img.alicdn.com/tfs')]");



}
