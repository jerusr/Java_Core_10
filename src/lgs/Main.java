package lgs;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws WrongInputException {
		
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Print word with 5 letters: ");
			
			String word = scanner.next();
			
			if (word.length() == 5) {
				String wordArray [] = word.split("");
				
				if ((wordArray[0].equalsIgnoreCase(wordArray[4])) && (wordArray[1].equalsIgnoreCase(wordArray[3]))) {
					System.out.println("Printed word " + word + " - is palidrome!");
				} else {
					System.out.println("Printed word " + word + " - not palindrome!");
				}
				
			} else {
				String itsWrong = "The entered word is not of 5 letters!";
				throw new WrongInputException(itsWrong);
			}
		
	}

}
