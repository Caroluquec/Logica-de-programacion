
package case1;
import java.util.Scanner;

public class Case1 {

   
    public static void main(String[] args) {
        
        Scanner lea=new Scanner (System.in);
        int numero;
        String dia;
        System.out.println("#Digite un numero de 1 a 7");
        numero=lea.nextInt();
        switch (numero){
            case 1: dia= "Lunes";
            break;
            
            case 2: dia= "Martes";
            break;
            
            case 3: dia= "Miercoles";
            break;
            
            case 4: dia= "Jueves";
            break;
            
            case 5: dia= "Viernes";
            
            
            case 6: dia= "Sabado";
            break;
            
            case 7: dia= "Domingo";
            break;
            
            default: dia="Error al digitar número";
            
        }
        
        System.out.println(dia);
            
            
        
        
        
        
        
      
    }
    
}
