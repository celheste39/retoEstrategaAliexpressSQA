package com.aliexpress.es.userInterface;

import net.serenitybdd.screenplay.targets.Target;

import java.util.Random;

public class LandingPageUI {

    public static final Target TXT_SEARCH = Target.the("campo para hacer busquedas")
            .locatedBy("//input[@id='search-words']");
    public static final Target MODAL_ADD = Target.the("cerrar modal publicitario")
            .locatedBy("//iframe[starts-with(@src, 'https://campaign.aliexpress.com/wow/gcp/')]");
    public static final Target CLOSE_MODAL = Target.the("cerrar modal publicitario parte 2")
            .locatedBy("//img[@class='rax-image ' and starts-with(@src, 'https://img.alicdn.com/tfs')]");
    public static final Target CART_RANDOMIZED = Target.the("boton de carrito programado para escoger producto al azar")
            .locatedBy("//div[@class='multi--shopCart--darm7xs multi--shopLtr--1kiOXiJ multi--shopCartImage--2DX88PV']");
    public static final Target LBL_RANDOMIZED = Target.the("lbl del carrito carrito programado para escoger producto al azar")
            .locatedBy("//div[@class='multi--shopCart--darm7xs multi--shopLtr--1kiOXiJ multi--shopCartImage--2DX88PV']");
    public static final Target LBL_COP = Target.the("texto a validar en producto")
            .locatedBy("(//span[ @class=\"es--char--H_cbUAs\"])[1]");






}
