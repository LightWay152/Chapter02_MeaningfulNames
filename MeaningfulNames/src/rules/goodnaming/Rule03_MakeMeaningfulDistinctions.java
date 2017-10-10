package rules.goodnaming;

import java.util.Scanner;

public class Rule03_MakeMeaningfulDistinctions {
	public static Scanner keyboardNumber;
	public static int a, b;
	public static int n;
	
	public static int inputInteger(){
		keyboardNumber = new Scanner(System.in);
		boolean check = false;
		n = 0;
		while(!check){
			System.out.print(" ");
			try{
				n = keyboardNumber.nextInt();
				check = true;
			}catch(Exception e){
				System.out.println("Incorrect integer number. Please enter integer again!");
				keyboardNumber.nextLine();
			}
		}
		return(n);
	}
	
	public static void main(String[] args) {
		System.out.print("Enter integer a: ");
		int a = inputInteger();
		System.out.print("Enter integer b: ");
		int b = inputInteger();
		System.out.print("Sum of "+a+" and "+b+" is: "+(a+b));
	}

}
