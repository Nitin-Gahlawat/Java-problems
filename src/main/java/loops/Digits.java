//Question 
    //Show various operations on Digits of a number.
//Answer
package loops;

public class Digits {
	static int digitReverse(int n) {
		int rev=0;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
	static int countDigits(int n) {
		int ct=0;
		while(n!=0) {
			n=n/10;
			ct++;
		}
		return ct;
	}
	static void palindrome(int n) {
		int revnum=digitReverse(n);
		if(revnum==n)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");
		
	}
	static void armstrongNumber(int n) {
		double rev=0;
		int temp=n;
		while(n!=0) {
			int r=n%10;
			rev=rev+Math.pow(r,3);
			n=n/10;
		}
		if(temp==rev)
			System.out.println("The number is Armstrong Number");
		else
			System.out.println("The number is not a Armstrong Number");
	}

	static void digitsInWords(int n) {
		StringBuilder str = new StringBuilder();
		// Useful for printing tailing zeros
		while (n != 0) {
			int r = n % 10;
			n = n / 10;
			str.append(r);
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			switch (str.charAt(i)) {
			case '0': {
				System.out.printf("%s ", "Zero");
				break;
			}
			case '1': {
				System.out.printf("%s ", "One");
				break;
			}
			case '2': {
				System.out.printf("%s ", "Two");
				break;
			}
			case '3': {
				System.out.printf("%s ", "Three");
				break;
			}
			case '4': {
				System.out.printf("%s ", "Four");
				break;
			}
			case '5': {
				System.out.printf("%s ", "Five");
				break;
			}
			case '6': {
				System.out.printf("%s ", "Six");
				break;
			}
			case '7': {
				System.out.printf("%s ", "Seven");
				break;
			}
			case '8': {
				System.out.printf("%s ", "Eight");
				break;
			}
			case '9': {
				System.out.printf("%s ", "Nine");
				break;
			}
			}
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		armstrongNumber(153);
		digitsInWords(12450);
		palindrome(121);
	}
}
