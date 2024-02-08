//Question
    //Show the use of ByteArray I/O streams in java.
//Answer
package streams.array_streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArray {
	public static void main(String[] args) throws IOException {
		byte[] b = new byte[10];
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) (i + 97);
		}

		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		int x;
		while ((x = bis.read()) != -1)
			System.out.print((char) x);

		String str = new String(bis.readAllBytes());
		System.out.println(str);

		System.out.print(bis.markSupported());
		bis.close();

		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

		for (int i = 0; i <= 10; i++) {
			bos.write(i + 97);
		}

		byte[] barr = bos.toByteArray();
		for (byte c : barr) {
			System.out.print((char) c);
		}

		bos.writeTo(new FileOutputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\streams\\byteStream\\resource.txt"));

		bos.close();
	}
}
