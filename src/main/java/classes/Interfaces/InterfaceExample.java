//Question
	//Show the use of interfaces and inheritance.
//Answer
package classes.Interfaces;
class Phone{
	void call() {
		System.out.println("Calling.....");
	}
	void sms() {
		System.out.println("sending Sms....");
	}
}
interface IMusicPlayer{
	void play();
	void stop();
}
interface ICamara{
	void click();
	void record();
	
}
class SmartPhone extends Phone implements ICamara,IMusicPlayer{
	public void play() {
		System.out.println("Playing music");
	}
	public void stop(){
		System.out.println("Music stopped");
	}
	@Override
	public void click() {
		System.out.println("The picture is clicked");
		
	}
	@Override
	public void record() {
		System.out.println("The video is record");
		
	}
	
}
public class InterfaceExample {
	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.play();
		s.click();
		
	}
}
