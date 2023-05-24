package mvc;
import controlador.ControladorPersonas;
import modelo.ModeloPersona;
import vista.VistaPersona;

public class MVC {
    
    public static void main(String[] args) {
        ModeloPersona modelo = new ModeloPersona();
        VistaPersona vista = new VistaPersona();
        ControladorPersonas controlador = new ControladorPersonas(modelo, vista);
        controlador.iniciarControladorBTN();
    }
}
