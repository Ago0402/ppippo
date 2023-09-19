package Course19;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String X = "ねも";
		String y ="ひろむ";
		String z ="まさくに";
		String w ="はるや";
		String n ="だいご";
		
		String a ="れいや";
		String b ="いの";
		String c ="こうき";
		String d ="こうせい";
		
		
		//配列の鉄板構文
		//[]の事を要素と呼ぶ。要素は0から始まる。
		String[] nameList = new String[10];
		nameList[0] = "やすだ";
		nameList[1] = "ねも";
		nameList[2]	= "ながなわ";
		nameList[3] = "はるや";
		nameList[4] = "こうせい";
		nameList[5]	= "まさくに";
		nameList[6] = "ひろむ";
		nameList[7] = "れいや";
		nameList[8]	= "だいご";
		
		for(int i = 3; i < 6; i++) {
			System.out.println("俺の友達の名前は"+ nameList[i]+"だ。");
		}
		
		
		
		
		
		
		

	}

}
