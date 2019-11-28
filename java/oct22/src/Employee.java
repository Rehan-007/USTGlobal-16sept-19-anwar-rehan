public class Employee {
    String name;
    int eid;
    Employee (String ename,int eeid){
    	name=ename;
    	eid=eeid;
    }
    public static void main(String[] args) {
		 Employee e1=new Employee("guldu",18);
		 Employee e2=new Employee("poirei",143);
		 Employee e3=new Employee("mia khalifa",69);
		 System.out.println(e1);
		 System.out.println(e2);
		 System.out.println(e3);
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.name+" "+this.eid;
    }
}
