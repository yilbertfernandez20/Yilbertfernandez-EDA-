package estructuras.datos;

import estructuras.objeto.objeto;

public class nododobles {
    objeto auto=new objeto();
    
    private nododobles anterior;
    private nododobles siguiente;
    
    public nododobles(objeto auto){
        this.auto=auto;
        this.anterior=null;
        this.siguiente=null;
    }
    
    public objeto getAuto(){
        return auto;
    }
    
    public void setAuto(objeto auto){
        this.auto=auto;
    }
    
    public nododobles getAnterior(){
        return anterior;
    }
    
    public void setAnterior(nododobles anterior){
        this.anterior=anterior;
    }
    
    public nododobles getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(nododobles siguiente){
        this.siguiente=siguiente;
    }
}
