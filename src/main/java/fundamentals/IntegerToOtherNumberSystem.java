//Question
    //WAP to convert integer to diffrent number system
//Answer
package fundamentals;
public class IntegerToOtherNumberSystem {
    public static void main(String[] args) {
        int x=-11;
        System.out.println("Converting "+x+" to other number system");
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toOctalString(x));
        
        int y=+11;
        System.out.println("Converting "+y+" to other number system");
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toHexString(y));
        System.out.println(Integer.toOctalString(y));            
    }
}
