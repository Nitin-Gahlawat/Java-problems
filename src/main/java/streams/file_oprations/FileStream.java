//Question
	//Show read and write opration in a file using FileInputStream and FileOutputStream Classes.
//Answer
package streams.file_oprations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
	public static void main(String[] args) throws IOException{
		//Create a file in the current directory
		String pathCurrDir=System.getProperty("user.dir")+"\\src\\main\\java\\streams\\file_oprations\\";
		FileOutputStream fos = new FileOutputStream(pathCurrDir+"text.txt");
		
		String str1="Learn Java Programming\n";
		fos.write(str1.getBytes());
		
		
		String str2="Hello world\n";
		byte [] arrstr2=str2.getBytes();
		for (byte b : arrstr2) {
			fos.write(b);
		}
		
		fos.write(str1.getBytes(),6,str1.length()-6);
		
		fos.close();
		
		FileInputStream fis=new FileInputStream(pathCurrDir+"text.txt");
		
		byte[] outarr=new byte[fis.available()];
		fis.read(outarr);
		String output=new String(outarr);
		System.out.print(output);
		
		
		int x;
		while((x=fis.read())!=-1) {
			System.out.print((char)x);
		}
		
		fis.close();
		
		
	}
}
