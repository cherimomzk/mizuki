package javaTest;

import java.util.Scanner;

public class Test5for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("値を入力してください");

		int a = 0;
		int b = 5;

		a = sc.nextInt();

		//もし変数aが変数b未満の時

		if(a < b) {

		for (int count = 0; a < b; count++) {

			System.out.println(count);

			a = a + 1;


		////もし変数aが変数b未満ではないとき
			}

		}else {

			System.out.println(0);

		}

		sc.close();


	}
	}
