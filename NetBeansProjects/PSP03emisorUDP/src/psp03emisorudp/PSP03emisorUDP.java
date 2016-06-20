/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp03emisorudp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOException;

/**
 *
 * @author jozamo
 */
public class PSP03emisorUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String msj = null;
        System.out.print("Escribe mensaje: ");
        try {
            msj = escribir();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        System.out.println("mensaje eviado: " + msj);

        try {
            DatagramSocket socket = new DatagramSocket();
            //contruye dirección del socket del receptor
            InetAddress maquina = InetAddress.getByName("localhost");
            int puerto = 1500;
            //crear mensaje
            byte[] cadena = msj.getBytes();
            DatagramPacket mensaje = new DatagramPacket(cadena, msj.length(), maquina, puerto);
            //envia el mensaje
            socket.send(mensaje);
            //cierra el socket
            socket.close();
            

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    private static String escribir() throws IOException{
       
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        return br.readLine();
    }

}
