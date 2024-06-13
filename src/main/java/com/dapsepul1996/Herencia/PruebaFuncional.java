package com.dapsepul1996.Herencia;

public class PruebaFuncional extends Prueba{

    private String tipoPrueba;

    public PruebaFuncional(int id){
               this.tipoPrueba = " Regresion ";
   }

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }
}
