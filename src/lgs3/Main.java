package lgs3;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println("Напишите текст: ");
	
	String text = scanner.nextLine();
	
	System.out.println("Количество слов в тексте - " + countWords(text));
}

static int countWords(String text) {

	String textArray[] = text.split(" ");
	int counter = 0;

	for (int i = 0; i < textArray.length; i++) {

		if (textArray[i].length() > 1) {
			counter++;
		}
	}

	return counter;
	}

}