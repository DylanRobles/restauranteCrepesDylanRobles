
package co.edu.konradlorenz.contoller;

import co.edu.konradlorenz.model.Plato;
import co.edu.konradlorenz.view.Ventana;


public class Mesero {
    
   protected Plato objPlato = new Plato();
   protected Ventana objVentana = new Ventana();
    
    public void run(){ //no retorna ni recibe parametros
        //paso 1: Tomar el pedido
        String aux = objVentana.orden("nombre del plato");
        objPlato.setNombrePlato(aux);
        aux = objVentana.orden("nombre de la bebida");
         objPlato.setBebida(aux);
        aux = objVentana.orden("anotaciones");
        objPlato.setAnotacion(aux);
        
        objPlato.setPrecio(objVentana.ingresarPrecio());
        
        //paso 3: Tomar el plato de la cocina y entregar el plato preparado
       objVentana.mostrarPlato(objPlato.toString());
        //paso 4: cobrar
        int x = (int)(objPlato.getPrecio()*0.8);
        objVentana.mostrarPlato("FACTURA");
          objVentana.facturar(objPlato.getNombrePlato(), x);
        x = (int)(objPlato.getPrecio()*0.2);
        objVentana.facturar(objPlato.getBebida(), x);
         objVentana.facturar("TOTAL A PAGAR", objPlato.getPrecio());
        
    }
    
}
