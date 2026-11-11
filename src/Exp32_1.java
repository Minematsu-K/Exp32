
public class Exp32_1 {

	public static void main(String[] args) {
		Student student = new Student(3201);
		Object object = student;

		System.out.println(student == object);
		student.showInfo();
	}

}
