
public class Student {
	private int studentNumber;

	Student(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public void showInfo() {
		System.out.println("学籍番号：" + this.studentNumber);
	}
}
