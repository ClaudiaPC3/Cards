package com.example.usuario.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView Listi;
        Listi = (ListView) findViewById(R.id.linear);

        OrigenDeDatos odd = new OrigenDeDatos();
        AdaptadordeListadeDatos adaptador = new AdaptadordeListadeDatos();

        adaptador.arreglo = odd.showAll();
        adaptador.context = this;
        Listi.setAdapter(adaptador);


    }
}
