package Course29;

public class Practise01 {

		public class Practice01 {
			public static void main(String[] args) {

				Character me = new Character();

				me.name = "渡部";
				me.hp = 150;
				me.str = 100;
				me.dex = 50;
				me.agi = 100;
				me.def = 70;

				me. Character();

				Character tonari = new Character();

				tonari.name = "沼田";
				tonari.hp = 150;
				tonari.str = 100;
				tonari.dex = 50;
				tonari.agi = 100;
				tonari.def = 70;

				tonari.viewStatus();

				me.battle(me, tonari);
		
			}
	}

}
