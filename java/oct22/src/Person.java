public class Person {
	int age;
	String name;
    Person(int pAge,String pName) {
    	 age=pAge;
    	 name=pName;
    }
     public static void main(String[] args) {
	     Person p= new Person(18,"Rehan");
	     Person p1=new Person(22,"Anwar");
	     System.out.println(p.age);
	     System.out.println(p1);
	}
}
