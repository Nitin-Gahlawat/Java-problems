//Question
	//WAP to Access File in a Random Order using RandomAccessFile class in java.
//Answer
package streams.random;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
	public static void main(String[] args) throws IOException {
		String file = System.getProperty("user.dir") + "\\src\\main\\java\\streams\\random\\resource.txt";
		RandomAccessFile rf = new RandomAccessFile(file, "rw");

		String str = "ABCDEFGHIJ";
		for (int i = 0; i < str.length(); i++) {
			rf.write((byte) str.charAt(i));
		}
		rf.seek(0);
		System.out.print((char) rf.read());
		System.out.print((char) rf.read());
		System.out.print((char) rf.read());
		rf.write('d');
		System.out.print((char) rf.read());
		rf.skipBytes(3);
		System.out.print((char) rf.read());
		rf.seek(3);
		System.out.print((char) rf.read());
		System.out.print(rf.getFilePointer());
		rf.seek(rf.getFilePointer() + 2);
		System.out.print((char) rf.read());
		rf.close();
	}
}
