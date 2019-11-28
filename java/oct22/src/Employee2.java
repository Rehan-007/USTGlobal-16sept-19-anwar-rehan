public class Employee2 {
    String name;
    int eid;
    long adharNo;
	Employee2(String name,int eid,long adharNo){
    	 this.name=name;
    	 this.eid=eid;
    	 this.adharNo=adharNo;
     }
	Employee2(String name,int eid){
		this.name=name;
		this.eid=eid;
	}
	Employee2(int eid,String name){
		this.name=name;
		this.eid=eid;
	}
	void viewDetails() {
		System.out.println("Employee name is  "+name);
		System.out.println("Employee id is  "+eid);
		System.out.println("Employee AdharNo is  "+adharNo);


	}
}
