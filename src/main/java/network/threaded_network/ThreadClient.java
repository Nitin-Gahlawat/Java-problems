//Question
    //Write a client for the TCP(multi-user) connection.
//Answer
package network.threaded_network;

import java.net.Socket;
import java.io.*;
import java.util.Scanner;

public class ThreadClient {
    public static void main(String[] args) throws IOException {
        System.out.println("Client is connecting...");
        try (Socket stk = new Socket("localhost", 2000); Scanner sc = new Scanner(System.in)) {

            System.out.println("Connected");

            try (PrintStream ps = new PrintStream(stk.getOutputStream());
                    BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()))) {
                        
                // reading of the client number form the server
                System.out.println("Client " + br.readLine());

                String str;
                do {
                    str = sc.nextLine();
                    ps.print(str + "\n");
                    ps.flush();
                    System.out.println(br.readLine());
                } while (!str.equals("end"));
            }
        }

    }
}