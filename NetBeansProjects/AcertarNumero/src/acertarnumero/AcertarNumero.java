/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acertarnumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author jozamo
 */
public class AcertarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //int numAleatorio = (int) (Math.random()*100+1);
        //otra forma de calcular aleatorio
        Random r = new Random();
        int numAleatorio = r.nextInt(100);
        System.out.println(numAleatorio);
        String repetir="s";
        boolean acierto = false;
        System.out.println("-------ACIERTA UN ALEATORIO---------------");
        do{
            System.out.print("Numero: ");
            try {
                int num = Integer.parseInt(br.readLine());
                if (num == numAleatorio) {
                    acierto = true;
                } else if (num < numAleatorio) {
                    System.out.println("Número acertar es mayor");
                } else if (num > numAleatorio) {
                    System.out.println("Número acertar es menor");
                }
                if (!acierto) {
                    System.out.print("Repetir (s|n): ");
                    repetir = br.readLine();
                }
                
            } catch (IOException e) {
                System.out.println("error: " + e.getMessage());
            }catch(NumberFormatException e){
                System.out.println("Dato erroneo");
            }
            
        }while(repetir.equalsIgnoreCase("s") && !acierto);
        
        if (acierto) System.out.println("Acertaste!!!!!");
        else System.out.println("Abandonaste!!!!!");
        
        
        /*
        while (  !acierto){
            System.out.print("Introduzca numero [fin]->terminar ");
            try{
                repetir = br.readLine();
                int num = Integer.parseInt(repetir);
                if (num<numAleatorio)
                    System.out.println("Número acertar es mayor");
                else if (num>numAleatorio)
                    System.out.println("Número acertar es menor");
                else acierto = true;
            }catch(IOException e){
                System.out.println("Error de entrada y salida "+e.getMessage());
            }catch(NumberFormatException e){
                if(repetir.equalsIgnoreCase("fin"))
                    break;
                else System.out.println("dato introducido erroneo");
            }
        }
        if (acierto)
            System.out.println("Acertaste!!!");
        else
            System.out.println("Saliste voluntariamente, Adioss");
        */
    }
    
}
