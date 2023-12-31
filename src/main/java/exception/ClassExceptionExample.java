//Question
    //Show the use of try and Catch in java.
//Answer
package exception;
class DivideException{
    int divide(int a, int b){
        int c;
        c = a/b;
        return c;
    }

}
public class ClassExceptionExample {
    static void call(){
    	DivideException ob=new DivideException();
        try {
        	System.out.println(ob.divide(10,10));
        	System.out.println(ob.divide(2,0));	//ArithmeticException
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
        }
        System.out.println(ob.divide(10,2));
    }
    public static void main(String[] args) {
        call();
    }
}
