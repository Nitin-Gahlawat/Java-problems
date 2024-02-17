//Question
    //Write a server for the Datagram connection.
//Answer
package network.datagram;


import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.IOException;
import java.net.DatagramPacket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("server waiting for the data");
        DatagramSocket ds=new DatagramSocket(2000);

        byte[] b=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b, 1024);

        ds.receive(dp);
        
        String s=new String(dp.getData()).strip();
        System.out.println("Data recived\n"+s);

        s=new StringBuilder(s).reverse().toString();


        dp=new DatagramPacket(s.getBytes(),s.length(),InetAddress.getByName("localhost"),2001);
        System.out.println("sending the data back \n"+s);
        ds.send(dp);

        ds.close();

    }
}