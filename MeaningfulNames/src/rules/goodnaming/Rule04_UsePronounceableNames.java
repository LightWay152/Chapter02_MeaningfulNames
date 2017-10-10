package rules.goodnaming;

import java.util.Scanner;

public class Rule04_UsePronounceableNames {
	public static Scanner keyboardNumber;
	public static int a, b;
	
	public static int findGCD(int a, int b){
		while(a != b){
			if(a > b) a = a - b;
			else b = b - a;
		}
		return(a);
	}
	
	public static void main(String[] args) {
		keyboardNumber = new Scanner(System.in);
		System.out.print("Enter integer a: ");
		a = keyboardNumber.nextInt();
		System.out.print("Enter integer b: ");
		b = keyboardNumber.nextInt();
		System.out.println("Greatest Common Divisor of "+a+" va "+b+" is: "+findGCD(a,b));
	}

}
