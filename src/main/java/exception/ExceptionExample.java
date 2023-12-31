//Question
	//WAP to show User defined Exception both Checked and UnChecked.
//Answer
package exception;
//UnChecked Exception Example as it is extending from java.lang.RuntimeException
class NegativeDimensionException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Dimension can not be Negative";
    }

    @Override
    public String toString() {
        return "Negative Dimension";
    }
}

//Checked Exception Example as it is extending from Exception
class ZeroDimensionException extends Exception {
    @Override
    public String getMessage() {
        return "Dimension can not be Zero";
    }

    @Override
    public String toString() {
        return "Zero Dimension";
    }
}

public class ExceptionExample {
    static int area(int l, int b) throws ZeroDimensionException {
        if (l < 0 || b < 0)
            throw new NegativeDimensionException();  //UnChecked ExceptionExample
        if (l == 0 || b == 0)
            throw new ZeroDimensionException();      //Checked ExceptionExample
        return l * b;
    }

    static void CalArea() {
        try {
            System.out.println(area(10, 0));
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        } catch (ZeroDimensionException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        CalArea();
    }
}
