package com.dapsepul1996.Clases;

public class CasosDePrueba {

    private int id;
    private String titulo;
    private String descripcion;
    private String estado;

    public int getId(){return id;}
    public void setId(int id){
    this.id =id;
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void ejecutar(String estadoCP){
        this.estado = estadoCP ;
    }

    public String obtenerResultado(){
        return " El caso de prueba " + titulo + " ha sido " + estado;
            }
}
