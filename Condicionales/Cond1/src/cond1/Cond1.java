
package cond1;
import java.util.Scanner;

public class Cond1 {

   
    public static void main(String[] args) 
         {
        Scanner lea= new Scanner (System.in);
        float precio, nuevo_precio;
        System.out.println("Digite precio articulo");
        precio= lea.nextFloat();
        if (precio<2800){
            nuevo_precio=precio+precio*15/100; 
            System.out.println("Precio inicial " + precio);
            System.out.println("Nuevo precio: "+ nuevo_precio);
            
        }
        
        else{
            nuevo_precio=precio;
            System.out.println("Precio sin incremento " + nuevo_precio);
        }
   
    }
    

    }