/*   2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address)
and store and display the details for two students having names "Sam" and "John" respectively.  */

package com.Day3Assignment;

public class Students {
	String name;
	int roll_no; 
	long phone_no;
	String address;
	Students(String name, int roll_no, long phone_no, String address){
		 this.name=name;
		 this.roll_no=roll_no;
		 this.phone_no=phone_no;
		 this.address=address;
	 }
	void display() {
		System.out.println("name is "+this.name);
		System.out.println("roll_no is "+this.roll_no);
		System.out.println("phone_no is "+this.phone_no);
		System.out.println("address is "+this.address);
	}
	
	public static void main(String[] args) {
		Students student1=new Students("Sam",1,9089786756l,"2/548,VirudhuNagar");
		Students student2=new Students("John",2,8098704355l,"6/67,Madhurai");
		student1.display();
		student2.display();
	}

}
