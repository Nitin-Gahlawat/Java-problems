//Question
	//Show the use BufferedWriter (& BufferedReader) Using FileWriter (& FileReader).
//Answer

package streams.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriter {
	public static void main(String[] args) throws IOException {
		String file = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\Buffered\\resource.txt";

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		String pro = "java is  the best programing";
		bw.write(pro.toCharArray());
		fw.flush();
		bw.close();
		fw.close();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		/*To print the full file as a output .*/
		// int x;
		// while((x=br.read())!=-1)
		// System.out.print((char)x);

		System.out.println("Is Mark Supported in FileInputStream " + fr.markSupported());
		System.out.println("Is Mark Supported in Buffer " + br.markSupported());

		System.out.print((char) br.read());
		System.out.print((char) br.read());
		System.out.print((char) br.read());
		br.mark(10);
		System.out.print((char) br.read());
		System.out.print((char) br.read());
		br.reset();
		System.out.print((char) br.read());
		System.out.print((char) br.read());
		System.out.println(br.readLine());

		br.close();

	}
}
