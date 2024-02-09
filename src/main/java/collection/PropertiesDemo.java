//Question 
    //Show the writing of data in properties file using Properties class.
//Answer

package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String xml=System.getProperty("user.dir")+"\\src\\main\\java\\collection\\Data.xml";
        String txt=System.getProperty("user.dir")+"\\src\\main\\java\\collection\\Data.txt";
        Properties p=new Properties();
        p.putAll(Map.of("Brand","Dell","Lang","Java","OS","Unix"));

        p.store(new FileOutputStream(txt), "Laptop");

        p.storeToXML(new FileOutputStream(xml), "Laptop");

        p.load(new FileInputStream(txt));
        System.out.println(p);

        p.loadFromXML(new FileInputStream(xml));
        System.out.println(p);
    }
}
