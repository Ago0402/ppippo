package Course26;
import java.util.Random;
import java.util.Scanner;
public class popo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int gemecount = 0;
		int wincount = 0;
		int losecount = 0;
		int okane = 1000;
		shozi(0);
		int z = modoriOne(0);
		int z1 =modori(0);
		Scanner stdIn = new Scanner(System.in);
		System.out.println("現在の所持金は" + okane + "です。");
		System.out.println("カードは" + z + "です");
		System.out.println("高いと予想するなら「1」、低いと予想するなら「2」");
		int r = stdIn.nextInt();
		System.out.println("現在のカード："+z);
		System.out.println("次のカード："+z1);
		String mama = yoso(z,z1,r);
		
		}
		static void shozi(int okane) {
		int z = modoriOne(3);
		}
		static int modoriOne(int z) {
		Random rnd = new Random();
		int mom = rnd.nextInt(12) + 1;
		return mom;
		}
		static int modori(int z1) {
		Random rnd = new Random();
		int p = rnd.nextInt(12) + 1;
		return p;
		}
		static String yoso(int z, int z1, int r) {
		String a2 = "";
		if (z > z1 && z == 1 || z > z1 && z == 1) {
		a2 = "LOSE";
		System.out.println("LOSE");
		}
		if (z < z1 && z == 2 || z > z1 && z == 2) {
		a2 = "WIN";
		System.out.println("WIN");
		}
		return a2;
		}
		static int syouritu(int gemecount, int wincount) {
		int num = gemecount * wincount;
		return num;
		}
		static void dispResult(int wincount, int losecount, int gemecount) {
			System.out.println("あなたの勝利数は" + wincount + "です。");
			System.out.println("あなたの敗北数は" + losecount + "です。");
			System.out.println("あなたのゲーム数は" + gemecount + "です。");
		}
		static String syuryo(int x) {
		String aa = "";
		if (x == 9999) {
		aa = "END";
		} else {
		aa = "CONT";
		}
		return aa;
		}
		

	}


