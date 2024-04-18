//Question
	//Show Difference between StringBuffer,String & StringBuilder.
//Answer
package lang_package;

public class StringClasses {
	public static void main(String[] args) {

		String str = new String("Solar ");
		// System.out.println(str);
		String str1 = str.concat("System"); // str+"System" is assigned to the new reference str1" str
		System.out.println(str1); 				// str not modified

		// Note
		/***
		 * StringBuffer is Thread Safe whereas StringBuilder is not Thread Safe.
		 */
		
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("World");
		System.out.println(sb); // "World" is Appended at the end of the "Hello " string

		StringBuilder strbuilder = new StringBuilder("Java ");
		strbuilder.append("Programming"); // "Programming" is Appended at the end of the "Java " string
		System.out.println(strbuilder);

	}
}
