
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class CardNumberValidate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Card Number :");
		String creditCardNum = sc.nextLine();
		validateCreditCardNumber(creditCardNum);
	}

	static void validateCreditCardNumber(String creditCardNum) {
		if (creditCardNum.length() != 16 && creditCardNum.length() != 19) {
			System.out.println("Minimum of 16");
			return;
		}
		if (creditCardNum.charAt(0) != '4' && creditCardNum.charAt(0) != '5' && creditCardNum.charAt(0) != '6') {
			System.out.println("Should Start with 4 or 5 or 6");
			return;
		}
		// String modifiedCardNum = creditCardNum.replace("-", "");
		if (checkIfContainsOnlyNumbers(
				creditCardNum.length() == 19 ? creditCardNum.replace("-", "") : creditCardNum)) {
			System.out.println("Should Contain only numbers");
			return;
		}
		String[] creditArr = creditCardNum.split("-");
		for (String eachGroup : creditArr) {
			if (eachGroup.length() != 4) {
				System.out.println("If Credit Card Contains - it should be separated by groups of 4");
				return;
			}
		}
		System.out.println("valid");
	}

	static boolean checkIfContainsOnlyNumbers(String creditCardNum) {
		char[] eachCharList = creditCardNum.toCharArray();
		for (char eachChar : eachCharList) {
			if (Character.isDigit(eachChar)) {
				return false;
			}
		}
		return true;
	}
}
