/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jozamo
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("nota: ");
        try {
            nota = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Notas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        switch (nota){
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("Nota introducida erronea");
            
        }
        if (nota < 5)
            System.out.println("Suspenso");
        else if(nota >=5 && nota <7)
                System.out.println("Aprobado");
        else if(nota>=7 && nota<9)
            System.out.println("Notable");
        else if(nota>=9 && nota <=10)
            System.out.println("Sobresaliente");
    }
    
}
