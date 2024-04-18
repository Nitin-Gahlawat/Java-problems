//Question
    //WAP to show the use of Sequence Input Stream.
//Answer
package streams.file_operations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;


public class CombineData {
	public static void main(String[] args) throws Exception {
		String file1 = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\file_operations\\CopyFile.java";
		FileInputStream read1 = new FileInputStream(file1);

		String file2 = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\file_operations\\CombineData.java";
		FileInputStream read2 = new FileInputStream(file2);
		

		SequenceInputStream sis = new SequenceInputStream(read1, read2);

		/************************ issue ***********************************/
		// byte[] outputArray=new byte[read1.available()+read2.available()];
		// //reads only read1 file <<<<-----------------------------issue
		// sis.read(outputArray);
		// for (int i = 0; i < outputArray.length; i++) {
		// System.out.print((char)outputArray[i]);
		// }

		String file3=System.getProperty("user.dir")+"\\src\\main\\java\\streams\\file_operations\\resource.txt";
		FileOutputStream fos = new FileOutputStream(file3);
		int x;

		while ((x = sis.read()) != -1)
			fos.write(x);

		fos.close();
		sis.close();
		read1.close();
		read2.close();
	}
}
