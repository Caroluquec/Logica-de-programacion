
package ejercicio1;
import java.util.Scanner; 

public class Ejercicio1 {

    
    public static void main(String[] args) {
        
    
    
    Scanner lea = new Scanner(System.in);
    String marca_celular;
    float porc_des, precio, descuento, total_pagar;
    
    System.out.println("Ingrese mraca de celular");
    marca_celular= lea.nextLine();
    System.out.println("Ingrese precio de celular");
    precio= lea.nextFloat();
    System.out.println("Ingrese porcentaje de descuento");
    porc_des= lea.nextFloat();
     
    descuento= precio*porc_des/100;
    total_pagar= precio-descuento;
        
    System.out.println("Marca de celular "+ marca_celular + "Precio del celular" + precio + "Descuento " + descuento + "Total a pagar, " + total_pagar);
 
}
}