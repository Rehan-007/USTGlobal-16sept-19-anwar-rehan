
public class Test {
	public static void main(String[] args) {
		Pen p=new Pen();
		p.cost=4;
		p.color="blue";
		p.brand="parker";
		System.out.println("cost is"+p.cost);
		System.out.println("color is"+p.color);
		System.out.println("brand is"+p.brand);
		p.write();
		
		
		Van v= new Van();
		v.price=30000000;
		v.color="matt black";
		v.move();
		System.out.println(v.price);
		System.out.println(v.color);
		
		
		Van v1=new Van();
		v1.price=213545842;
		v1.color="grey";
		v1.move();
		System.out.println(v1.price);
		System.out.println(v1.color);
		
	}

}
