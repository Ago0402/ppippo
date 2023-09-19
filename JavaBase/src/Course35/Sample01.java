package Course35;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//2つのcalcメソッドを呼び出し
         
         calc("wpp");
         
         calc(50);
         
         
         
	}
	static void calc() {
		System.out.println("計算したいときは、引数を2つ渡して");
	}
	static void calc(int a, int b) {
		
		System.out.println("計算結果は"+(a+b));	
	}
	static void calc(String x ) {
		System.out.println("渡された文字は"+x);
		
	}
	static void calc(int x) {
		System.out.println("受け取った値は"+x);
		
		
	}
}


