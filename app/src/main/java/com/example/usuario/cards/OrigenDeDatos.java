package com.example.usuario.cards;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Timer;

/**
 * Created by Usuario on 20/04/2018.
 */

public class OrigenDeDatos {

    public ArrayList<tarjeta> showAll(){
        /**
         * CONEXION A LA BASE DE DATOS
         */
        ArrayList<tarjeta> resultado = new ArrayList<tarjeta>();

        tarjeta uno = new tarjeta();

        uno.age = ("54");
        uno.name = ("Bojack Horseman");
        uno.description = ("Actor from Horsin' Around, the main character of the series");
        uno.logo = "https://ep01.epimg.net/cultura/imagenes/2017/10/05/television/1507195272_293520_1507206177_noticia_normal.jpg";
        uno.id = 1;

        resultado.add(uno);
        tarjeta dos = new tarjeta();
        dos.age = ("18");
        dos.name = ("Hollyhock Horseman");
        dos.description = ("not an actor from Horsin' Around, and not the main character of the series");
        dos.id = 2;
        dos.logo = "https://4.bp.blogspot.com/-tNNBblh1bw4/Wbxs0MWpCpI/AAAAAAABGt4/KAeAO7KJhjcatTHvac5fu915YC2B7Kc4gCK4BGAYYCw/w1200-h630-p-k-no-nu/9%253A15%253A17%2BBoJack%2BHorseman%2B3.jpg";
        resultado.add(dos);

        tarjeta tres = new tarjeta();
        tres.age = ("40");
        tres.name = ("Mr Peanut Butter");
        tres.description = ("Actor from the copy of Horsin' Around, Diane´s husband");
        tres.id = 3;
        tres.logo = "https://i.redd.it/c03kszuky9ex.png";
        resultado.add(tres);

        tarjeta cuatro = new tarjeta();
        cuatro.age = ("37");
        cuatro.name = ("Diane Ngyuen");
        cuatro.description = ("Bojack Ghost rider, early love interest");
        cuatro.id = 4;
        cuatro.logo = "https://cdn.vox-cdn.com/thumbor/DsgXwpGT4EgDTGnHTK6jnuSvlAs=/0x0:3360x1892/1200x675/filters:focal(1466x876:2002x1412)/cdn.vox-cdn.com/uploads/chorus_image/image/56538961/Screen_Shot_2017_08_22_at_1.40.51_PM.0.png";
        resultado.add(cuatro);

        tarjeta cinco = new tarjeta();
        cinco.age = ("43");
        cinco.name = ("Princess Carolyn");
        cinco.description = ("Bojack’s Manager, ex girlfriend ");
        cinco.id =5;
        cinco.logo = "https://cdn-images-1.medium.com/max/2000/1*YFh85pSY8DNcwiNZGd6zrw.png";
        resultado.add(cinco);

        tarjeta seis = new tarjeta();
        seis.age = ("27");
        seis.name = ("Todd Chavez");
        seis.description = ("Bojack’s so called best friend");
        seis.id = 6;
        seis.logo = "http://cdn.ismorbo.com/wp-content/uploads/2017/09/toddnothing.jpg";
        resultado.add(seis);

        tarjeta siete = new tarjeta();
        siete.age = ("25");
        siete.name = ("Emily");
        siete.description = ("Todds love interest, and friend");
        siete.id = 7;
        siete.logo = "http://archermagazine.com.au/wp-content/uploads/2017/03/bojack-asexual-2.jpg";
        resultado.add(siete);

        tarjeta ocho = new tarjeta();
        ocho.age = ("20´s");
        ocho.name = ("Sextina Acuafina");
        ocho.description = ("Pop star, that fakes an abortion");
        ocho.id = 8;
        ocho.logo = "https://scontent-ort2-1.cdninstagram.com/vp/fe299c62df206010d6952e23433ffc77/5B56D28F/t51.2885-15/s480x480/e35/29093161_708355049552547_2749843577084313600_n.jpg";
        resultado.add(ocho);

        tarjeta nueve = new tarjeta();
        nueve.age = ("30");
        nueve.name = ("Sarah Lynn");
        nueve.description = ("Actor from Horsin' ArounD");
        nueve.id = 9;
        nueve.logo = "https://pm1.narvii.com/6599/574b30d7451159e08499bd896b5898638599fd00_hq.jpg";
        resultado.add(nueve);

        tarjeta diez = new tarjeta();
        diez.age = ("60");
        diez.name = ("Herb Kazzas");
        diez.description = ("Creator of Horsin' Around ");
        diez.id = 0;
        diez.logo = "http://78.media.tumblr.com/2c594a414441798b26b49ab6ba0c5b26/tumblr_ozvynx6WNl1sn72kho1_500.png";
        resultado.add(diez);

        return resultado;

    }




}