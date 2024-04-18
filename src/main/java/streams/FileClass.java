//Question
    //Show the use of the File class in java.
//Answer
package streams;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileClass {
    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir") + "\\src\\main\\java\\streams";
        File f = new File(path);

        System.out.println("Parent Directory \t" + f.getParent());

        System.out.println(Arrays.toString(f.list()));

        File[] filesarr = f.listFiles();
        for (File file : filesarr) {
            System.out.print(file.getName() + " \t");
            System.out.println(file.getPath());
        }

        System.out.println("is f a Directory \t" + f.isDirectory());
        System.out.println("is f a file      \t" + f.isFile());

        /*
         * Creating a file and performing various operation like setReadOnly and setWritable
         */

        String path1 = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\main.txt";
        File file = new File(path1);

        file.setReadOnly(); // As the read only is enabled FileOutputStream write method give error
        // file.setWritable(true);


        FileOutputStream sos = new FileOutputStream(file);
        sos.write(200); // <--Error if setReadOnly enabled
        sos.close();
    }
}
