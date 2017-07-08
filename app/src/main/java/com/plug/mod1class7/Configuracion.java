package com.plug.mod1class7;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by OSKAR on 05/07/2017.
 */
//Configuro datos que seran utilizados para toda la aplicacion

public class Configuracion extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(getApplicationContext());
    }
}
