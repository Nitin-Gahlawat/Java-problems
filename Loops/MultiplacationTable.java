//Question
    //WAP to print the multiplication table of all the numbers from 1 to 9.
//Answer
public class MultiplacationTable {
    public static void main(String[] args) {
        System.out.println("\t  Multiplacation Table ");
        System.out.print("   ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d",i);
        }
        System.out.print("\n----------------------------------------\n");
        for (int i = 1; i <=9; i++) {
            System.out.print(i+" |");
            for (int j = 1; j <=9; j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.print("\n");
        }
    }
}
