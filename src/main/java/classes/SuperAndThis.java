//Question
    //Show An example of This and Super keyword in java.
//Answer
package classes;
class Super {
	int x=10;
    Super(int x){
        this.x=x;
    }
    void message() {
    	System.out.println("Call from Super class");
    }
}
class Sub extends Super{
    int x=30;
    Sub(int x,int y){
    	super(y);
        this.x=x;
    }
    @Override
    void message() {
    	System.out.println("Call from Sub class");
    }
    void call() {
    	this.message();
    	super.message();
    	System.out.println("The value of x in Super Class "+super.x);
    	System.out.println("The value of x in Sub Class "+this.x);
    }
    
}
public class SuperAndThis {
    public static void main(String[] args) {
        Sub ob=new Sub(4,10);
        ob.call();
    }
}
