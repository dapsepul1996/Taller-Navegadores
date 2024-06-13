package com.dapsepul1996.Taller;

public class Chrome extends Navegador{

    public Chrome (){
        super("Google Chrome");
    }

    @Override
    public void modoIncognito() {
        System.out.println("Ctrl+Shift+Q");
    }
}
