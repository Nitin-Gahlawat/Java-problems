//Question
	//Show read and write operation in a file using FileReader and FileWriter Classes.
//Answer
package streams.file_operations;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
	public static void main(String[] args) throws IOException {
		String pathCurrDir = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\file_operations\\";
		FileWriter fw = new FileWriter(pathCurrDir + "reader.txt");

		String str1 = "Java file Reader\n";
		fw.write(str1.toCharArray());

		String str2 = "Reader Hello world\n";
		byte[] arrstr2 = str2.getBytes();
		for (byte b : arrstr2) {
			fw.write(b);
		}

		fw.write(str2);

		fw.write(str1.toCharArray(), 5, str1.length() - 5);

		fw.close();

		FileReader fr = new FileReader(pathCurrDir + "reader.txt");
		int x;
		while ((x = fr.read()) != -1) {
			System.out.print((char) x);
		}
		fr.close();

	}
}
