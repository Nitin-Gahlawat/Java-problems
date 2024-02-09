//Question 
    // Use a TreeSet in Java to store custom objects in a sorted order .
//Answer

package collection;

import java.util.TreeSet;

class Point implements Comparable<Point> {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int compareTo(Point p) {
        if (p.x < this.x)
            return 1;
        else if (p.x > this.x)
            return -1;
        else {
            if (p.y < this.y)
                return 1;
            else if (p.y > this.y)
                return -1;
            else
                return 0;
        }
    }

}

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();

        ts.add(new Point(1, 1));
        ts.add(new Point(5, 5));
        ts.add(new Point(5, 2));
        System.out.println(ts);

    }
}
