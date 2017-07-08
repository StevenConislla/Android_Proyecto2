package com.plug.mod1class7;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.plug.mod1class7.adapters.GaleriaAdapter;

import me.relex.circleindicator.CircleIndicator;

public class GaleriaActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private CircleIndicator indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        indicator=(CircleIndicator)findViewById(R.id.indicator);
        //Get support fragment manager, es el maestro
        //SupportFragmentManager es la clase maestra que puede manipular los fragmentos, lo agregamos al adapter
        GaleriaAdapter galeriaAdapter=new GaleriaAdapter(getSupportFragmentManager());
        viewPager.setAdapter(galeriaAdapter);
        //Sincroniza la cantidad de datos que tenemos en l viewpager con la cantidad de bolitas
        indicator.setViewPager(viewPager);
        indicator.setBackgroundColor(getResources().getColor(R.color.numeradorgaleria));
        //Agregamos animacion en la transicion de pantallas
        //viewPager.setPageTransformer(true,new DepthPageTransformer());
        viewPager.setPageTransformer(true,new ZoomOutPageTransformer());

        //Obtenemos el dato que se ha enviado desde la pantlalla anterior
        int posicion=getIntent().getIntExtra("posicion",-1);
        //Verificamos que la posicion que esta llegando es superior a -1

        if(posicion>-1){
            //Se indica al viewPager que se muestre en la posición enviada
            viewPager.setCurrentItem(posicion);
        }


        //falta redireccionar a la galeria
    }
}
