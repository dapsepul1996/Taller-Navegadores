package com.dapsepul1996.escenarios;

public class EscenarioFuncional {

    private int id;
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public EscenarioFuncional(int id){
        this.id = id;
    }

    public void asignarEstadoEscenario(){
        this.estado = "Escenario funcional creado";
    }
}
