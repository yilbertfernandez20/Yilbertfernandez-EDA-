package estructuras.datos;

import estructuras.objeto.objeto;

public class nodosimple {
    objeto auto=new objeto();
   
    private nodosimple siguiente;
    
    public nodosimple(objeto auto){
        this.auto=auto;
        
        this.siguiente=null;
    }
    public objeto getAuto(){
        return auto;
    }
    public void setAuto(objeto auto){
        this.auto=auto;
    }
    public nodosimple getsiguiente(){
        return siguiente;
    }
    public void setsiguiente(nodosimple siguiente){
        this.siguiente=siguiente;
    }
}
