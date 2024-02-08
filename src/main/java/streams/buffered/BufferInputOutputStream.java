//Question
	//Show the use BufferedOutputStream (& BufferedInputStream) Using FileOutputStream (& FileInputStream).
//Answer
package streams.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferInputOutputStream {
	public static void main(String[] args) throws Exception {

		//FileOutputStream & BufferedOutputStream  

		String file = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\Buffered\\resource.txt";
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write((byte) 'J');
		String java = "ava Programming Language";
		bos.write(java.getBytes());
		bos.flush();
		bos.close();
		fos.close();


		// FileInputStream & BufferedInputStream

		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);

		System.out.println("Is Mark Supported in FileInputStream " + fis.markSupported());
		System.out.println("Is Mark Supported in Buffer " + bis.markSupported());

		System.out.print((char) bis.read());
		System.out.print((char) bis.read());
		System.out.print((char) bis.read());
		bis.mark(10);
		System.out.print((char) bis.read());
		System.out.print((char) bis.read());
		bis.reset();
		System.out.print((char) bis.read());
		System.out.print((char) bis.read());

		int x;
		while ((x = bis.read()) != -1)
			System.out.print((char) x);

		bis.close();
		fis.close();

	}
}
