/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author alumnoutm
 */
public class Reto12 {

    public static BufferedReader entrada = new BufferedReader ( new InputStreamReader(System.in));
   
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int numeroKm;
        int nivelVidaCaballo = 0;
        int nivelVidaUsuario = 0;
        int kmrecorrido = 0;
        int opcion = 0;
        
        System.out.println("Ingrese cantidad de km a recorrer");
        numeroKm = Integer.parseInt(entrada.readLine());
        
        System.out.println("Ingrese nivel de vida de caballo");
        nivelVidaCaballo = Integer.parseInt(entrada.readLine());
        
        Random aleatorio = new Random(System.currentTimeMillis());
        for(int KmActual = 1; KmActual <= numeroKm; KmActual++){
            System.out.println("El caballo esta en el km" + KmActual);
            
            if(kmrecorrido == 5){
                opcion = aleatorio.nextInt(4) + 1;
                switch(opcion){
                    case 1:
                    nivelVidaUsuario += 10;
                        System.out.println(" --- Encontramo un paquete de vida =) --- ");
                        System.out.println(" --- + 10 puntos al usuario --- ");
                        break;
                        
                    case 2:
                        nivelVidaUsuario -= 5;
                        nivelVidaCaballo -= 5;
                        System.out.println(" --- Enontramos una bomba =( --- ");
                        System.out.println(" --- -5 puntos al usuario ---- ");
                        System.out.println(" --- -5 puntos al caballo ---- ");
                        break;
                        
                    case 3:
                        nivelVidaCaballo += 10;
                        System.out.println(" --- Encontramos un pasto =) --- ");
                        System.out.println(" --- +10 puntos al usuario --- ");
                        break;
                        
                    case 4:
                        nivelVidaCaballo -= 5;
                        System.out.println(" --- Encontramos una trampa =( ---- ");
                        System.out.println(" --- -5 puntos al caballo --- ");
                        break;
                        
                }
                
                kmrecorrido = 0;
                
            }else{
                opcion = aleatorio.nextInt(3) + 1;
                if(opcion == 1){
                    nivelVidaUsuario += 10;
                    System.out.println(" --- Encontramos un paquete de vida =) ---");
                    System.out.println(" --- + 10 puntos al usuario =) ---");
                    
            }else if(opcion == 2){
                    nivelVidaUsuario -=5;
                    nivelVidaCaballo -=5;
                    System.out.println(" --- Encontramos una bomba =( ---");
                    System.out.println(" --- -5 puntos al usuario ---");
                    System.out.println(" --- -5 puntos al usuario");
                    }       
            }
            
            kmrecorrido++;
            
            if(nivelVidaUsuario == 0 || nivelVidaCaballo == 0){
                System.out.println(" --- Se acabo el juego =( --- ");
                break;
            }
        }
    }
    
}
