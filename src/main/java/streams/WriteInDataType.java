//Question
	//Write the Data into a file with there respective Data types using DataInputStream. 
//Answer


package streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Studentclass{
    int rollno;
    String name;
    String dept;
}
class StudentDatatype{
    static void write(File f)throws IOException{
        Studentclass ob=new Studentclass();
        ob.rollno=10;
        ob.name="Python";
        ob.dept="ME";
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream p=new DataOutputStream(fos);
        p.writeInt(ob.rollno);
        p.writeUTF(ob.name);
        p.writeUTF(ob.dept);
        p.close();
        fos.close();
    }
    static void read(File f)throws IOException{
        FileInputStream fis=new FileInputStream(f);
        DataInputStream br=new DataInputStream(fis);
        System.out.println(br.readInt());
        System.out.println(br.readUTF());
        System.out.println(br.readUTF());
        br.close();
        
    }
}
public class WriteInDataType {
    public static void main(String[] args) throws IOException{
        String f=System.getProperty("user.dir")+"\\src\\main\\java\\streams\\resource.txt";
        File fobj=new File(f);
        StudentDatatype.write(fobj);
        StudentDatatype.read(fobj);
    }
}
