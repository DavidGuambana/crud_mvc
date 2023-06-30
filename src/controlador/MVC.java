package controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import vista.VisPrincipal;

public class MVC {
    
    public static void main(String[] args) {
        diseñar();
         VisPrincipal visprincipal = new VisPrincipal();
         CtrlPrincipal ctrlprincipal = new CtrlPrincipal(visprincipal);
         ctrlprincipal.iniciaControl();
        
    }
    
    public static void diseñar(){
//         try {
//            try {
//                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(MVC.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(MVC.class.getName()).log(Level.SEVERE, null, ex);
//        }

        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VisPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
