//Question
    //Write a server for the TCP(single user) connection.
//Answer

package network.simple_network;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("Server Started");
        try (ServerSocket ss = new ServerSocket(2000);) {

            System.out.println("Server ready to accept");
            try (Socket stk = ss.accept();
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(stk.getOutputStream()));
                    BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));) {

                String recived, str;
                do {
                    System.out.println("Wating for the string from client ");
                    recived = br.readLine();

                    System.out.println("String reciverd is from client:---" + recived);

                    str = new StringBuffer(recived).reverse().toString();

                    bw.write(str + "\n");
                    bw.flush();
                } while (!str.equals("dne"));
            }
        }
    }
}