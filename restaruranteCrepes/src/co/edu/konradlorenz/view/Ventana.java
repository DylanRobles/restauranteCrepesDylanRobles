
package co.edu.konradlorenz.view;
import java.util.Scanner;

public class Ventana {
Scanner sc = 
        new Scanner(System.in);


public int ingresarPrecio(){//Retorna - No recibe
    System.out.println("Sr. Mesero Ingrese precio del plato");
    int p = sc.nextInt();
    return p;
}
public String orden(String dato){//Retorna - Recibe
    System.out.println("Sr. Mesero ingree el/la "+ dato);
    String o = sc.nextLine();
    return o;
}

public void mostrarPlato(String plato){
    System.out.println(plato);
    
}
public String facturar(String x, long y){
    System.out.println(x+""+y);
    return x +" "+ y;
}
    
    
}
