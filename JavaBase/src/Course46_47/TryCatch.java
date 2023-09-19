package Course46_47;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("数値を入力してね");
			Scanner stdIn = new Scanner(System.in);

			int x = stdIn.nextInt();

			int[] numarr = new int[3];

			numarr[1] = 10;
			numarr[2] = 20;
			numarr[3] = 30;
			numarr[4] = 40;

		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました！ググるべし！！！");
			System.out.println(e);
		}
	}

}
