
package co.edu.konradlorenz.model;


public class Plato {

private String nombrePlato;
private String bebida;
private String anotacion;
private int precio;



public Plato(String nombrePlato, String bebida, String anotacion, int precio){
    this.nombrePlato = nombrePlato;
    this.bebida = bebida;
    this.anotacion = anotacion;
    this.precio = precio;
}
public Plato(){
    
}


public int getPrecio(){
    
    return precio;
}
public void setPrecio(int precio){
    
}

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    @Override
    public String toString() {
        return "Plato{" + "nombrePlato= " + nombrePlato + ", bebida= " + bebida + ", anotacion= " + anotacion + ", precio= " + precio + '}';
    }



    
}
