package Course40;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 15;
		if (number >= 10) {
			System.out.println("でか!!!!");
		}
		int age = 20;
		if (age >= 18) {
			System.out.println("大人っすね!");
		} else {
			System.out.println("キッズだね^^");
		}
		int score = 85;
		if (score >= 90) {
			System.out.println("Exellent");
			if (80 >= score && score <= 90) {
				System.out.println("Good");
			} else {
				System.out.println("勉強しましょう");
			}
		}
		boolean isRaining = true;
		if (true) {
			System.out.println("傘をもってけーーー");
		} else {
			System.out.println("よい一日を");
		}
		int num = 30 % 2;

		if (num == 0) {
			System.out.println("偶数でっせ");
		} else {
			System.out.println("奇数だよ");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("現在" + i + "回目のループです。偶数です");
			}
		}
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;

			System.out.println(sum);
		}
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		for (int num1 : numbers) {
			System.out.println(num1);
		}
		String[] cities = new String[5];
		cities[0] = "東京";
		cities[1] = "大阪";
		cities[2] = "千葉";
		cities[3] = "神奈川";
		cities[4] = "埼玉(笑)";

		for (String num2 : cities) {
			System.out.println(num2);
		}
		int[] numbers1 = new int[5];
		numbers1[0] = 10;
		numbers1[1] = 20;
		numbers1[2] = 30;
		numbers1[3] = 40;
		numbers1[4] = 50;

		int num1 = 0;
		for (int num2 : numbers1) {
			num1 = num1 + num2;

			System.out.println(num1);
		}
		int[] numbers2 = new int[5];
		numbers1[0] = 10;
		numbers1[1] = 20;
		numbers1[2] = 30;
		numbers1[3] = 40;
		numbers1[4] = 50;

		int i = 0;
		int k = 0;
		for (int num2 : numbers1) {
			if (num2 > i) {
				k = num2;
				i = k;

			}
		}
		System.out.println(k);

		int[] numbers3 = new int[5];
		numbers1[0] = 11;
		numbers1[1] = 20;
		numbers1[2] = 31;
		numbers1[3] = 40;
		numbers1[4] = 51;

		int t = 0;
		for (int num3 : numbers3) {
			if (num3 % 2 == 1) {
				System.out.println(num3);
			}
		}
		
		printHello();

		multiply(10, 20);

		int modori1 = multiplymodori(20, 30);
		System.out.println(modori1);

		boolean modori2 = isEven(26);
		System.out.println(modori2);

		String name = getGreeting("藤倉一樹");
		System.out.println(name);
	}
     
	//メソッド問題②
	static void printHello() {
		System.out.println("Hello,Wold!");
	}
    //メソッド問題③
	static void multiply(int a, int b) {
		System.out.println(a * b);
	}
    //メソッド問題④
	static int multiplymodori(int a, int b) {
		return a * b;
	}
    //メソッド問題⑤
	static boolean isEven(int number) {
		boolean tf;
		if (number % 2 == 0) {
			tf = true;
		} else {
			tf = false;
		}
		return tf;
	}
    //メソッド問題⑥
	static String getGreeting(String nume) {
		nume = "こんにちは、" + nume;
		return nume;
	}

}