package Course17;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//実践
		int num = 50;
		char moji = 50;
		
		System.out.println("intだったら50は："+num);
		System.out.println("charだったら50は"+moji);
		
		//↓数値を扱う型//
		byte bytenum = 127;
		
		short shortnum = 32767;
		
		int intnum = 2147483647;
		
		System.out.println(bytenum);
		System.out.println(shortnum);
		System.out.println(intnum);
		
		//しまえる範囲を超えてしまうと・・・
		//エラーになる！
		
		
		//ちなみに、マイナスの値はマイナスをつけて変数にしまえばOK
		shortnum = -32768;
		
		System.out.println(shortnum);
		
		
		
		
		
		int x = 8;
		// >>　は右に2ビットずらす。
		x = x >> 2;
		
		System.out.println(x);
		
		int y = 8;
		
		// << は左にずらす
		y = y << 2;
		
		System.out.println(y);
		
		//ちなみに。
		int z =8;
		
		//こう書くと4ビットずらす。
		z = z << 4;
		
		System.out.println(z);
		
		
		
		
		
		

	}

}
