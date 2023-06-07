package controlador;

import modelo.MdlDetalle;
import modelo.MdlEncabezado;
import modelo.MdlPersona;
import modelo.MdlProducto;
import vista.VisFactura;
import vista.VisPrincipal;
import vista.VisPersona;
import vista.VisProducto;

public final class CtrlPrincipal {
    public static VisPrincipal visprincipal;
    public static VisPersona vistapersona;
    public static VisProducto vistaproducto;
    public static VisFactura vistafactura;
    
    public CtrlPrincipal(VisPrincipal vp) {
        CtrlPrincipal.visprincipal = vp;
        CtrlPrincipal.visprincipal = vp;
        CountRegistros();
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
    }

    public void iniciaControl() {
        visprincipal.getJmi_visualizar_clientes().addActionListener(l-> verPersona());
        visprincipal.getTlbPersonas().addActionListener(l->verPersona());
        
        visprincipal.getJmi_visualizar_productos().addActionListener(l-> verProducto());
        visprincipal.getTlbProductos().addActionListener(l->verProducto());
        
        visprincipal.getJmi_registrar_venta().addActionListener(l-> verFactura());
        visprincipal.getTlbFacturar().addActionListener(l->verFactura());
    }
    
    private void verPersona(){
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
    private void verProducto(){
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
    
    private void verFactura() {
        MdlEncabezado mdlencabezado = new MdlEncabezado() ;
        MdlDetalle mdldetalle = new MdlDetalle();
        MdlProducto mdlproducto = new MdlProducto();
        MdlPersona mdlpersona = new MdlPersona();
        
        try {
            visprincipal.getDskPrincipal().add(vistafactura);
        } catch (Exception e) {
            vistafactura = new VisFactura();
            visprincipal.getDskPrincipal().add(vistafactura);
        }
        CtrlFactura ctrlfactura = new CtrlFactura(mdlencabezado, mdldetalle,mdlproducto,mdlpersona,vistafactura);
        ctrlfactura.iniciarControl();
    }
    
    public static void CountRegistros(){
        visprincipal.getTlbProductos().setText(""+MdlProducto.count());
        visprincipal.getTlbPersonas().setText(""+MdlPersona.count());
        visprincipal.getTlbFacturar().setText(""+MdlEncabezado.count());
        visprincipal.getJlDetalles().setText(""+(MdlDetalle.count()));
        visprincipal.getJlDinero().setText(""+(MdlEncabezado.countTotal()));
    }
}

