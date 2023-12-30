//Question
	//WAP to show Example of Classes and Objects in java using Student Class.
//Answer
package classes;
import java.util.*;
 class StudentData{
     String name;
     String roll;
     String course;
     double[] marks;
     private static int counter=1;
     StudentData(String name, String course, double ...marks) {
         this.name = name;
         this.course = course;
         this.marks = marks;
         roll =generateRoll();
     }
    @SuppressWarnings("deprecation")
	private String generateRoll() {
    	Date d=new Date();
    	String str="Univ-"+(d.getYear()+1900)+"-"+counter;
    	counter++;
    	return str;
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	double total() {
    	 double sum=0;
    	 for (double i : marks) {
			sum+=i;
		}
    	 return sum;
     }
	double average() {
    	 return total()/marks.length;
     }
     String grade() {
    	 if(average()>60)
    		 return "A";
    	 else if(average()<=60 && average()>=50)
    		 return "B";
    	 else
    		 return "c";
     }
     public String toString() {
    	return "roll no:"+ roll +"\n"+"name:"+name+"\n"+"course:"+ course;
     }
 }
public class Student {
    public static void main(String[] args) {

        double[] x={10,30,50,6,3};
         StudentData s=new StudentData("abc","CS",x);
         System.out.println("average "+s.average());
         System.out.println("grade "+s.grade());
         System.out.println(s);

         StudentData[] s1=new StudentData[10];
         for (int i = 0; i < s1.length; i++) {
			s1[i]=new StudentData("abc"+i,i+"sub",x);
		}
		System.out.println(s1[s1.length-1].roll);
    }
}
