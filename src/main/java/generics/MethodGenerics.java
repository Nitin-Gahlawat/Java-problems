//Question
    //Show the use of Generic method in java.
//Answer
package generics;

public class MethodGenerics {
    
    @SafeVarargs

    public static <E> void display(E... List) {
        for (E e : List) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        display(4, 5, 6, 7);

        display("hi", "hello", "java", "World");
    }
}
