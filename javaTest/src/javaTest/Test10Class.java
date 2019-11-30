package javaTest;

import java.util.Scanner;

public class Test10Class {


	public static void main(String[] args) {

		System.out.println("モードを選択してください。1 or 2");

		Scanner str = new Scanner(System.in);

		int mode = str.nextInt();

		System.out.println("生まれた年を西暦で入力してください。");

		Sub.umare = str.nextInt();

		while (mode != 1) {
			if (mode != 2) {

				System.out.println("モードを選択してください。1 or 2");

				mode = str.nextInt();

			} else {
				break;
			}
		}

		if (mode == 1) {
			Sub sub = new Sub();
			Sub.calcage();

		} else {
			Sub sub = new Sub();
			Sub.calcyear();

			str.close();
		}

	}
}
