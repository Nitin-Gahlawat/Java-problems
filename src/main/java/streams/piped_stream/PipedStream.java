//Question
	//Show the use of Piped I/O streams.
//Answer
package streams.piped_stream;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {
	OutputStream os;

    Producer(OutputStream os) {
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

class Consumer extends Thread {
	InputStream is;

	Consumer(InputStream is) {
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
public class PipedStream {
	public static void main(String[] args) throws Exception{
		PipedInputStream pis=new PipedInputStream();	//producer
		PipedOutputStream pos=new PipedOutputStream();	//consumer
		Producer p=new Producer(pos);
		Consumer c=new Consumer(pis);
		pis.connect(pos);
		p.start();
		c.start();	
		Thread.currentThread().join();
		pis.close();
		pos.close();
	}
}
