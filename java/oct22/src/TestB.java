public class TestB {
	 static int a=25;
	 int x;
	 static TestB t;
   public static void add() {
	   int a=10;
	   int b=30;
	   System.out.println(a);
	   System.out.println(b);
   }
   public static void main(String[] args) {
	add();
	TestB tb = new TestB();
	System.out.println("x value is "+tb.x);
}
}
