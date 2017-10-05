package com.example.alumnofp.pruebatabs;

import android.app.Application;

/**
 * Created by AlumnoFP on 05/10/2017.
 */

public class Principal extends Application {
    String pepe;

    public Principal() {
        this.pepe = "vacio como el cerebro de Rajoy";
    }

    public Principal(String pepe) {
        this.pepe = pepe;
    }

    public String getPepe() {
        return pepe;
    }

    public void setPepe(String pepe) {
        this.pepe = pepe;
    }
}
