package javaTest;

import java.util.Scanner;

public class Test10Calcage {

	public void Aga(int umare) {

		Scanner str = new Scanner(System.in);

		System.out.println("調べたい年を西暦で入力して下さい。");


		int year = str.nextInt();
		int nenrei = year - umare;

		System.out.println("西暦" + year +"年の時、あなたは" + nenrei + "歳です。  ");



		str.close();


	}

}
