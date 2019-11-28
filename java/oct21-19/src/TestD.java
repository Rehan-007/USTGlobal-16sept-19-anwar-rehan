public class TestD {
    public static void main(String[] args) {
		Student s=new Student();
		Student.cName="silicon";
		s.name="rehan";
		s.reghNo=1501209220;
		System.out.println(Student.cName);
		System.out.println(s.name);
		System.out.println(s.reghNo);
		
		
		
		Student s1=new Student();
		Student.cName="silicon";
		s1.name="rehan";
		s1.reghNo=1501209221;
		System.out.println(Student.cName);
		System.out.println(s1.name);
		System.out.println(s1.reghNo);
	}
}
