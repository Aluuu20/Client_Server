/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author alunn_bsg8exk
 */
public class MainServer {
        public static void main(String[] args) {
        Server s = new Server(20000);
        System.out.println("Server in avvio e sta aspettando la connessione al client...");
        s.attendi();
       
    }
}
