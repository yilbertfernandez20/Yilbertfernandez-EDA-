package estructuras.datos;

import estructuras.objeto.objeto;
import javax.swing.JOptionPane;

public class listas_dobles {
    private nododobles inicio;
    private nododobles ultimo;
    
    private int tamano;
    
    objeto auto;
    
    public void listas_dobles(){
        inicio=null;
        ultimo=null;
        
        tamano=0;
        
        auto=new objeto();
    }
    
    public boolean esvacia(){
        return inicio==null;
    }
    
    public int gettamano(){
        return tamano;
    }
    
    public boolean insertar(objeto auto){
        nododobles actual=new nododobles(auto);
        
        if(esvacia()){
            inicio=actual;
            ultimo=inicio;
            inicio.setAnterior(ultimo);
            
            System.out.println("Primero: "+inicio.getAuto().getMarca());
        }else{
            ultimo.setSiguiente(actual);
            actual.setAnterior(ultimo);
            ultimo=actual;
            ultimo.setSiguiente(inicio);
            
            System.out.println("Ultimo: "+actual.getAuto().getMarca());
        }
        tamano++;
        return false;
    }
    
    public void imprimir(int numerovueltas){
        String salida="";
        
        if(!esvacia()){
            nododobles aux=inicio;
            int i=0;
            
            while(aux != null && i<=numerovueltas ){
                salida+=i+"="+aux.getAuto().toString()+"\n\n";
                System.out.println("---------"+"\r\n");
                
                if(aux.getAnterior()==null){
                    System.out.println("Anterior= "+null+"\r\n");
                }else{
                    System.out.println("Anterior= "+aux.getAnterior().getAuto().toString()+"\r\n");
                }
                
                System.out.println(i+".["+aux.getAuto().toString()+"]"+"\r\n");
                
                if(aux.getSiguiente() != null){
                    System.out.println("Next= "+aux.getSiguiente().getAuto()+"\r\n");
                }else{
                    System.out.println("Next= "+null+"\r\n");
                }
                System.out.println("------"+"\r\n");
                
                aux=aux.getSiguiente();
                
                i++;
            }
            System.out.println("");
            JOptionPane.showMessageDialog(null,salida);
        }
    }
    
    public objeto getValor(int posicion) throws Exception{
        if(posicion >=0 && posicion<tamano){
            if(posicion==0){
                return inicio.getAuto();
            }else{
                nododobles aux = inicio;
                for(int i=0; i<posicion; i++){
                    aux=aux.getSiguiente();
                }
                return aux.getAuto();
            }
        }else{
            throw new Exception("Posicion inexistente en la lista.");
    }
    
}
    public void eliminar(){
        inicio=null;
        
        tamano=0;
    }
    
    public String buscar(String nombre){
        nododobles aux=inicio;
        
        boolean encontrado=false;
        
        String resul="No esta";
        
        while(aux!=null&& encontrado!=true){
            if(aux.getAuto().getMarca().equalsIgnoreCase(nombre)){
                encontrado=true;
                resul="La informacion se encuentra guardada";
                imprimir(tamano);
                
            }else{
                aux=aux.getSiguiente();
            }
        }
        System.out.println(resul);
        return resul;
    }
}
