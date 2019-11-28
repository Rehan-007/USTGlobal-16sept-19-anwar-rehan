public class TestC {
  public static void main(String[] args) {
	Btm b=new Btm();
	b.swipe();
	int count=b.getCount();
	System.out.println("count is "+count);
	int totalCount=b.getTotalCount();
	System.out.println("totalCount is "+totalCount);
	
	
	Btm b1=new Btm();
	b1.swipe();
	int count1=b1.getCount();
	System.out.println(count1);
	int total1=b1.getTotalCount();
	System.out.println(total1);
}
}
