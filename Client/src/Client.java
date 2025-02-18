
import java.net.Socket;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunn_bsg8exk
 */
public class Client {
    private String nome;
    private String colore;
    Socket socket;
    
   public Client(String nome){
       this.nome = nome;
     
   }

    public void connetti(String nomeServer, int porta) {
        try {
            socket = new Socket(nomeServer, porta);//richiesta di connessione 
            System.out.println("Connessione avvennuta");
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connessione non riuscita");
        }
    }

    public void scrivi() {
    }
    
    public void leggi(){
        
    }

    public void chiudi() {
    }
         
}
