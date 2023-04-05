
package examen1;
import java.util.Scanner;

public class Examen1 {

  
    public static void main(String[] args) {
        
       Scanner lea= new Scanner (System.in);
       
       String nomb_hijo1,nomb_hijo2,nomb_hijo3,nomb_hijo4,nomb_hijo5;
       Float valor_herencia,valor_hijo1,valor_hijo2,valor_hijo3,valor_hijo4, valor_hijo5, porc_hijo1,porc_hijo2, porc_hijo3, porc_hijo4,porc_hijo5;
        System.out.println("Ingrese nombre hijo 1");
        nomb_hijo1= lea.nextLine();
        System.out.println("Ingrese nombre hijo 2");
        nomb_hijo2= lea.nextLine();
        System.out.println("Ingrese nombre hijo 3");
        nomb_hijo3= lea.nextLine();
        System.out.println("Ingrese nombre hijo 4");
        nomb_hijo4= lea.nextLine();
        System.out.println("Ingrese nombre hijo5");
        nomb_hijo5= lea.nextLine();
        System.out.println("Ingrese porcentaje hijo 1");
        porc_hijo1= lea.nextFloat();
        System.out.println("Ingres porcentaje hijo 2");
        porc_hijo2= lea.nextFloat();
        System.out.println("Ingres porcentaje hijo 3");
        porc_hijo3= lea.nextFloat();
        System.out.println("Ingres porcentaje hijo 4");
        porc_hijo4= lea.nextFloat();
        System.out.println("Ingres porcentaje hijo 5");
        porc_hijo5= lea.nextFloat();
        System.out.println("Ingrese valor herencia ");
        valor_herencia= lea.nextFloat();
        
        valor_hijo1=valor_herencia*10/100;              
        valor_hijo2=valor_herencia*15/100;               
        valor_hijo3=valor_herencia*20/100;
        valor_hijo4=valor_herencia*25/100;
        valor_hijo5=valor_herencia*30/100;
        
        System.out.println("Con una herencia herencia " + valor_herencia + " El hijo 1 llamado " + nomb_hijo1 + " Con porcentaje de herencia " + porc_hijo1 + " Le corresponde " + valor_hijo1);
        System.out.println("Con una herencia herencia " + valor_herencia + " El hijo 2 llamado " + nomb_hijo2 + " Con porcentaje de herencia  " + porc_hijo1 + " Le corresponde " + valor_hijo2);        
        System.out.println("Con una herencia herencia " + valor_herencia + " El hijo 3 llamado  " + nomb_hijo3 + " Con porcentaje de herencia  " + porc_hijo1 + " Le corresponde  " + valor_hijo3);
        System.out.println("Con una herencia herencia " + valor_herencia + " El hijo 4 llamado " + nomb_hijo4 + " Con porcentaje de herencia  " + porc_hijo1 + " Le corresponde  " + valor_hijo4);
        System.out.println("Con una herencia herencia " + valor_herencia + " El hijo 5 llamado  " + nomb_hijo5 + " Con porcentaje de herencia" + porc_hijo1 + " Le corresponde  " + valor_hijo5);   
        
                
       
       
       
               
       
               
        
 
        
        
        
    }
    
}
