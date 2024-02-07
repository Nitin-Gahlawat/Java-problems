//Question
    //Show the use of raw type and two generic Parameters in java.
//Answer

package generics;

@SuppressWarnings("unchecked")

class one<T> {
    
    T[] data = (T[]) new Object[45];
    int length = 0;

    public void append(T v) {
        data[length++] = v;
    }

}

class Two<T, K> extends one<T> {

    public void display(K value) {
        System.out.println("********************************" + value + "*******************************");
        for (int i = 0; i < super.length; i++) {
            System.out.println(super.data[i]);
        }
        System.out.println("********************************" + value + "*******************************");
    }

}

public class BoundsOfGenerics<T, K> {

    public static void main(String[] args) {

        @SuppressWarnings("rawtypes")

        // Two <Object,Object> obj=new Two<>();
        Two obj = new Two<>();
        obj.append("String");
        obj.append(10);
        obj.display("Object");

        Two<String, String> strobj = new Two<>();
        strobj.append("Java");
        // strobj.append(10); //Error
        strobj.append("JavaScript");
        strobj.append("Python");
        strobj.display("String");

    }

}