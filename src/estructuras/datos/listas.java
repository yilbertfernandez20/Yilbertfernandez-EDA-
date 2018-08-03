package estructuras.datos;

import estructuras.objeto.objeto;
import javax.swing.JOptionPane;

public class listas {
    private nodosimple inicio, fin;
    objeto auto;
    private int tamaño;
    
    public void listas(){
        auto=new objeto();
        inicio=null;
        fin=null;
    }
    public boolean esvacia(){
        return inicio == null;
    }
    
    public int gettamaño(){
        return tamaño;
    }
    
    public void agregaralfinal(objeto auto){
        nodosimple nuevo= new nodosimple(auto);
        
        if(esvacia()){
            inicio=nuevo;
            fin=nuevo;
        }else {
            nodosimple aux=inicio;
            
            while(aux.getsiguiente() !=null){
                aux=aux.getsiguiente();
            }
            
            aux.setsiguiente(nuevo);
        }
        tamaño++;
        System.out.println("guardo en simple");
    }
    
    public boolean agregaalinicio(objeto auto){
        nodosimple nuevo = new nodosimple(auto);
        
        if(esvacia()){
            inicio=nuevo;
        }else {
            nuevo.setsiguiente(inicio);
            
            inicio=nuevo;
        }
        //tamaño++;
        System.out.println("guardo en simple");
        
        return false;
    }
    
    public void imprimir(){
        if(!esvacia()){
            nodosimple aux=inicio;
            
            int i=0;
            
            while(aux !=null){
                JOptionPane.showMessageDialog(null, i+".[ "+aux.getAuto()+" ]"+"->");
                
                aux=aux.getsiguiente();
                
                i++;
            }
            System.out.println("");
        }
    }
    
    public objeto getvalor(int posicion) throws Exception{
        if(posicion>= 0 &&  posicion<tamaño){
            if(posicion==0){
                return inicio.getAuto();
            }else{
                nodosimple aux=inicio;
                
                for(int i=0; i<posicion;i++){
                    aux=aux.getsiguiente();
                }
                return aux.getAuto();
            }
        }else{
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
    
    public void eliminar(){
        inicio=null;
        
        tamaño=0;
    }
    
}
