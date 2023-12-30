//Question
	//WAP to show the creation of Array of Objects.
//Answer
package classes;
class Subject {
	private final String id;
	private final String name;
	private final int marks;
	private int marksObtain;

	public Subject(String id, String name, int marks, int marksObtain) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.marksObtain = marksObtain;
	}

	public void setMarksObtain(int marksObtain) {
		this.marksObtain = marksObtain;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public int getMarksObtain() {
		return marksObtain;
	}
	
	public String toString() {
		return "\n\tid:"+id+"\n\tSubject name:"+name+"\n\tmarks:"+marks+"\n\tmarks Obtain:"+marksObtain;
	}
}

class StudentClass {
	private final int roll;
	private final String name;
	private final String department;
	private final Subject[] subArray;

	public StudentClass(int roll, String name, String department, Subject[] subArray) {
		this.roll = roll;
		this.name = name;
		this.department = department;
		this.subArray = subArray;
	}

	public StudentClass(int roll, String name, String department, int numberOfSubject) {
		this.roll = roll;
		this.name = name;
		this.department = department;
		this.subArray = new Subject[numberOfSubject];
	}

	private int counter = 0;

	public void setSubArray(String id, String name, int marks, int marksObtain) {
		this.subArray[counter++] = new Subject(id, name, marks, marksObtain);
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}
	
	public Subject[] getSubArray() {
		return subArray;
	}
	@Override
	public String toString() {
		return "roll no: "+ roll +"\nname: "+name+"\ndepartment: "+department+"\nSubjects: "+java.util.Arrays.toString(this.subArray);
	}

}

public class ArrayOfObject {
	public static void main(String[] args) {
		StudentClass sc = new StudentClass(450, "Jack", "CS", 4); //last parameter specify the size of the subject array
		sc.setSubArray("107", "Python", 100, 15);
		sc.setSubArray("14", "Java", 100, 30);
		sc.setSubArray("101", "Cobol", 100, 10);
		sc.setSubArray("10", "Matlab", 100, 50);
		System.out.println(sc);
		System.out.println("****************************************************");
		sc.getSubArray()[0].setMarksObtain(80); //changing the value of marks of Python subject.
		System.out.println(sc);
	}
}
