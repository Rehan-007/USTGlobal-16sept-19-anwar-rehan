package assignment;

public class Array {

	public static void main(String[] args) {
		
		Object[] o = new Object[5];
		 
		o[0] = 15;
		o[1] = "Rehan";
		o[2] = 69.69;
		o[3] = true;
		o[4] = "fdhbshjd";
		
		for(int i = 0;i<o.length;i++) {
			System.out.println(o[i]);
		}
		
		System.out.println("=============== For Each loop==================");
		
		for(Object s : o) {
			System.out.println(s);
		}
	}
}
