/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunn_bsg8exk
 */
public class MainClient {
    public static void main(String[] args){
            Client cl = new Client("Alu");
            cl.connetti("localhost", 2000);
            cl.scrivi();
            cl.chiudi();
    }
}
