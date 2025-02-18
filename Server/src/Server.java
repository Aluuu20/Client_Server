
/**
 *
 * @author alu
 */

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    private ServerSocket serverSocket; //instanziare una connessione
    private Socket clientSocket; //oggetto socket che serve a scambiare dati
    private int porta;
    
    
   
    //metodo SOCKET - BIND - LISTEN
    public Server(int porta) {
        this.porta = porta;
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("Server in ascolto sulla porta: " + porta);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Server non in ascolto");
        }
    }
    
    public Socket attendi(){
        try {
            clientSocket = serverSocket.accept();//accept restituisce il data socket quando arriva la richiesta    
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientSocket;
    }
    
    public void chiudi(){
        
    }
   
}

