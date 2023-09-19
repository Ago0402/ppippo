package Course54_55;

public class StudentControll {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student tonari = new Student(17, "谷口");
		Student me = new Student(23, "藤田");
		Student[] mymen = new Student[2];
		mymen[0] = tonari;
		mymen[1] = me;
		
		mymen[1].setName("誰か");
		System.out.println(mymen[1].getName());
	}

}
