package com.plug.mod1class7.fragmentos;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.plug.mod1class7.MainActivity;
import com.plug.mod1class7.R;
import com.plug.mod1class7.modelos.Imagen;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImagenFragment extends Fragment {
    private SimpleDraweeView sdvImagen;
    private TextView tvTexto;



    public ImagenFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_imagen, container, false);
        //Fragmento se coloca como el adapter, lo movemos a una variable tipo view para jalar la informacion
        sdvImagen=(SimpleDraweeView)view.findViewById(R.id.sdvImagen);
        tvTexto=(TextView)view.findViewById(R.id.tvTexto);

        //Obtenemos la posicion enviada desde el adapter
        int posicion=getArguments().getInt("posicion");
        //obtenemos el objeto de tipo imagen segpun la posicion
        Imagen imagen= MainActivity.lista.get(posicion);
        //Seteamos los datos de los componentes
        sdvImagen.setImageURI(Uri.parse(imagen.getRuta()));
        tvTexto.setText(imagen.getTexto());

        return view;

        }

}
