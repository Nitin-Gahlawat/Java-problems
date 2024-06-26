//Question
    //WAP to show the use of Object I/O Stream.
//Answer

package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer implements Serializable {
    String id;
    String name;
    String phone;
    static private int temp = 2000;

    Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        id = "c" + temp;
        temp++;
    }

    Customer() {
    }

    @Override
    public String toString() {
        return "Customer id : " + this.id + "\nName : " + this.name + "\nPhone :" + this.phone;
    }
}

public class ObjectIO {
    static void write(String f) throws IOException {
        FileOutputStream fis = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fis);

        Customer one= new Customer("Jon", "102558");
        Customer two= new Customer("Smith", "7852");
        Customer three=new Customer("Jack", "45231");
        Customer four=new Customer("Ajay", "546325");

        Customer[] cusarr = {one,two,three,four};
        oos.writeInt(cusarr.length);
        for (Customer cus : cusarr) {
            oos.writeObject(cus);
        }
        oos.close();
        fis.close();
    }

    static void read(String f, String name) throws Exception {
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        int ct = ois.readInt();
        boolean isPresent=false;

        for (int i = 1; i <= ct; i++) {
            Customer c = (Customer) ois.readObject();
            if (c.name.equalsIgnoreCase(name) && !isPresent){
                System.out.println(c);
                isPresent=true;
            }
        }
        if(!isPresent){
            System.out.println("The Customer does not exit");
        }

        ois.close();
        fis.close();
    }

    public static void main(String[] args) throws Exception {
        String f = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\Customer.txt";
        write(f);
        System.out.println("Enter the name of the customer");
        Scanner ob = new Scanner(System.in);
        read(f, ob.next());
        ob.close();
    }
}
