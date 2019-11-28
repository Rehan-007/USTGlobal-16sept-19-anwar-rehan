public class Bmw implements AutoMobile,AutoMobileWithAbs {

	@Override
	public int gear() {
		System.out.println("gear() method");
		return 10;
	}

	@Override
	public void gps() {
		System.out.println("location=gps() method ");	
	}

	@Override
	public void abs() {
		System.out.println("abs method bmw");
	}

}
