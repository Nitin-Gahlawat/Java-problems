//Question
	//WAP to show Local inner Class in java.
//Answer
package classes.inner;
class Outclass {
	void display() {
		class Innerclass{
			void displayInner(){
				System.out.println("calling from displayInner");
			}
		}
		Innerclass i=new Innerclass();
		i.displayInner();
	}
}
public class LocalInnerClass {
	public static void main(String[] args) {
		Outclass outer=new Outclass();
		outer.display();
	}
}
