public class Bus {
	int seats;
	String colour;
    Bus(int seats,String colour){
    	this.seats=seats;
    	this.colour=colour;
    }
    Bus(){
    	this(40);
    }
    Bus(int seats){
    	this(seats,"red");
    }
    void details() {
    	System.out.println("Seats="+seats);
    	System.out.println("color="+colour);
    }
}
