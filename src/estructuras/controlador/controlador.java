package estructuras.controlador;

import estructuras.datos.colas;
import estructuras.datos.listas;
import estructuras.datos.listas_dobles;
import estructuras.interfaz.interfaz;
import estructuras.interfaz.interfazConsulta;
import estructuras.objeto.objeto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador implements ActionListener{
    interfaz inter;
    objeto objAuto;
    listas_dobles datosDo;
    listas datosSi;
    colas datosCo;
    interfazConsulta interCons;
    int max=0;
    
    public controlador(){
        
        
        inter=new interfaz();
        interCons=new interfazConsulta();
        objAuto=new objeto();
        datosDo=new listas_dobles();
        datosSi=new listas();
        datosCo=new colas();
    } 
    
    public void inicializar(){
        inter.BSalir.addActionListener(this);
        inter.Bguardar.addActionListener(this);
        inter.Bconsultar.addActionListener(this);
        interCons.Batras.addActionListener(this);
        interCons.Bbuscar.addActionListener(this);
    }
    
    public void limpiar(){
        inter.Txtmarca.setText(null);
        inter.Txtmodelo.setText(null);
        inter.Txtano.setText(null);
        inter.Txtcolor.setText(null);
        inter.TxtDescri.setText(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==inter.BSalir){
            int opc= JOptionPane.showConfirmDialog(null,"Desea salir","Salir", JOptionPane.YES_NO_OPTION);
            if(opc==JOptionPane.YES_OPTION){
                System.exit(0);
            }  
        }
        if(e.getSource()==inter.Bguardar){
            objAuto.setMarca(inter.Txtmarca.getText());
            objAuto.setModelo(inter.Txtmodelo.getText());
            objAuto.setAno(Integer.parseInt(inter.Txtano.getText()));
            objAuto.setColor(inter.Txtcolor.getText());
            objAuto.setDescripcion(inter.TxtDescri.getText());
            
            if(datosDo.insertar(objAuto) || datosSi.agregaalinicio(objAuto)){
                JOptionPane.showMessageDialog(null, "Error al guardar informacion.");
            }else {
                JOptionPane.showMessageDialog(null, "Informacion del Automovil guardada satisfactoriamente.");
                limpiar();
            }
        }
        if(e.getSource()==inter.Bconsultar){
            inter.setVisible(false);
            interCons.setVisible(true);
        }
        if(e.getSource()==interCons.Batras){
            interCons.setVisible(false);
            inter.setVisible(true);
        }
        if(e.getSource()==interCons.Bbuscar){
            
            datosDo.buscar(interCons.Txtbuscar.getText());
            datosSi.imprimir();
            datosCo.MostrarCola();
            
        }
    }
    
}
