package com.example.usuario.cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Usuario on 24/04/2018.
 */

public class AdaptadordeListadeDatos extends BaseAdapter{

    public ArrayList<tarjeta> arreglo;
    public Context context;

    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int i) {
        return arreglo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return arreglo.get(i).id;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflate = LayoutInflater.from(context);

        View v = inflate.inflate(R.layout.tarjeta, null);

        TextView nombre = (TextView) v.findViewById(R.id.name);
        nombre.setText(arreglo.get(i).name);

        TextView anios = (TextView) v.findViewById(R.id.age);
        anios.setText(arreglo.get(i).age);

        TextView desci = (TextView) v.findViewById(R.id.desc);
        desci.setText(arreglo.get(i).description);

        ImageView imagenxd = (ImageView) v.findViewById(R.id.imageView1);
        Picasso.with(context).load(arreglo.get(i).logo).into(imagenxd);

        return v;

    }
}
