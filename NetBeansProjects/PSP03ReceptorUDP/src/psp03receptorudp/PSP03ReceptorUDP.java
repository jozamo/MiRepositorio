/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp03receptorudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author jozamo
 */
public class PSP03ReceptorUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sin argumentos
        if(args.length != 0){
            System.out.println("Uso: java ReceptorUDP");
        }else
            try{
              //crear el socket
                DatagramSocket socket = new DatagramSocket(1500);
                //crea espacio para los mensajes
                byte[] cadena = new byte[1000];
                DatagramPacket mensaje = new DatagramPacket(cadena, cadena.length);
                System.out.println("Esperando mensajes....");
                while(true){
                    //recibe mensaje
                    socket.receive(mensaje);
                    String datos = new String(mensaje.getData(),0,mensaje.getLength());
                    System.out.println("\tMensaje recibido: "+datos);
                }
            
        }catch(IOException ex){
                System.out.println("Error: "+ex.getMessage());
            
        }
    }
    
}
