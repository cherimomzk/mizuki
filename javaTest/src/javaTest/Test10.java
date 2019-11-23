package javaTest;

import java.util.Scanner;

public class Test10 {


	public static void main(String[] args) {
		boolean a = true;

		Scanner str = new Scanner(System.in);

		System.out.println("モードを選択してください。1 or 2");

		int mode = str.nextInt();

		while (a) {




			//モード判定

			if (mode == 1) {


				//モード1の場合　西暦から年齢を計算

				System.out.println("生まれた年を西暦で入力してください。");

				int umare = str.nextInt();

				Test10Calcage test10calcage = new Test10Calcage();
				test10calcage.Aga(umare);
				break;

			} else if (mode == 2) {

				//モード2の場合　年齢から西暦を計算

				System.out.println("生まれた年を西暦で入力してください。");

				int umare = str.nextInt();

				Test10Calcyear test10calcyear = new Test10Calcyear();
				test10calcyear.Year(umare);
				break;

			} else {

				System.out.println("モードが正しく入力されていません。");

			}
			str.close();

		}

	}
}
