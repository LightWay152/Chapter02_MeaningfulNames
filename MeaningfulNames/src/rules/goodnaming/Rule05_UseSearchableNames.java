package rules.goodnaming;

import java.util.Scanner;

public class Rule05_UseSearchableNames {
	public static Scanner keyboardNumber;
	public static int numberOfUserEntered;
	public static int s;
	public static long digitsNumber;
	
	public static int inputInteger(){
		keyboardNumber = new Scanner(System.in);
		boolean check = false;
		numberOfUserEntered = 0;
		while(!check){
			System.out.print(" ");
			try{
				numberOfUserEntered = keyboardNumber.nextInt();
				check = true;
			}catch(Exception e){
				System.out.println("Incorrect integer number. Please enter integer again!");
				keyboardNumber.nextLine();
			}
		}
		return(numberOfUserEntered);
	}
	
	public static int SumOfTheDigitsInANumber(long originalNumber){
		s = 0;
		while(originalNumber != 0){
			digitsNumber = originalNumber % 10;
			s += digitsNumber;
			originalNumber /= 10;
		}
		return(s);
	}
	
	public static void main(String[] args){
		System.out.print("Enter original number:");
		int originalNumber = inputInteger();
		System.out.println("Sum of the digits in number "+originalNumber+" = " +SumOfTheDigitsInANumber(originalNumber));
	}

}
