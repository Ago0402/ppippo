package Course36;

public class Useclass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student st = new Student();

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		st.display();

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st2.setSchool("船橋情報専門学校");

		st.display();
		st2.display();
		
		
	
	      Kaden kd1 = new Kaden();
	      Kaden kd2 = new Kaden();
	      kd1.name="電子レンジ";
	      kd2.name="電子ん";
	      kd1.price=10000;
	      
		kd1.display();
		kd2.display();

	}
}
