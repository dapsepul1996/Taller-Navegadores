package com.dapsepul1996.Taller;

public abstract class Navegador {

    private String tipoNavegador;
    private boolean isAbierto;
    private String campoTexto;

   public Navegador (String tipoNavegador){

       this.tipoNavegador = tipoNavegador;
   }

    public String getTipoNavegador() {
        return tipoNavegador;
    }

    public String obtenerURL() {
        return campoTexto;
    }

    public void ingreseURL (String campoTexto) {
        this.campoTexto = campoTexto;

    }

    public boolean isAbierto() {
        return isAbierto;
    }

    public void setAbierto(boolean abierto) {
        isAbierto = abierto;
    }

    public abstract void modoIncognito();


}
