package estructuras.objeto;

public class objeto {
    private String marca, modelo, color, descripcion;
    private int ano;
    
    public objeto(){}
    
    objeto(String marca,String modelo, String color, String descri, int ano){
        setMarca(marca);
        setModelo(modelo);
        setColor(color);
        setDescripcion(descri);
        setAno(ano);
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public String getDescri(){
        return descripcion;
    }
    public int getAno(){
        return ano;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String toString(){
        return "Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nColor: "+getColor()+"\nDescripcion: "+getDescri()+"\nAño: "+getAno();
    }
    
}
