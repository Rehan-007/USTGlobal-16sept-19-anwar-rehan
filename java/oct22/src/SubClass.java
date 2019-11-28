public class SubClass extends SuperClass {
  String s="sub class variable";
	SubClass(){
		
		System.out.println("sub class constructor");
	}
	void getSData() {
		System.out.println(this.s);
		System.out.println(super.s);
		super.superClassMethod();
		superClassMethod();
	}
}
