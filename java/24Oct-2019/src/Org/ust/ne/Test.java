package Org.ust.ne;
public class Test {
      
	static int a;
	static {
		a=10;
		System.out.println("static block ");
	}
	Test(){
		System.out.println("constructor test");
	}
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(a);
	}
	static {
		a=30;
		System.out.println("static block 2");
	}
	static {
		a=20;
		System.out.println("Static Block 3");
	}
}