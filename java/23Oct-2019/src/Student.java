public class Student {
      String name;
      int rollNo;
      final String cname="Silicon";
      final int cid;
      
       Student(){
    	   this.cid=200;
       }
      Student(String name,int rollNo,int cid){
    	  this.name=name;
    	  this.rollNo=rollNo;
    	  this.cid=cid;
      }
      
      final void printDetails() {
    	  System.out.println("hi "+ name +" welcome to "+cname);
      }
      
      final void printDetails(String name) {
    	  System.out.println(name +" welcome to "+cname);
      }
}
