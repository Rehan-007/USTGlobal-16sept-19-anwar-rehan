public class Student {
     int sid;
     String name;
     int rollNo;
     int age;
     void sleep() {
    	 
     }
     Student(int sid,String name,int rollNo,int age){
    	 this.sid=sid;
    	 this.name=name;
    	 this.rollNo=rollNo;
    	 this.age=age;
     }
     void details() {
    	 System.out.println("Student id is "+sid);
    	 System.out.println("Student name is "+name);
    	 System.out.println("Student Roll Number is "+rollNo);
    	 System.out.println("Student Age is "+age);
     }
     public static void main(String[] args) {
		Student s=new Student(1,"poirei",23,18);
		s.details();
		Student s1=new Student(2,"Anwar",74,20);
		s1.details();
		Student s2=new Student(3,"Zuhaib",72,19);
		s2.details();
		Student s3=new Student(4,"Rehan",71,22);
		s3.details();
		Student s4=new Student(5,"Priya",61,21);
		s4.details();
		Student s5=new Student(6,"Sohail",33,19);
		s5.details();
		Student s6=new Student(7,"Arijit",75,88);
		s6.details();
		Student s7=new Student(8,"Mia",41,69);
		s7.details();
		Student s8=new Student(9,"Sunny",44,18);
		s8.details();
	}
}
