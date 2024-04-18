//Question
    //Show the use method reference operator(::) in java.
//Answer

package lambda;

@FunctionalInterface
interface mylambda {
    public void display(String x);
}

@FunctionalInterface
interface lambda {
    public boolean equal(String x, String y);
}

public class MethodReference {
    MethodReference() {

    }

    MethodReference(String s) {
        System.out.println(s.toUpperCase());
    }

    void reverse(String s) {
        System.out.println(new StringBuffer(s).reverse());
    }

    public static void main(String[] args) {
        // static
        mylambda m = System.out::println;
        m.display("hello");

        // instance
        MethodReference mobj = new MethodReference();
        mylambda m1 = mobj::reverse;
        m1.display("hello world");

        // Constructor
        mylambda mob = MethodReference::new;
        mob.display("good");

        // x.equalsIgnoreCase(y)
        lambda l = String::equalsIgnoreCase;
        System.out.println(l.equal("Hello", "hello"));
    }
}
