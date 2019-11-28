public class TestA {
   public static int add(int a,int b) {
	   System.out.println("add(int a,int b) method");
	   return a+b;
   }
   public static long add(long a,byte b) {
	   System.out.println("add(int a,byte b) method");
	   return a+b;
   }
   public static void add(int a,byte b) {
	   System.out.println("add(int a,int b) method");
   }
   
   public int multiply(int a,int b) {
	   System.out.println("multiply(int a,int b) method");
	   return a*b;
   }
   
   public int multiply(int a,byte b) {
	   System.out.println("multiply(int a,byte b) method");
	   return a*b;
   }
   public static void main(String[] args) {
	   System.out.println("main method");
	   main(10);
	   add(10,20);
	   TestA t=new TestA();
	   t.multiply(10, 20);
	
}
   public static void main(int a) {
	   System.out.println("overLoaded main method");
}

}
