package controlador;

import modelo.MdlPersona;
import modelo.MdlProducto;
import vista.VisPrincipal;
import vista.VisPersona;
import vista.VisProducto;

public final class CtrlPrincipal {

    VisPrincipal visprincipal;
    VisPersona vistapersona;
    VisProducto vistaproducto;
    
    public CtrlPrincipal(VisPrincipal vp) {
        this.visprincipal = vp;
        this.visprincipal = vp;
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
    }

    public void iniciaControl() {
        visprincipal.getJmi_visualizar_clientes().addActionListener(l-> verPersona());
        visprincipal.getTlbPersonas().addActionListener(l->verPersona());
        
        visprincipal.getJmi_visualizar_productos().addActionListener(l-> verProducto());
        visprincipal.getTlbProductos().addActionListener(l->verProducto());
    }
    
    private void  verPersona(){
        MdlPersona modelopersona = new MdlPersona();
        try {
            visprincipal.getDskPrincipal().add(vistapersona);
        } catch (Exception e) {
            vistapersona = new VisPersona();
            visprincipal.getDskPrincipal().add(vistapersona);
        }
        CtrlPersona ctrlpersona = new CtrlPersona(modelopersona, vistapersona);
        ctrlpersona.iniciarCtrlBtn();
        ctrlpersona.iniciarCtrlKey();
    }
    private void  verProducto(){
        MdlProducto modeloproducto = new MdlProducto();
        try {
            visprincipal.getDskPrincipal().add(vistaproducto);
        } catch (Exception e) {
            vistaproducto = new VisProducto();
            visprincipal.getDskPrincipal().add(vistaproducto);
        }
        CtrlProducto ctrlproducto = new CtrlProducto(modeloproducto, vistaproducto);
        ctrlproducto.iniciarCtrlBtn();
        ctrlproducto.iniciarCtrlKey();
    }
    
}



