//Question 
    //WAP to display various Patterns using loops.
//Answer
package loops;

import java.util.Scanner;

public class PatternsUsingLoops{
	/*
		 1 2 3
		 1 2 3
		 1 2 3
	 */
	static String pattern1(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				str.append(j).append(" ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
		 1 1 1
		 2 2 2
		 3 3 3
	 */
	static String pattern2(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				str.append(String.format("%02d", i)).append(" ");
			}
			str.append("\n");
		}
		return str.toString();
	}

	/*
	 	01 02 03 04
		05 06 07 08
		09 10 11 12
		13 14 15 16
	 */
	static String pattern3(int n) {
		StringBuilder str= new StringBuilder();
		int count=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				str.append(String.format("%02d", count++)).append(" ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
		01
		01 02
		01 02 03
		01 02 03 04
	*/
	static String pattern4(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j<=i)
					str.append(String.format("%02d", j)).append(" ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
		01
		02 03
		04 05 06
		07 08 09 10
	 */
	static String pattern5(int n) {
		StringBuilder str= new StringBuilder();
		int count=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j<=i)
					str.append(String.format("%02d", count++)).append(" ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
		01 02 03 04
		01 02 03
		01 02
		01
	 */
	static String pattern6(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
					str.append(String.format("%02d", j)).append(" ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
		 * * * * *
		   * * * *
		     * * *
	           * *
	             *
	 */
	static String pattern7(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j>=i)
					str.append("* ");
				else
					str.append("  ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
		         *
		       * *
	 	     * * *
		   * * * *
		 * * * * *
	 */
	static String pattern8(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j>5)
					str.append("* ");
				else
					str.append("  ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
		         *
		       * * *
		     * * * * *
		   * * * * * * *
		 * * * * * * * * *
	 */
	static String pattern9(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j>n)
					str.append("* ");
				else
					str.append("  ");
			}
			for (int k = 1; k <=i-1; k++) {
					str.append("* ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
	          *
		    *   *
		  *   *   *
		*   *   *   *
	 */
	static String pattern10(int n) {
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (n%2==0 && i + j > n && (i + j) % 2 != 0)
					str.append("* ");
				else if (n%2!=0 && i + j > n && (i + j) % 2 == 0)
					str.append("* ");
				else
					str.append("  ");
			}
			for (int k = 1; k <= i - 1; k++) {
				if ((i + k) % 2 != 0)
					str.append("* ");
				else
					str.append("  ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
	 	*   *   *   *
		  *   *   *
		    *   *
		      *
	 */
	static String pattern11(int n) {
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
					if(i<=j && (i + j) % 2 == 0)
						str.append("* ");
					else
						str.append("  ");
			}
			for (int k = 1; k <= n-i; k++) {
				if (n%2!=0 && (i + k) % 2 != 0)
					str.append("* ");
				else if(n%2==0 && (i + k) % 2 == 0)
					str.append("* ");
				else
					str.append("  ");
			}
			str.append("\n");
		}
		return str.toString();
	}

	/*
	          *
		    * * *
		  * * * * *
		* * * * * * *
		  * * * * *
		    * * *
		      *
	 */
	static String pattern12(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j>n)
					str.append("* ");
				else
					str.append("  ");
			}
			for (int k = 1; k <=i-1; k++) {
					str.append("* ");
			}
			str.append("\n");
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j>=i)
					str.append("* ");
				else
					str.append("  ");
			}
			for (int k = 1; k <=n-i; k++) {
					str.append("* ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
		 	*       *
			  *   *
			    *
			  *   *
			*       *
	 */
	static String pattern13(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==j || i==(n-j+1))
					str.append("* ");
				else
					str.append("  ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	/*
	           * * * * *
		      * * * * *
		    * * * * *
		  * * * * *
		* * * * *

	 */
	static String pattern14(int n) {
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j>=(n-i+1))
					str.append("* ");
				else
					str.append("  ");
			}
			for (int k = 1; k <= n-i; k++) {
					str.append("* ");
			}
			str.append("\n");
		}
		return str.toString();
	}

	static private int binocoff(int line,int k) {
		int line_fact=1;
		int lineminkfact=1;
		int kfact=1;
		for(int i=1;i<=line;i++)
			line_fact*=i;
		for(int i=1;i<=(line-k);i++)
			lineminkfact*=i;
		for(int i=1;i<=k;i++)
			kfact*=i;
		return line_fact/(lineminkfact*kfact);
	}
	/*
			    1
			  1   1
			1   2   1
		  1   3   3   1
		1   4   6   4   1
	*/
	static String pattern15(int n) {
		StringBuilder str = new StringBuilder();
		int count=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (n%2!=0 && i + j > n && (i + j) % 2 == 0)
					str.append((binocoff(i - 1, count++))).append(" ");
				else if (n%2==0 && i + j > n && (i + j) % 2 != 0)
					str.append((binocoff(i - 1, count++))).append(" ");
				else
					str.append("  ");
			}
			for (int k = 1; k <= i - 1; k++) {
				if ((i + k) % 2 != 0)
					str.append((binocoff(i - 1, count++))).append(" ");
				else
					str.append("  ");
			}
			str.append("\n");
			count=0;
		}
		return str.toString();
	}
	static private char genrandom(boolean random) {
		if(random) {
			int x=(int) (Math.random()*100);
			while(x<33 || x>126) {
				x=(int) (Math.random()*100);
			}
			return (char)x;
		}
		return '*';
	}
	static String pattern16(int h,boolean random) {
		StringBuilder str= new StringBuilder();
		for(int i=1;i<=h;i++) {
			for (int k = 0; k < h-i+2; k++) {
				str.append(" ");
			}
			for (int j = 1; j <=i; j++) {
				str.append(genrandom(random)).append(" ");
			}
			str.append("\n");
		}
		for(int i=1;i<=h;i++) {
			for (int k = 0; k < h-i+1; k++) {
				str.append(" ");
			}
			for (int j = 1; j <=i+2; j++) {
				str.append(genrandom(random)).append(" ");
			}
			str.append("\n");
		}
		for(int i=1;i<=h;i++) {
			for (int k = 0; k < h-i; k++) {
				str.append(" ");
			}
			for (int j = 1; j <=i+3; j++) {
				str.append(genrandom(random)).append(" ");
			}
			str.append("\n");
		}
		for(int i=0;i<=h;i++) {
			for (int k = 1; k <=3; k++) {
				str.append("  ");
			}
			for(int j=0;j<2;j++) {
				str.append("##");
			}
			str.append("\n");
		}
		return str.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a  number for the pattern (1-16) ");
		int userOption=sc.nextInt();
		System.out.print("Enter a size for the pattern ");
		int size=sc.nextInt();
        switch (userOption) {
        case 1:
            System.out.println(pattern1(size));
            break;
        case 2:
            System.out.println(pattern2(size));
            break;
        case 3:
            System.out.println(pattern3(size));
            break;
        case 4:
            System.out.println(pattern4(size));
            break;
        case 5:
            System.out.println(pattern5(size));
            break;
        case 6:
            System.out.println(pattern6(size));
            break;
        case 7:
            System.out.println(pattern7(size));
            break;
        case 8:
            System.out.println(pattern8(size));
            break;
        case 9:
            System.out.println(pattern9(size));
            break;
        case 10:
            System.out.println(pattern10(size));
            break;
        case 11:
            System.out.println(pattern11(size));
            break;
        case 12:
            System.out.println(pattern12(size));
            break;
        case 13:
            System.out.println(pattern13(size));
            break;
        case 14:
            System.out.println(pattern14(size));
            break;
        case 15:
            System.out.println(pattern15(size));
            break;
        case 16:
        	System.out.println("You got Christmas Tree Pattern");
        	System.out.print("Do you want random Character(y/n) ");
        	String val=sc.next();
            System.out.println(pattern16(size,(val.equalsIgnoreCase("y")||val.equalsIgnoreCase("yes"))));
            break;
        default:
            System.out.println("Invalid option");
		}
        sc.close();
	}
}
