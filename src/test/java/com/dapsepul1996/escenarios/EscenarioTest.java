package com.dapsepul1996.escenarios;

import org.junit.jupiter.api.*;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EscenarioTest {

    EscenarioFuncional escenarioF;

    /*
    Yo como usuario puedo crear un escenario funcional con id
    para ejecutar pruebas automatizadas
    *
    */

    @BeforeAll
    public static void testMetodoInicial(){
        System.out.println("Preparando los test para escenarios");
    }

    @BeforeEach
    public void testCreacionObjetos(){
      escenarioF = new EscenarioFuncional(1);
    }

    @Test
    public void testCrearEscenarioFuncional(){

        String mensaje = "Escenario funcional creado";
        //EscenarioFuncional escenarioF = new EscenarioFuncional(1);
        escenarioF.asignarEstadoEscenario();
        assertEquals(mensaje, escenarioF.getEstado());
        System.out.println("Test 1 finalizado");
    }

    @Test
    @Disabled ("Deshabilitado por ambiente")
    public void testAsignarEstadoEscenario(){

       // EscenarioFuncional escenarioDos = new EscenarioFuncional(2);
        escenarioF.setEstado("Escenario 2");
        assertNotEquals(null , escenarioF.getEstado());
        System.out.println("Test 2 finalizado");
    }

    @Test
    public void testAsignarIdEscenario(){

        //EscenarioFuncional escenarioTres = new EscenarioFuncional(3);
        //escenarioF.setId(4);
        assertEquals(1 , escenarioF.getId());
        System.out.println("Test 3 finalizado");
    }

    @AfterEach
    public void restauracionObjetos(){
        System.out.println("Objeto restaurado");
    }

    @AfterAll
    public static void restauracionAmbiente(){
        System.out.println("Ambiente restaurado");
    }
}

