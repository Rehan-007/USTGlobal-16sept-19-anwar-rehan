
public class Employee {
	int eId;
	String name;
	int sal;
	public Employee(int id,String name,int sal)
	{
		this.eId=id;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return this.eId+" "+this.name+" "+this.sal;
	}
	
}
