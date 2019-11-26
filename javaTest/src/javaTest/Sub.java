package javaTest;

import java.util.Scanner;

public class Sub {

	public static int nenrei;
	public static int year;
	public static int umare;


	public static void calcage() {

		System.out.println("調べたい年を西暦で入力して下さい。");

		Scanner str = new Scanner(System.in);

		Sub.year = str.nextInt();

		Sub.nenrei = Sub.year - Sub.umare;

		System.out.println("西暦" + Sub.year + "年の時、あなたは" + Sub.nenrei + "歳です。");

		str.close();

	}

	public static void calcyear() {

		System.out.println("調べたい年齢を入力して下さい。");

		Scanner str = new Scanner(System.in);

		Sub.nenrei = str.nextInt();

		Sub.year = Sub.nenrei + Sub.umare;

		System.out.println("あなたが " + Sub.nenrei + "歳の時、西暦" + Sub.year + "年です。");

		str.close();

	}

}
