//Question
    //Limit the Generics Type By using the Base classes/Interfaces.
//Answer

package generics;

interface A {

    default void displayA() {
        System.out.println("Interface A");
    }

}

interface B {

    default void displayB() {
        System.out.println("Interface B");
    }

}

class C {

    void displayC() {
        System.out.println("Classs C");
    }

    @Override
    public String toString() {
        return "Object of Class D";
    }

}

class D extends C implements A, B {

    void displayD() {
        System.out.println("Interface B");
    }

    @Override
    public String toString() {
        return "Object of Class D";
    }

}

class arr {

    public <T extends C & A & B> void display(T x) {
        System.out.println(x.getClass());
    }
    
}

public class BoundTypes {

    public static void main(String[] args) {
        arr ob = new arr();
        ob.display(new D());
    }
}
