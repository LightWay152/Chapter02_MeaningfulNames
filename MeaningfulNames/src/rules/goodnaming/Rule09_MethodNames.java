package rules.goodnaming;

import java.util.Scanner;

public class Rule09_MethodNames {
	public static Scanner keyboardNumber;
	public static int array[] = {1,3,5,7,9,11};
	public static int checkNumber;
	
	public static boolean existed(int array[]){
		checkNumber = 9;
		for(int i=0; i <= array.length; i++){
			if(checkNumber == array[i])
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		if(existed(array))
			System.out.println("Check number is existed in array!");
		else
			System.out.println("Check number is not existed in array!");
	}
}
