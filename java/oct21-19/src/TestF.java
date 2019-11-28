public class TestF {
   public static void main(String[] args) {
	ThirdGen tg=new ThirdGen();
	tg.call();
	tg.msg();
	tg.camera();
	tg.games();
	
	System.out.println("*********************************");
	
	SecondGen sg=new SecondGen();
	sg.call();
	sg.msg();
	sg.games();
	
	System.out.println("*********************************");
	
	FirstGen fg=new FirstGen();
	fg.call();
	fg.msg();
}
}
