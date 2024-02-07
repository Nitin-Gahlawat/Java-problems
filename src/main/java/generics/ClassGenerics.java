//Question
    //Show the use of Generic class in java.
//Answer
package generics;

@SuppressWarnings("unchecked")

public class ClassGenerics<T> {
    T[] data;
    int length = 0;

    ClassGenerics() {
        data = (T[]) new Object[10];
    }

    ClassGenerics(int length) {
        this.length = length;
        data = (T[]) new Object[length];
    }

    public void append(T v) {
        data[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        ClassGenerics<String> obj = new ClassGenerics<>();
        obj.append("hi");
        obj.append("Go");
        obj.append("hello ");
        obj.display();

        
        ClassGenerics<Integer> obj1 = new ClassGenerics<>();
        obj1.append(45);
        obj1.append(852);
        obj1.append(896);
        obj1.display();
    }
}