//Question
    //WAP to show the use of Data O/I Stream.
//Answer

package streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataObject {
    static void write(File f) throws IOException {
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        float[] arr = new float[] { 4f, 4.5f, 5.6f, 2.9f, 7.6f };
        for (int i = 0; i < arr.length; i++) {
            dos.writeFloat(arr[i]);
        }
        dos.close();
        fos.close();
    }

    static void read(File f) throws Exception {
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        int ct = (int) dis.readFloat();
        System.out.println("The Value stored are:");
        for (int i = 1; i <= ct; i++) {
            System.out.println(dis.readFloat());
        }
        dis.close();
        fis.close();
    }
}

public class DataIO {
    public static void main(String[] args) throws Exception {
        String f = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\Data.txt";
        File fobj = new File(f);
        DataObject.write(fobj);
        DataObject.read(fobj);
    }
}
