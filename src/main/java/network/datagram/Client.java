//Question
    //Write a client for the Datagram connection.
//Answer

package network.datagram;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
import java.io.IOException;
import java.net.DatagramPacket;

public class Client {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in); DatagramSocket ds = new DatagramSocket(2001)) {
           
            System.out.println("Enter a String");
            String s = sc.nextLine();
            System.out.println("sending the data to server :-----\n" + s);

            DatagramPacket dp = new DatagramPacket(s.getBytes(), s.length(), InetAddress.getByName("localhost"), 2000);

            ds.send(dp);

            byte[] b = new byte[1024];
            dp = new DatagramPacket(b, 1024);
            ds.receive(dp);

            s = new String(dp.getData()).strip();
            System.out.println("receiving the data from the server :-----");
            System.out.println(s);

        }
    }
}