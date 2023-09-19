package Course46_47;

public class wowo3 {

	public static void main(String[] args) {
		try {
			// TODO 自動生成されたメソッド・スタブ
			//練習問題④
			int result = divideNumbers(10, 2);
			System.out.println(result);
			{

			}
		} catch (Exception e) {
			System.out.println("エラーを検出したよ!!"+e);
		}
	}

	///////これはmainメソッドの外に書いて////////
	public static int divideNumbers(int a, int b) {
		return a / b;
	}

}
