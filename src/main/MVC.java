package main;

import controlador.CtrlPrincipal;
import vista.VisPrincipal;

public class MVC {
    
    public static void main(String[] args) {
        
         VisPrincipal vistaprincipal = new VisPrincipal();
         CtrlPrincipal controlprincipal = new CtrlPrincipal(vistaprincipal);
    }
}
