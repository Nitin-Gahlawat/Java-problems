//Question
	//WAP all the data fields of a Class file in resource.txt.
//Answer
package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student{
    int rollno;
    String name;
    String dept;
}
class StudentData{
    static void write(File f)throws IOException{
        Student ob=new Student();
        ob.rollno=200;
        ob.name="Java";
        ob.dept="CSE";
        FileOutputStream fos=new FileOutputStream(f);
        PrintStream p=new PrintStream(fos);
        p.println(ob.rollno);
        p.println(ob.name);
        p.println(ob.dept);
        p.close();
        fos.close();
    }
    static void read(File f)throws IOException  {
        FileInputStream fis=new FileInputStream(f);
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        System.out.println("rollno "+Integer.parseInt(br.readLine()));
        System.out.println("name "+br.readLine());
        System.out.println("dept "+br.readLine());
        br.close();

    }
}
public class WritingClassFile {
    public static void main(String[] args) throws IOException{
        String f=System.getProperty("user.dir")+"\\src\\main\\java\\streams\\resource.txt";
        File fobj=new File(f);
        StudentData.write(fobj);
        StudentData.read(fobj);
        
    }
}
