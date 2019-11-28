import java.util.List;
import java.util.ArrayList;

public class EmpTest {
	public static void main(String[] args) {
	Employee e1=new Employee(1234,"rehan",52000);
	Employee e2=new Employee(1235,"ganesh",29000);
	Employee e3=new Employee(1236,"sanjay",25000);
	Employee e4=new Employee(1237,"anwar",24000);
	List<Employee> emplst=new ArrayList<Employee>();
	emplst.add(e1);
	emplst.add(e2);
	emplst.add(e3);
	emplst.add(e4);
	System.out.println(emplst);
	for(int i=0;i<emplst.size();i++)
	{
		Employee ele=emplst.get(i);
		System.out.println(ele);
	}
	for(Employee e:emplst)
	{
	 System.out.println(e);
	}

}
}