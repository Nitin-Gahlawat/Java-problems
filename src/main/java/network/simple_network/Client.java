//Question
    //Write a client for the TCP(single user) connection.
//Answer

package network.simple_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("Client is connecting...");
        try (Socket stk = new Socket("localhost", 2000); Scanner sc = new Scanner(System.in)) {
            System.out.println("Connected");
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(stk.getOutputStream()));
                    BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()))) {
                String str;
                do {
                    System.out.println("enter the string");
                    str = sc.nextLine();
                    bw.write(str + "\n");
                    bw.flush();
                    System.out.println(br.readLine());
                } while (!str.equals("end"));
            }
        }

    }
}