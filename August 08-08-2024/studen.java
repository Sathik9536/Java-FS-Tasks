package pack.programs;

public class studen {
	

		 String name;
		 int rollnumber;
		 double marks;

		// Parameterized Constructor
		 
		  studen(String n,int roll,double mar){
			 name=n;
			 rollnumber=roll;
			 marks = mar;
			 System.out.println("Name: "+name);
			 System.out.println("Rollnumber: "+rollnumber);
			 System.out.println("Marks: "+marks);
		 }
		

	public static void main(String[] args) {
		studen obj = new studen("Ahamed Sathik",302,98);

	}

}
