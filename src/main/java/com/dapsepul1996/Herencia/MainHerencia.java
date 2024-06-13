package com.dapsepul1996.Herencia;

public class MainHerencia {

        public static void main(String[] args) {
            PruebaFuncional pruebaF01 = new PruebaFuncional(4);
            PruebaNoFuncional pruebaNF03 = new PruebaNoFuncional(4 , " pn f 3 " );



            pruebaF01.setId(2);
            pruebaF01.setTitulo("PF 01");
            pruebaF01.setDescripcion(" prueba E2E ");
            pruebaF01.setEstado("Ejecutado");
            pruebaNF03.setEstado("Ejecutado");


            System.out.println(" El caso de prueba " + pruebaF01.getTitulo() + " esta en estado " + pruebaF01.getEstado());

            }
    }







