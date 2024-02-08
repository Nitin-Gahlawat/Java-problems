//Question
    //Show the use of CharArray Reader & Writer in java.
//Answer

package streams.array_streams;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArray {
	public static void main(String[] args) throws IOException {
		char[] chararr=new char[10];
		for (int i = 0; i < chararr.length; i++) {
			chararr[i]=(char) (i+97);
		}
		CharArrayReader cr=new CharArrayReader(chararr);
		int x;
		while((x=cr.read())!=-1)
			System.out.print((char)x);
		cr.close();
		
		CharArrayWriter cw=new CharArrayWriter();
		cw.write(chararr);
		char[] arr=cw.toCharArray();
		for (char c : arr) {
			System.out.print(c);
		}
		cw.close();
	}
}
