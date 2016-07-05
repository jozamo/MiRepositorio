/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medirvelocidadordenador;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author jozamo
 */
public class MedirVelocidadOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();
        int starMinute = start.get(Calendar.MINUTE);
        int starSecond = start.get(Calendar.SECOND);
        start.roll(Calendar.MINUTE, true);
        int nextminute = start.get(Calendar.MINUTE);
        int nextSecond = start.get(Calendar.SECOND);
        int index = 0;
        while(true){
            double x = Math.sqrt(index);
            GregorianCalendar now = new GregorianCalendar();
            if (now.get(Calendar.MINUTE)>=nextminute){
                if(now.get(Calendar.SECOND)>=nextSecond){
                    break;
                }
            }
            index++;
        }
        System.out.println(index + " Loop en un minuto");
               
    }
    
}
