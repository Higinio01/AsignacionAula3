package org.example.util;

import io.javalin.Javalin;

public abstract class BaseControlador {

    protected Javalin app;

    public BaseControlador(Javalin app){
        this.app = app;
    }

    public abstract void aplicarRutas();

    //abstract public void aplicarRutas();
}
