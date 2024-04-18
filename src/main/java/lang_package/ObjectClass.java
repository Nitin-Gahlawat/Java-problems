//Question
	//Show the Method of the Object Class(root of the inheritance hierarchy).
//Answer
package lang_package;
import java.lang.Object;
public class ObjectClass extends Object {
	@Override
	public boolean equals(Object s) {
		return this.hashCode() == s.hashCode();
	}

	@Override
	public int hashCode() {
		return 200;
	}

	@Override
	public String toString() {
		return "ObjectClass Object is Printed";
	}

	public static void main(String[] args) {

		ObjectClass ob = new ObjectClass();
		ObjectClass ob1 = new ObjectClass();
		System.out.println(ob.equals(ob1));

		System.out.println(ob);

		System.out.println(ob.getClass());

	}
}
