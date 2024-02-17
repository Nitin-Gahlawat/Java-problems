//Question
    //Write a server for the TCP(multi-user) connection.
//Answer
package network.threaded_network;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class ThreadServer extends Thread {

    Socket stk;
    int ClientNumber;

    ThreadServer(Socket s, int i) {
        this.stk = s;
        this.ClientNumber = i;
    }

    @Override
    public void run() {
        try {
            PrintStream ps = new PrintStream(stk.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            String str, recived;

            // sending the client number to the client machine
            ps.println(ClientNumber);

            do {
                recived = br.readLine();
                str = "dne";
                try {
                    System.out.println("Client " + this.ClientNumber + ": String reciverd is " + recived);

                    str = new StringBuffer(recived).reverse().toString();

                    ps.print(str + "\n");
                    ps.flush();
                } catch (NullPointerException n) {
                    System.out.println("null pointer occured");
                    ps.println("\n");
                    ps.flush();
                } catch (Exception e) {
                    System.out.println("Exception occured");
                    ps.println("\n");
                    ps.flush();
                }
            } while (!str.equals("dne"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Server Started");
        try (ServerSocket ss = new ServerSocket(2000);) {
            System.out.println("Server ready to accept");
            int count = 1;
            do {
                Socket stk = ss.accept();
                ThreadServer ts = new ThreadServer(stk, count);
                System.out.println("client " + count++ + "  connected...");
                ts.start();
            } while (true);
        }
    }
}