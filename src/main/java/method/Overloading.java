//Question 
    //Show method Overloading in java.
//Answer
package method;

public class Overloading {
    static byte max(byte a,byte b){
        System.out.println("byte method called");
        return a>b?a:b;
    }
    static byte max(byte a,byte b,byte c){
        System.out.println("byte method called");
        if(a>b)
            return a>c?a:c;
        else
            return b>c?b:c;
    }

    static int max(int a,int b){
        System.out.println("int method called");
        return a>b?a:b;
    }
    static int max(int a,int b,int c){
        System.out.println("int method called");
        if(a>b)
            return a>c?a:c;
        else
            return b>c?b:c;
    }
    static float max(float a,float b){
        System.out.println("float method called");
        return a>b?a:b;
    }
    static float max(float a,float b,float c){
        System.out.println("float method called");
        if(a>b)
            return a>c?a:c;
        else
            return b>c?b:c;
    }
    public static void main(String[] args) {
       System.out.println(max(20,54));
    }
}
