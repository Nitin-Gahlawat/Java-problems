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

class Customber implements Serializable {
    String id;
    String name;
    String phone;
    static private int temp = 2000;

    Customber(String name, String phone) {
        this.name = name;
        this.phone = phone;
        id = "c" + temp;
        temp++;
    }

    Customber() {
    }

    @Override
    public String toString() {
        return "Customber id : " + this.id + "\nName : " + this.name + "\nPhone :" + this.phone;
    }
}

public class ObjectIO {
    static void write(String f) throws IOException {
        FileOutputStream fis = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fis);

        Customber one= new Customber("Jhon", "102558");
        Customber two= new Customber("Smith", "7852");
        Customber three=new Customber("Jack", "45231");
        Customber four=new Customber("Ajay", "546325");

        Customber[] cusarr = {one,two,three,four};
        oos.writeInt(cusarr.length);
        for (Customber cus : cusarr) {
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
            Customber c = (Customber) ois.readObject();
            if (c.name.equalsIgnoreCase(name) && !isPresent){
                System.out.println(c);
                isPresent=true;
            }
        }
        if(!isPresent){
            System.out.println("The Customber does not exit");
        }

        ois.close();
        fis.close();
    }

    public static void main(String[] args) throws Exception {
        String f = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\Customber.txt";
        write(f);
        System.out.println("Enter the name of the customber");
        Scanner ob = new Scanner(System.in);
        read(f, ob.next());
        ob.close();
    }
}
