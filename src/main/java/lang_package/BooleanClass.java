//Question
	//Show the various boolean operation on boolean data with Boolean Wrapper Class.
//Answer
package lang_package;
public class BooleanClass {
    public static void main(String[] args) {
        System.out.println(Boolean.compare(false, false));
        System.out.println(Boolean.logicalAnd(false, true));
        System.out.println(Boolean.logicalOr(false, true));
        System.out.println(Boolean.logicalXor(false, false));
        System.out.println(Boolean.parseBoolean("true"));
    }
}
