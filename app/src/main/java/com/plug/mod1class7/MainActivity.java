package com.plug.mod1class7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;

import com.plug.mod1class7.adapters.ImagenAdapter;
import com.plug.mod1class7.modelos.Imagen;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gvDatos;
    //Static: Mantener la variable viva, y para poder emplearla en distintos lugares
    public static ArrayList<Imagen> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvDatos=(GridView)findViewById(R.id.gvDatos);
        lista=new ArrayList<>();

        //Creamos imagenes al proyecto
        Imagen imagen1=new Imagen();
        imagen1.setId(lista.size());
        imagen1.setRuta("https://i.ytimg.com/vi/R5eOEDZKoA0/hqdefault.jpg");
        imagen1.setTexto("Imagen 1");
        lista.add(imagen1);


        Imagen imagen2=new Imagen();
        imagen2.setId(lista.size());
        imagen2.setRuta("https://s3.amazonaws.com/joinnus.com-tester-bucket/user/48824/avatar.jpg");
        imagen2.setTexto("Imagen 2");
        lista.add(imagen2);


        Imagen imagen3=new Imagen();
        imagen3.setId(lista.size());
        imagen3.setRuta("https://a3-images.myspacecdn.com/images02/147/42f33a1a159a455199aa8874d420c17e/full.jpg");
        imagen3.setTexto("Imagen 3");
        lista.add(imagen3);


        Imagen imagen4=new Imagen();
        imagen4.setId(lista.size());
        imagen4.setRuta("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/6_voltios.jpg/1200px-6_voltios.jpg");
        imagen4.setTexto("Imagen 4");
        lista.add(imagen4);


        Imagen imagen5=new Imagen();
        imagen5.setId(lista.size());
        imagen5.setRuta("http://2.bp.blogspot.com/-T7fUDGa1KUc/TbCb2o_7HXI/AAAAAAAABXs/n2OvUKOIPNk/s1600/estado.jpg");
        imagen5.setTexto("Imagen 5");
        lista.add(imagen5);


        Imagen imagen6=new Imagen();
        imagen6.setId(lista.size());
        imagen6.setRuta("http://cde.peru21.pe/ima/0/0/4/4/0/440548.jpg");
        imagen6.setTexto("Imagen 6");
        lista.add(imagen6);


        ImagenAdapter adapter=new ImagenAdapter(MainActivity.this,lista);
        gvDatos.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //Iniciamos un evento para cuando le damos clic a algun Item
        gvDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /*Intent intent=new Intent(MainActivity.this,DetalleActivity.class);
                //Lo pasamos de un activity a otro; aqui estamos creando la variable ruta y la variable texto, y guardamos alli
                intent.putExtra("ruta",lista.get(i).getRuta());
                intent.putExtra("texto",lista.get(i).getTexto());
                startActivity(intent);*/
                Intent intent=new Intent(MainActivity.this,GaleriaActivity.class);
                //Enviamos de dato la posicion
                intent.putExtra("posicion",i);
                startActivity(intent);

            }
        });
    }
}
