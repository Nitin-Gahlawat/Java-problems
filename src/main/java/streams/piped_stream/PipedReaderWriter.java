//Question
	//Show the use of Piped Reader and Writer.
//Answer

package streams.piped_stream;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.Writer;

class ProducerWriter extends Thread {
	Writer os;

	ProducerWriter(Writer os) {
        this.os = os;
    }

    @Override
    public void run() {
        int i = 0;
        while (i<50) {
        	try {
				os.write(i);
				os.flush();
				System.out.println("Producer "+i);
				Thread.sleep(200);
				System.out.flush();
				i=i+5;
			} catch (Exception e) {
				System.out.println(e+" producer");
			}
        }
    }
}

class ConsumerReader extends Thread {
	Reader is;

	ConsumerReader(Reader is) {
        this.is = is;
    }

    @Override
    public void run() {
        int x = 0;
        while (x<45) {
        	try {
				x=is.read();
				System.out.println("Consumer "+x);
				Thread.sleep(200);
				System.out.flush();
			} catch (Exception e) {
				System.out.println(e+" Consumer");
			}
        }
    }
}
public class PipedReaderWriter {
	public static void main(String[] args) throws IOException, InterruptedException{
		PipedReader pis=new PipedReader();	//producer
		PipedWriter pos=new PipedWriter();	//consumer
		
		ProducerWriter p=new ProducerWriter(pos);
		ConsumerReader c=new ConsumerReader(pis);
		pis.connect(pos);
		p.start();
		c.start();	
		Thread.currentThread().join();
		pis.close();
		pos.close();
	}
}
