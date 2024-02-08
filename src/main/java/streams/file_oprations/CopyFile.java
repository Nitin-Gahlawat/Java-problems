//Question
	//Copy CopyFile.java to resource.txt by changing its content to upper case.
//Answer

package streams.file_oprations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		String source=System.getProperty("user.dir")+"\\src\\main\\java\\streams\\file_oprations\\CopyFile.java";
		String dist=System.getProperty("user.dir")+"\\src\\main\\java\\streams\\file_oprations\\resource.txt";
		

		//Reading and Storing the array in outputArray
		FileInputStream read=new FileInputStream(source);
		byte[] outputArray=new byte[read.available()];
		read.read(outputArray);
		read.close();
		

		//Writing to file from outputArray
		FileOutputStream write = new FileOutputStream(dist);
		String str=new String(outputArray);
		write.write(str.toUpperCase().getBytes());
		write.close();
	}
}
