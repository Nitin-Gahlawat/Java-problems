//Question 
    //WAP to Variable Arguments in java.
//Answer
package method;

public class vargs {
    static void call(int... args) {
        for (int x : args) {
            System.out.print(x+"\t");
        }
        System.out.print("\n");
    }

    public static void main(String... args) {
        call(new int[]{50,45,1000,5,628,45,6});
        call(4,5,6,8,2,5);
    }
}
