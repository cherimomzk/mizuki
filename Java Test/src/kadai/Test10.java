package kadai;

import java.util.Scanner;

public class Test10 {

public static void main(String[] args) {

	Sub sub = new Sub();

	System.out.println("モードを選択してください。1 or 2");

	Scanner str = new Scanner(System.in);

	int mode = str.nextInt();

	System.out.println("生まれた年を西暦で入力してください。");

	sub.setUmare(str.nextInt());

	while(mode != 1) {
		if(mode != 2) {

		System.out.println("モードを選択してください。1 or 2");

		mode = str.nextInt();

	} else {
		break;
	}
	}


    if(mode == 1) {
    	sub.calcage();


    } else {
    	sub.calcyear();



    }

    str.close();

    }
}

