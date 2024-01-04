//Question
    //WAP to show an example of one producer(Teacher) and multiple(Student) consumer.
//Answer
package multithreading;
class WhiteBoard {
    String text;
    static int noOfStudents = 0;
    int count = 0;

    void Attendance() {
        noOfStudents++;
    }
    synchronized void write(String v) {     //Teacher
        while (count!=0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        count=noOfStudents;
        text = v;
        notifyAll();
    }

    synchronized String read() {    //Students
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String t=text;
        count--;
        if(count==0)
            notifyAll();
        return t;
    }
}

class Teacher extends Thread {
    WhiteBoard d;

    String[] arr = new String[]{"I am a coder", "I don`t like Php ", "I love java programing",
            "The python is running", "java is a object oriented programing language", "end"};

    Teacher(WhiteBoard d) {
        this.d = d;
    }

    @Override
    public void run() {
        int temp = 0;
        while (temp < arr.length) {
            d.write(arr[temp]);
            System.out.println("Teacher Writing **********" + arr[temp]);
            temp++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Student extends Thread {
    WhiteBoard d;
    String name;
    Student(String s,WhiteBoard d) {
        name=s;
        this.d = d;
        d.Attendance();
    }

    @Override
    public void run() {
        String val = " ";
        while (!val.equals("end")) {
            val = d.read();
            System.out.println(name + " Reading  " + val);
        }
    }
}

public class TeacherStudent {
    public static void main(String[] args) throws InterruptedException {
        WhiteBoard d = new WhiteBoard();
        Teacher p = new Teacher(d);
        Student c = new Student("1. John",d);
        Student s = new Student("2. ron ",d);
        Thread.sleep(1000);
        p.start();
        c.start();
        s.start();
    }
}
