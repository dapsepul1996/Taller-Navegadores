package com.dapsepul1996.Taller;

public class Firefox extends Navegador implements Acciones{

    public Firefox(){

        super("Firefox");
    }
    @Override
    public void abrirModoIncognito(){
        System.out.println("Ctrl+Shift+P");
    }

    @Override
    public void modoIncognito(){
        System.out.println("Ctrl+Shift+Q");
    }

    public void verVideoEspecial(){
        System.out.println("Reproduciendo Video");}
}

