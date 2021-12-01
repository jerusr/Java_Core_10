package lgs2;

import java.util.Scanner;

import lgs.WrongInputException;

public class Main {
	
	public static void main(String[] args) throws WrongInputException {
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Print something: ");
		
		String word = scanner.nextLine();
		System.out.println(replaceVowels(word));
	}	
		
		static String replaceVowels(String text) {
			char textArray[] = text.toCharArray();
			char vowelArray[] = { 'e', 'y', 'u', 'i', 'o', 'a', 'E', 'Y', 'U', 'I', 'O', 'A'};
			for (int i = 0; i < textArray.length; i++) {

				for (int j = 0; j < vowelArray.length; j++) {

					if (textArray[i] == vowelArray[j]) {
						textArray[i] = '-';
					}
				}
			}

			String newText = new String(textArray);
			return newText;
		}	
}
