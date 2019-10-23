package javaTest;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("値を入力してください");

		int a = 0;      // 0を代入
		int b = 5;      // 5を代入
		int count = 0; // countに0を代入

		a = sc.nextInt();

		do {

			System.out.println(count);
			count++;                    //countに1を足していく

			a = a+1;                    // aにa+1

		} while (a < b);              // aがbより大きくなるまで

		sc.close();

	}
}
