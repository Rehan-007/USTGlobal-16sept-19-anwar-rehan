public class Teacher extends Person {
    String subject;
    String dept;
    Teacher(String subject,String dept,String name,int age){
    	super("REhan",18);
    	this.subject=subject;
    	this.dept=dept;
    }
    void printDetails() {
    	System.out.println("name is  "+name);
    	System.out.println("age is  "+age);
    	System.out.println("Subject is  "+subject);
    	System.out.println("Dept  is  "+dept);
    }
}
