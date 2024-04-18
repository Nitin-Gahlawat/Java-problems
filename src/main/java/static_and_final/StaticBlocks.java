//Question
	//WAP to show use of static blocks in java.
//Answer
package static_and_final;
class test{
	static int s;	//static block is used to initialize
	static {
		System.out.println("Block 2");
		s=200;
	}
	test(){
		System.out.println("Constructor call");
	}
	static {
		System.out.println("Block 1");
		s=100;
	}
	void finish() {
		System.out.println("program executed.");
	}
}
public class StaticBlocks {
	public static void main(String[] args) {
		System.out.println("S value in the test class "+test.s);
		test obj=new test();
		test obj1=new test();
		obj.finish();
		obj1.finish();
		
	}
}
