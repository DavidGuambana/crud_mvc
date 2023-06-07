package controlador;

import vista.VisPrincipal;

public class MVC {
    
    public static void main(String[] args) {
        
         VisPrincipal visprincipal = new VisPrincipal();
         CtrlPrincipal ctrlprincipal = new CtrlPrincipal(visprincipal);
         ctrlprincipal.iniciaControl();
    }
}
