//Question
    //Show the generic behaviour using Object class . 
//Answer
package generics;

public class ObjectGenerics {

    public static void main(String[] args) {

        Object obj=new String("Hi");
        // String str=obj                   //<--Error
        String str=(String) obj;
        System.out.println(str);
        
        obj=Integer.valueOf(10);
        // String r=(String) obj;           //java.lang.ClassCastException


        Object[] arr=new Object[]{"Hi","Hello",10};

        for (Object ele : arr) {
            // String r=(String) ele;       //java.lang.ClassCastException:
            // System.out.println(r);

            System.out.println(ele);
        }
        
    }
    
}
