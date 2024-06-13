package com.dapsepul1996.Taller;

import java.sql.SQLOutput;

public class MainTaller {

    public static void main (String[] args) {


        Chrome PC = new Chrome();
        Firefox PC1 = new Firefox();


        PC.setAbierto(true);

        System.out.println(PC.isAbierto());

        System.out.println(PC.getTipoNavegador());

        PC.ingreseURL("Google");

        System.out.println(PC.obtenerURL());

        PC.modoIncognito();


        PC1.setAbierto(true);

        System.out.println(PC1.isAbierto());

        System.out.println(PC1.getTipoNavegador());

        PC1.ingreseURL("Youtube");

        System.out.println(PC1.obtenerURL());

        PC1.modoIncognito();

        PC1.verVideoEspecial();

        }



}
