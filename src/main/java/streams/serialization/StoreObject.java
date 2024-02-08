//Question
    //WAP to use of Serializable and Object I/O Stream.
//Answer

package streams.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Studentype implements Serializable {
    int rollno;
    String name;
    String dept;

    Studentype(int rollno, String name, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
    }
    Studentype() {

    }
}

class DataObject {

    // Writing the data in the array format(array of Studentype)
    static void writearr(File f) throws IOException {
        Studentype ob[] = new Studentype[5];
        for (int i = 0; i < ob.length; i++) {
            ob[i] = new Studentype(i, "Java Object", "Space ");
        }
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream p = new ObjectOutputStream(fos);
        p.writeObject(ob);
        p.close();
        fos.close();
    }

    // Reading the data in the array format(array of Studentype)
    static void readarr(File f) throws Exception {
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream br = new ObjectInputStream(fis);
        Studentype s[];
        s = (Studentype[]) br.readObject();
        for (int i = 0; i < 5; i++) {
            System.out.println(s[i].rollno + " " + s[i].name + " " + s[i].dept);
        }
        br.close();

    }

    static void write(File f) throws IOException {
        Studentype ob = new Studentype(2000, "Java Object", "Space ");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream p = new ObjectOutputStream(fos);
        p.writeObject(ob);
        p.close();
        fos.close();
    }

    static void read(File f) throws Exception {
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream br = new ObjectInputStream(fis);
        Studentype s;
        s = (Studentype) br.readObject();
        System.out.println(s.rollno + " " + s.name + " " + s.dept);
        br.close();

    }
}

public class StoreObject {
    public static void main(String[] args) throws Exception {
        String f = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\serialization\\resource.txt";
        File fobj = new File(f);
        DataObject.write(fobj);
        DataObject.read(fobj);
    }
}
