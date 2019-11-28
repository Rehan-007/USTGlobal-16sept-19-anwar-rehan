
public class TestB {
    public static void main(String[] args) {
		Cow c=new Cow();
		c.name="ram dulari";
		c.color="brown";
		c.eat();
		c.sleep();
		System.out.println(c.name);
		System.out.println(c.color);
		
		
		Cow c1=new Cow();
		c1.color="matt black";
		c1.name="basanti";
		System.out.println(c1.color);
		System.out.println(c1.name);
		c1.eat();
		c1.sleep();
		
		
		Person p=new Person();
		p.name="gabbar";
		Person.color="white";
		p.age=18;
		System.out.println(p.name);
		System.out.println(Person.color);
		System.out.println(p.age);
		p.eat();
		p.walk();
		Person.sleep();
	}
}
