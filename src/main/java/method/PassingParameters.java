//Question 
    //WAP to show Parameters Passing in java.
//Answer
package method;

public class PassingParameters {
    static void printing(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d\t", i);
        }
        System.out.print("\n");
    }

    static void changeArray(int[] arr) {
        System.out.println("In changeArray before Changing the value");
        printing(arr);
        arr[2] = 300;
        System.out.println("In changeArray after Changing the value");
        printing(arr);
    }

    static void arrPassing(int[] arr) {
        System.out.println("In arrPassing before calling changeArray");
        printing(arr);
        changeArray(arr);
        System.out.println("In arrPassing after calling changeArray");
        printing(arr);
    }

    static void changeValue(int a) {
        System.out.println("In changeValue before Changing the value");
        System.out.println(a);
        a = 200;
        System.out.println("In changeValue after Changing the value");
        System.out.println(a);
    }

    static void valuePassing(int a) {
        System.out.println("In valuePassing before calling changeValue");
        System.out.println(a);
        changeValue(a);
        System.out.println("In valuePassing After calling changeValue");
        System.out.println(a);
    }

    public static void main(String[] args) {
        int arr[]=new int[] { 44, 5, 6, 3, 25, 2, 4, 22, 5 };
        arrPassing(arr);
        System.out.println("******************************************************************");
        valuePassing(50);
    }
}
