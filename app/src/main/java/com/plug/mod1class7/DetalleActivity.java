package com.plug.mod1class7;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

public class DetalleActivity extends AppCompatActivity {
    //Creamos variables
    private SimpleDraweeView sdvImagen;
    private TextView tvTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        //Para poder retroceder, habilitamos el boton retroceder del action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Vinculamos variables con componentes
        sdvImagen=(SimpleDraweeView)findViewById(R.id.sdvImagen);
        tvTexto=(TextView)findViewById(R.id.tvTexto);

        //Obtenemos los datos que se han enviado
        String ruta=getIntent().getStringExtra("ruta");
        String texto=getIntent().getStringExtra("texto");

        sdvImagen.setImageURI(Uri.parse(ruta));
        tvTexto.setText(texto);
    }

        //zoomable drawee view para poder hacerle zoom a las imagenes
        //Para identificar que opcion esta seleccionando
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Verificar que elemento a realizado el evento
        switch (item.getItemId()){
            //Verificamos si es que el elemento selecionnado es boton de home, home siempre es el activity anterior.
            case android.R.id.home:
                //Retrocedemos
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
