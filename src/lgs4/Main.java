package lgs4;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println("�������� �����: ");
	
	String text = scanner.nextLine();

	
	viewMostUsedWord(text);

	}

static void viewMostUsedWord(String text) {

	String newText = deleteNonLiteralSymbols(text);
	String textArray[] = newText.toLowerCase().split(" ");

	/*
	 * ������ �������� {������� ����� � ��������� �������, ���������� ������������� ���};
	 * ������ ������� �����, ������� ����������� � ������ ������������ ���������� ���
	 */
	int indexArray[] = { 0, -1 };
	int counter = 0;

	for (int i = 0; i < textArray.length; i++) {

		// ������������ ������ ������� ���������� �������

		// ������� ����� � ��������� ������� ������ ����������� � ������� �������
		if (indexArray[1] < 0) {
			counter = 1;
		}
		// ���� ����� � ������ �� ������, ���������� ��� � ���, ��� �� ������ ������ ����������� ���������� ���������� ���
		// ���� ��� �� �����, �.�. ������� ����� ����� - ����������� � ������� �������
		else if (!textArray[indexArray[0]].equals(textArray[i])) {
			counter = 1;
		}
		// ���� ����� �����, �.�. ������� ����� �� ��� ���������� �����, ������� �� �������� �����
		else {
			continue;
		}

		for (int j = i + 1; j < textArray.length; j++) {

			if (textArray[i].equals(textArray[j])) {
				counter++;
			}
		}

		if (indexArray[1] <= counter) {
			indexArray[0] = i;
			indexArray[1] = counter;
			// System.out.println(i+1 + ". --> " + i + " " + counter);
		}
		// System.out.println(i+1 + ". " + i + " " + counter);
	}

	System.out.println(
			"����� ������������� �����: " + textArray[indexArray[0]] + " (����������� " + indexArray[1] + " ���)");
}

static String deleteNonLiteralSymbols(String text) {

	String newText = text.replaceAll("[.,:;!?@#$%^*(){}��]", "");
	return newText;
}

}
