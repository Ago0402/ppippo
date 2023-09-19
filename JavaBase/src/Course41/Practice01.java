package Course41;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		String moji = "模擬テスト。100点取ります。";
		System.out.println(moji);
		
		int p = 50;
		int y = 100;
		int z = p*y;
		
		System.out.println(z);
		
		String l = stdIn.next();
		
	

	for(int i=1; i<=5; i++) {
		System.out.println(i);
		
	}
	int c = stdIn.nextInt();
	if(c>50) {
		System.out.println("50以上です。");
	}else {
		System.out.println("49以下です。");
	}
	boolean isRaining = true;
	if(true) {
		System.out.println("傘をもってけーーー");
	} else {
		System.out.println("よい一日を");
	}
	
	int[] numArr = new int[5];
	numArr[0] = 10;
	numArr[1] = 50;
	numArr[2] = 30;
	numArr[3] = 20;
	numArr[4] = 40;
	
	for (int num1 : numArr) {
		System.out.println(num1);
	}
	int i = 0;
	int k = 0;
	for (int num2 : numArr) {
		if (num2 > i) {
			k = num2;
			i = k;
			System.out.println(num2);
		}
	}

		}
}
