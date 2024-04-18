//Question
	//Show the use of predefined constants(Enum).
//Answer
package lang_package;

enum Dept {
	CS(250, "Block-A"), IT(25, "Block-F"), CIVIL(45, "Block-S"), ME(250, "Block-B");

	final int studentNum;
	final String block;

	private Dept(int i, String block) {
		studentNum = i;
		this.block = block;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public String getBlock() {
		return block;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

enum Solar {
	sun("Bright", "Hot"), moon("Dark", "Cold");

	final String type;
	final String temprature;

	private Solar(String a, String b) {
		this.type = a;
		this.temprature = b;
	}

	public String getType() {
		return type;
	}

	public String getTemprature() {
		return temprature;
	}
	@Override
	public String toString() {
		return "Solar";
	}
}

public class EnumDemo {
	public static void main(String[] args) {
		Dept d = Dept.CS;
		System.out.println(d);

		Solar s = Solar.moon;
		System.out.println(s);
		System.out.println(s.getType());
	}
}
