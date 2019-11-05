package javaTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("年齢を入力してください");

		int nenrei = 0;	//変数nenreiを作成
		int kakaku = 0;	//変数kakakuを作成

		nenrei = sc.nextInt();

		if (nenrei == 0) {	//年齢が0歳だったら…
			kakaku = 100;

		} else {	//年齢が0歳ではなかったら…
			kakaku = 500;

		}

		System.out.println(kakaku);

		sc.close();

	}

}
