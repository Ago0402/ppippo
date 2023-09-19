package Course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		int ransu = rnd.nextInt(5) + 1;
		int kokuruzo = rnd.nextInt(10) + 3;

		Player me = new Player();
		me.setGakuryoku(rnd.nextInt(5) + 1);
		me.setKinryoku(rnd.nextInt(5) + 1);
		me.setMitame(rnd.nextInt(5) + 1);
		me.setOmosiro(rnd.nextInt(5) + 1);

		Target koku = new Target();
		koku.setHituyouGaku(rnd.nextInt(10) + 3);
		koku.setHituyouKin(rnd.nextInt(10) + 3);
		koku.setHituyouMita(rnd.nextInt(10) + 3);
		koku.setHituyouOmo(rnd.nextInt(10) + 3);

		System.out.println("MEのパラメータ");
		System.out.println(me.getGakuryoku());
		System.out.println(me.getKinryoku());
		System.out.println(me.getMitame());
		System.out.println(me.getOmosiro());

		int Gan = 0;
		int Gaku = me.getGakuryoku();
		int Kin = me.getKinryoku();
		int Mita = me.getMitame();
		int Omo = me.getOmosiro();
		int y = 0;
		do {
			y++;
			System.out.println("トレーニングを選んでください");
			int x = stdIn.nextInt();
			if (x == 1) {
				Gaku = Gaku + 1;
				Gan = Gaku;
				System.out.println("学力が1上がりました。今のステータスはこんな感じです");
			} else if (x == 2) {
				Kin = Kin + 1;
				System.out.println("筋力が1上がりました。今のステータスはこんな感じです");
			} else if (x == 3) {
				Mita = Mita + 1;
				System.out.println("魅力が1上がりました。今のステータスはこんな感じです");
			} else if (x == 4) {
				Omo = Omo + 1;
				System.out.println(Omo);
				System.out.println("面白さが1上がりました。今のステータスはこんな感じです");
			}
			System.out.println("学力→" + Gan);
			System.out.println("筋力→" + Kin);
			System.out.println("魅力→" + Mita);
			System.out.println("面白さ→" + Omo);

			int dodo = rnd.nextInt(4) + 1;
			if (dodo == 1) {
				System.out.println("相手の必要な学力です");
				System.out.println(koku.getHituyouGaku());
			} else if (dodo == 2) {
				System.out.println("相手の必要な筋力です");
				System.out.println(koku.getHituyouKin());
			} else if (dodo == 3) {
				System.out.println("相手の必要な魅力です");
				System.out.println(koku.getHituyouMita());
			} else if (dodo == 4) {
				System.out.println("相手の必要な面白さです");
				System.out.println(koku.getHituyouOmo());
			}

		} while (y < 7);

		System.out.println("告白してね");
		int j = stdIn.nextInt();
		if (j == 1) {
			if (Gan > koku.getHituyouGaku()) {
				System.out.println("クリア！！");
			} else {
				System.out.println("死亡");
			}
		}
		if (j == 2) {
			if (Kin > koku.getHituyouKin()) {
				System.out.println("クリア！！");
			} else {
				System.out.println("死亡");
			}
		}
		if (j == 3) {
			if (Mita > koku.getHituyouMita()) {
				System.out.println("クリア！！");
			} else {
				System.out.println("死亡");
			}
		}
		if (j == 4) {
			if (Omo > koku.getHituyouOmo()) {
				System.out.println("クリア！！");
			} else {
				System.out.println("死亡");
			}
		}

	}
}
