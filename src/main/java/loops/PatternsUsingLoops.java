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
	static String patt1(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				str+=(j+" ");
			}
			str+="\n";
		}
		return str;
	}
	/*
		 1 1 1
		 2 2 2
		 3 3 3
	 */
	static String patt2(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				str=str+(String.format("%02d",i)+" ");
			}
			str=str+("\n");
		}
		return str;
	}
	
	/*
	 	01 02 03 04 
		05 06 07 08 
		09 10 11 12 
		13 14 15 16 
	 */
	static String patt3(int n) {
		String str="";
		int count=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				str=str+(String.format("%02d",count++)+" ");
			}
			str=str+("\n");
		}
		return str;
	}
	/*
		01 
		01 02 
		01 02 03 
		01 02 03 04
	*/
	static String patt4(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j<=i)
					str=str+(String.format("%02d",j)+" ");
			}
			str=str+("\n");
		}
		return str;
	} 
	/*
		01 
		02 03 
		04 05 06 
		07 08 09 10 
	 */
	static String patt5(int n) {
		String str="";
		int count=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j<=i)
					str=str+(String.format("%02d",count++)+" ");
			}
			str=str+("\n");
		}
		return str;
	} 
	/*
		01 02 03 04 
		01 02 03 
		01 02 
		01
	 */
	static String patt6(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
					str=str+(String.format("%02d",j)+" ");
			}
			str=str+("\n");
		}
		return str;
	}
	/*
		 * * * * * 
		   * * * * 
		     * * * 
	           * * 
	             *
	 */
	static String patt7(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j>=i)
					str=str+("* ");
				else
					str+="  ";
			}
			str=str+("\n");
		}
		return str;
	} 
	/*
		         * 
		       * * 
	 	     * * * 
		   * * * * 
		 * * * * * 
	 */
	static String patt8(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j>5)
					str=str+("* ");
				else
					str+="  ";
			}
			str=str+("\n");
		}
		return str;
	} 
	/*
		         * 
		       * * * 
		     * * * * * 
		   * * * * * * * 
		 * * * * * * * * * 
	 */
	static String patt9(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j>n)
					str=str+("* ");
				else
					str+="  ";
			}
			for (int k = 1; k <=i-1; k++) {
					str=str+("* ");
			}
			str=str+("\n");
		}
		return str;
	} 
	/*
	          * 
		    *   * 
		  *   *   * 
		*   *   *   *
	 */
	static String patt10(int n) {
		String str = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (n%2==0 && i + j > n && (i + j) % 2 != 0)
					str = str + ("* ");
				else if (n%2!=0 && i + j > n && (i + j) % 2 == 0)
					str = str + ("* ");
				else
					str += "  ";
			}
			for (int k = 1; k <= i - 1; k++) {
				if ((i + k) % 2 != 0)
					str = str + ("* ");
				else
					str += "  ";
			}
			str = str + ("\n");
		}
		return str;
	}
	/*
	 	*   *   *   * 
		  *   *   * 
		    *   * 
		      *
	 */
	static String patt11(int n) {
		String str = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
					if(i<=j && (i + j) % 2 == 0)
						str = str + ("* ");
					else
						str+="  ";
			}
			for (int k = 1; k <= n-i; k++) {
				if (n%2!=0 && (i + k) % 2 != 0)
					str = str + ("* ");
				else if(n%2==0 && (i + k) % 2 == 0)
					str+="* ";
				else
					str += "  ";
			}
			str = str + ("\n");
		}
		return str;
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
	static String patt12(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j>n)
					str=str+("* ");
				else
					str+="  ";
			}
			for (int k = 1; k <=i-1; k++) {
					str=str+("* ");
			}
			str=str+("\n");
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j>=i)
					str=str+("* ");
				else
					str+="  ";
			}
			for (int k = 1; k <=n-i; k++) {
					str=str+("* ");
			}
			str=str+("\n");
		}
		return str;
	}
	/*
		 	*       * 
			  *   *   
			    *     
			  *   *   
			*       * 
	 */
	static String patt13(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==j || i==(n-j+1))
					str=str+("* ");
				else
					str+="  ";
			}
			str=str+("\n");
		}
		return str;
	}
	/*
	           * * * * * 
		      * * * * * 
		    * * * * * 
		  * * * * * 
		* * * * * 
	 
	 */
	static String patt14(int n) {
		String str="";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j>=(n-i+1))
					str=str+("* ");
				else
					str+="  ";
			}
			for (int k = 1; k <= n-i; k++) {
					str=str+("* "); 
			}
			str=str+("\n");
		}
		return str;
	}
	
	static private int binocoff(int line,int k) {
		int linefact=1;
		int lineminkfact=1;
		int kfact=1;
		for(int i=1;i<=line;i++) 
			linefact*=i;
		for(int i=1;i<=(line-k);i++) 
			lineminkfact*=i;
		for(int i=1;i<=k;i++)
			kfact*=i;
		return linefact/(lineminkfact*kfact);
	}
	/*
			    1 
			  1   1 
			1   2   1 
		  1   3   3   1 
		1   4   6   4   1
	*/
	static String patt15(int n) {
		String str = "";
		int count=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (n%2!=0 && i + j > n && (i + j) % 2 == 0)
					str = str + ((binocoff(i-1,count++))+" ");
				else if (n%2==0 && i + j > n && (i + j) % 2 != 0)
					str = str + ((binocoff(i-1,count++))+" ");
				else
					str += "  ";
			}
			for (int k = 1; k <= i - 1; k++) {
				if ((i + k) % 2 != 0)
					str = str + ((binocoff(i-1,count++))+" ");
				else
					str += "  ";
			}
			str = str + ("\n");
			count=0;
		}
		return str;
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
	static String patt16(int h,boolean random) {
		String str="";
		for(int i=1;i<=h;i++) {
			for (int k = 0; k < h-i+2; k++) {
				str+=" ";
			}
			for (int j = 1; j <=i; j++) {
				str+=genrandom(random)+" ";
			}
			str+="\n";
		}
		for(int i=1;i<=h;i++) {
			for (int k = 0; k < h-i+1; k++) {
				str+=" ";
			}
			for (int j = 1; j <=i+2; j++) {
				str+=genrandom(random)+" ";
			}
			str+="\n";
		}
		for(int i=1;i<=h;i++) {
			for (int k = 0; k < h-i; k++) {
				str+=" ";
			}
			for (int j = 1; j <=i+3; j++) {
				str+=(genrandom(random)+" ");
			}
			str+="\n";
		}
		for(int i=0;i<=h;i++) {
			for (int k = 1; k <=3; k++) {
				str+=("  ");
			}
			for(int j=0;j<2;j++) {
				str+="##";
			}
			str+="\n";
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a  number for the pattern (1-16) ");
		int userOption=sc.nextInt();
		System.out.print("Enter a size for the pattern ");
		int size=sc.nextInt();
        switch (userOption) {
        case 1:
            System.out.println(patt1(size));
            break;
        case 2:
            System.out.println(patt2(size));
            break;
        case 3:
            System.out.println(patt3(size));
            break;
        case 4:
            System.out.println(patt4(size));
            break;
        case 5:
            System.out.println(patt5(size));
            break;
        case 6:
            System.out.println(patt6(size));
            break;
        case 7:
            System.out.println(patt7(size));
            break;
        case 8:
            System.out.println(patt8(size));
            break;
        case 9:
            System.out.println(patt9(size));
            break;
        case 10:
            System.out.println(patt10(size));
            break;
        case 11:
            System.out.println(patt11(size));
            break;
        case 12:
            System.out.println(patt12(size));
            break;
        case 13:
            System.out.println(patt13(size));
            break;
        case 14:
            System.out.println(patt14(size));
            break;
        case 15:
            System.out.println(patt15(size));
            break;
        case 16:
        	System.out.println("You got Christmas Tree Pattern");
        	System.out.print("Do you want random Character(y/n) ");
        	String val=sc.next();
            System.out.println(patt16(size,(val.equalsIgnoreCase("y")||val.equalsIgnoreCase("yes"))));
            break;
        default:
            System.out.println("Invalid option");
		}
        sc.close();
	}
}
