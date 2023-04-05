
package cond4;
import Java.util.Scanner;

public class Cond4 {

  
    public static void main(String[] args) {
        
        Scaner lea=new Scanner(System.in);
        String placa, ruta;
        int nro_pasajeros;
        float dinero_rec;
        System.out.println("Digite la placa del bus");
        placa=lea.next();
        System.out.println("Digite cantidad de pasajeros");
        nro_pasajeros=lea.nextInt();
        System.out.println("Digite ruta del bus A/B");
        ruta=lea.next();
        /*ruta=ruta.ToUpperCase();*/ /* Esto lo pongo para poder diferenciar las letras mayusculas de las minuscula/*
               */
        if (ruta.equals ("A") || ruta.equals ("a")) {
            dinero_rec=nro_pasajeros*1000;
        }
        else {
            if (ruta.equals ("B") || ruta.equals ("b")){
                dinero_rec=nro_pasajeros*1200;
            }
            
            else
                dinero_rec=0;
                System.out.println("Ruta incorrecta...!!!");
            }
        
        System.out.println("Placa del bus:" + placa);
        System.out.println("Ruta: " + ruta);
        System.out.println("Valor rdinero recolectado:" + dinero_rec);
        
        }
        
         
        
        
        
        
    }
    

