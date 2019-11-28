public class Employee1 {
	  String name;
	    int eid;
	    Employee1 (String name,int eid){
	    	this.name=name;
	    	this.eid=eid;
	    }
	    void printDetails() {
	    	System.out.println("Employee name is="+name);
	    	System.out.println("employeee ID is="+eid);
	    	this.sayHello();
	    }
	    void sayHello() {
	    	System.out.println("hello "+name +" welcome to ust Global");
	    }
	    public static void main(String[] args) {
	    	Employee1 e1=new Employee1("Sunny",69);
	    	e1.printDetails();
	    	Employee1 e2=new Employee1("Alia",25);
	    	e2.printDetails();
	    	Employee1 e3=new Employee1("Mia",21);
	    	e3.printDetails();
		}
}
