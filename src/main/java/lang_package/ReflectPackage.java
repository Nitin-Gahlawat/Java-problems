//Question
	//Show the various Classes of the reflect Package in java.
//Answer
package lang_package;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectPackage {
 public static void main(String[] args) {
    Class<Boolean> b=Boolean.class;
    System.out.println("\n******************************Name of the class*********************************");
    System.out.println(b.getName());

    System.out.println("\n******************************Method OF the Class********************************");
    Method[] arr=b.getMethods();
    System.out.println(Arrays.toString(arr));
    
    System.out.println("\n*************************DeclaredFields of the class*****************************");
    System.out.println(Arrays.toString(b.getDeclaredFields()));

    System.out.println("\n******************************Constructors of the class*************************");
    System.out.println(Arrays.toString(b.getConstructors()));

    System.out.println("\n****************************Parameters of Meth[0] "+arr[0]+" *********************");
    System.out.println(Arrays.toString(arr[0].getParameters()));

 }   
}
