package com.plug.mod1class7.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.plug.mod1class7.MainActivity;
import com.plug.mod1class7.fragmentos.ImagenFragment;

/**
 * Created by OSKAR on 05/07/2017.
 */
//FragmentStatePagerAdapter si guarda el estado del fragment, donde los habias dejado
//PageAdapter no guarda el estado en el que dejo el fragment
public class GaleriaAdapter extends FragmentStatePagerAdapter{
    //Cremos contructor, y methodos de get presionando el foco rojo
    public GaleriaAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        ImagenFragment imagenFragment=new ImagenFragment();
        //Intent para pasar informacion de un activity a otro, en fragments utilizamos bundle
        Bundle bundle=new Bundle();
        bundle.putInt("posicion",position);
        //Agregamos los parametros a nuestro fragmento
        imagenFragment.setArguments(bundle);
        //retornamos el fragmento con los datos cargados
        return imagenFragment;
    }

    @Override
    public int getCount() {
        //Cantidad de elementos que tiene la lista
        return MainActivity.lista.size();
    }
}
