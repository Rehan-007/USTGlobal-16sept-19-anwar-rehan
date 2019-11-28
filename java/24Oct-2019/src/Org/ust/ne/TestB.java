package Org.ust.ne;
public class TestB {
     static int a;
     int b;
     {
    	 a=10;
    	 b=20;
    	 System.out.println("instance block 1");
     }
     
     
     public static void main(String[] args) {
    	System.out.println("main Started ");
		TestB t=new TestB();
		TestB t1=new TestB();

		System.out.println("main Ended");
	}
     
     
     {
    	 System.out.println("Instance Block 2");
     }
}