package com.dapsepul1996.Clases;

public class Main {
    public static void main(String[] args) {
        CasosDePrueba cp01 = new CasosDePrueba();

        cp01.setId (1);
        cp01.setTitulo("XYZ");
        cp01.setEstado(" creado ");
        cp01.setDescripcion(" Caso con errores de ortografia ");

        System.out.println( " El usuario esta ejecutando el caso de prueba " + cp01.getTitulo());
        cp01.ejecutar("Pendiente");
        System.out.println(" El caso de prueba " + cp01.getId() + " con titulo " + cp01.getTitulo() + " esta en estado" +
                cp01.getEstado() + " por fallas en su descripcion " + cp01.getDescripcion());
    }
}