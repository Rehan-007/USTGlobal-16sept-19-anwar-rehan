import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public class ProductTest {
public static void main(String[] args) {
	Product p1=new Product();
		p1.setPrice(20);
		p1.setQty(2);
		p1.setName("sanjay");
	Product p2=new Product();
	   p2.setPrice(40);
	   p2.setQty(2);
	   p2.setName("vimal");
	   LinkedList<Product> lst=new LinkedList<Product>();
	   lst.add(p1);
	   lst.add(p2);
	   for(int i=0;i<lst.size();i++)
	   {
		   Product p=lst.get(i);
		   System.out.println(p);
	   }
	   for (Product product : lst) {
		System.out.println(product);
	}
}
}
 