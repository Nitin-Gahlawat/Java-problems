//Question
    //WAP to show the Methods of the  Float Wrapper Class.
//Answer
package lang_package;

public class FloatClass {
    public static void main(String[] args) {
        Float f = Float.parseFloat("123.45");
        System.out.println(f.equals(123.0f));
        System.out.println(f.isInfinite());
        System.out.println(f.isNaN());

    }
}
