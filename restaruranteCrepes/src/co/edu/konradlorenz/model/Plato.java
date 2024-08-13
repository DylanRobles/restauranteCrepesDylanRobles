
package co.edu.konradlorenz.model;


public class Plato {

private String nombrePlato;
private String bebida;
private String nosedespueslocambio;
private int precio;



public Plato(String nombrePlato, String bebida, String nose, int precio){
    this.nombrePlato = nombrePlato;
    this.bebida = bebida;
    this.nosedespueslocambio = nose;
    this.precio = precio;
}


public int getPrecio(){
    
    return precio;
}
public void setPrecio(int precio){
    
}

    
}
