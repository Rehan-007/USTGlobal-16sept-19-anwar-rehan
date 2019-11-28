package assignment;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] std = new Student[5];
		
		std[0] = new Student(1,"Sunny");
		std[1] = new Student(2,"MIA");
		std[2] = new Student(3,"Danny");
		std[3] = new Student(4,"Jonny");
		
		for(int i = 0;i<std.length;i++) {
			System.out.println(std[i]);
		}

		for(Student s : std) {
			System.out.println(s);
		}

	}
}
