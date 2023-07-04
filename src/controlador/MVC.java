package controlador;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.VisPrincipal;

public class MVC {
    
    public static void main(String[] args) {
        diseñar();
         VisPrincipal visprincipal = new VisPrincipal();
         CtrlPrincipal ctrlprincipal = new CtrlPrincipal(visprincipal);
         ctrlprincipal.iniciaControl();
        
    }
    
    public static void diseñar(){
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());            
            UIManager.put("Button.arc", 100);
            UIManager.put("Component.arc", 100);
            UIManager.put("ProgressBar.arc", 100);
            UIManager.put("TextComponent.arc", 100);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
