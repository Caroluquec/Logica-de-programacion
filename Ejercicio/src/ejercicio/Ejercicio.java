
package ejercicio;
import java.util.Scanner;


public class Ejercicio {

    
    public static void main(String[] args) {
       
        Scanner lea = new Scanner (System.in);
        float vehiculos, camionetas, buses, motocicletas, total;
        float porc_vehi, porc_cami, porc_buses, porc_motos;
        vehiculos= 55;
        camionetas= 35;
        buses= 25;
        motocicletas= 65;
        total= vehiculos + camionetas + buses + motocicletas;
        porc_vehi= vehiculos*100/total;
        porc_cami= camionetas*100/total;
        porc_buses= buses*100/total;
        porc_motos= motocicletas*100/total;
        System.out.println("Total vehículos " + vehiculos + ",porcentaje:, "+ porc_vehi+ " %");
        System.out.println("Total camionetas " + camionetas+ ",porcentaje:," + porc_cami+ " %");
        System.out.println("Total buses " + buses + ",porcentaje:, " + porc_buses+ " %");
        System.out.println("Total motocicletas " + motocicletas + ",porcentaje:, "+ porc_motos+ " %");
        
        
                
    }
    
}
