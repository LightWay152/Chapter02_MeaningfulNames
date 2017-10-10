package rules.goodnaming;

import java.util.Scanner;

public class Rule01_UseIntentionRevealingNames {
	public static Scanner kbNumber;
	public static int a, b;
	
	public static void main(String[] args) {
		kbNumber = new Scanner(System.in);
		System.out.print("Enter integer a: ");
		a = kbNumber.nextInt();
		System.out.print("Enter integer b: ");
		b = kbNumber.nextInt();
		System.out.print("Sum of "+a+" and "+b+" is: "+(a+b));
	}
}