package Course06;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 50;

		//if文の鉄板文法
		if (a > 50) {
			System.out.println("大きい");
		} else {
			System.out.println("小さい");

			String x = "かきくけこ";

			String y = "かきくけこ";

			//例１ 変数xとyが等しいか？
			if (x.equals(y)) {
				System.out.println("文字は一緒です");
			} else {
				System.out.println("違う文字です！");
			}

			//例２ 変数xと「さしすせそ」が等しいか
			if (x.equals("さしすせそ")) {
				System.out.println("文字は一緒です");
			} else {
				System.out.println("違うよ！");
			}

		}

	}
}