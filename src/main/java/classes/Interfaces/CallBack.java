//Question
	//Show the use of Interface and callback method.
//Answer
package classes.Interfaces;

interface Member{
	void callback();
}

class Store{
	Member[] mem;
	int ct=0;
	Store(){
		mem=new Member[10];
	}
	void register(Member m) {
		mem[ct++]=m;
	}
	void invite() {
		for (int i = 0; i < ct; i++) {
			mem[i].callback();
		}
	}
	
}
class Customer implements Member{
	String s;
	public Customer(String str) {
		this.s=str;
	}

	@Override
	public void callback() {
		System.out.println("Ok I will come "+s);
	}
	
}
public class CallBack {
	public static  void main(String[] args) {
		Store s=new Store();
		for (int i = 0; i < 10; i++) {			
			Customer ob=new Customer("c"+i);
			s.register(ob);
		}
		
		s.invite();
	}
}
