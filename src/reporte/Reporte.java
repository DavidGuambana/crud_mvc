package reporte;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.Conexion;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Reporte {

    Map<String, Object> map;
    String url;

    public void imprimir_factura(int id) {
        map = new HashMap<>();
        map.put("parametro_id", id);
        try {
            String min = JOptionPane.showInputDialog(null, "Ingrese un mínimo para el subtotal:");
            String max = JOptionPane.showInputDialog(null, "Ingrese un máximo para el subtotal:");
            
            map.put("min", Double.valueOf(min));
            map.put("max", Double.valueOf(max));
            
            System.out.println("minimo: "+min);
            System.out.println("maximo: "+max);
            url = "/reporte/Factura.jasper";
            print(map, url);
        } catch (Exception e) {
        }
    }
    
    public void imprimir_personas() {
        map = new HashMap<>();
        url = "/reporte/Persona.jasper";
        print(map, url);
    }

    public void print(Map<String, Object> map, String url) {

        try {
            map.put("Logo1", "src/reporte/img/factura_logo.png");
            map.put("Logo2", "src/reporte/img/certificado_32px.png");
            Conexion con = new Conexion();
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource(url));
            JasperPrint print = JasperFillManager.fillReport(jr, map, con.getConection());
            JasperViewer pv = new JasperViewer(print, false);
            pv.setVisible(true);
            pv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo de reporte no encontrado", null, JOptionPane.ERROR_MESSAGE);
        }
    }
}
