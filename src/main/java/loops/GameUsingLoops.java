//Question 
    //Write a Simple game using loops and Binary bits concepts .
//Answer
package loops;

import java.util.Scanner;

public class GameUsingLoops {
	String[] strarr;
	
	GameUsingLoops() {
		strarr=new String[5];
		generatestr();
	}
	void generatestr() {
		int index=0,ct=0;
		for (int i = 1; i <= 31; i=i*2) {
			StringBuilder temp= new StringBuilder();
			for (int j = 1; j < 32; j++) {
				if((j&i)==i) {
					temp.append(" ").append(j);
					ct++;
					if(ct==4) {
						temp.append("\n");
						ct=0;
					}
				}
			}
			strarr[index++]= temp.toString();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to play a game (y/n)");
		String play=sc.next();
		while(play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes")) {
			String temp;
			int nextTempVal=1;
			int finalVal=0;
			System.out.println("Guess any date in a month of 31 days ");
			GameUsingLoops obj=new GameUsingLoops();
			for (int i = 0; i < obj.strarr.length; i++) {
				System.out.println("***************************************************");
				System.out.println(obj.strarr[i]);
				System.out.println("Is your date present in above dates (y/n)");
				temp=sc.next();
				if(temp.equalsIgnoreCase("y") || temp.equalsIgnoreCase("yes")) {
					finalVal=finalVal+nextTempVal;
				}
				nextTempVal=nextTempVal*2;
			}
			if(finalVal==0)
				System.out.println("You Guessed 0 which is not a valid date.");
			else {
				System.out.println("Your Guessed date is");
				System.out.println(finalVal);
			}
			System.out.println("Do you want to play again (y/n)");
			play=sc.next();
		}
		if(!play.equalsIgnoreCase("y") || !play.equalsIgnoreCase("yes")) {
			System.out.println("Thank you");
		}
		sc.close();
	}
}
