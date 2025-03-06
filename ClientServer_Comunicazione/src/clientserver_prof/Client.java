import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String hostName = "localhost";
        int port = 30000;

        try (Socket socket = new Socket(hostName, port);
                
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//legge i dati dal server/socket/host
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in)))//legge da tastiera
             {
            System.out.println("Connessione con il server");
            System.out.println("Scrivi un messaggio");
            
            String userInput;
        
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("Server: " + in.readLine());
                 
               

                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        }
    }
}
