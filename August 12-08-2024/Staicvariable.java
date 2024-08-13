package mine;
// Static and Instance variable 


 class Staicvariable {

	static String Name = "Sathik"; // Static variable
	
	
	
	int a;  // Instance Variable
	
	void student (int number) 
	{
	 	a = number;
	 	System.out.println("The number is " +a + " "+Name);
	}
	void studen (int numbe) 
	{
	 	a = numbe;
	 	System.out.println("The number is " +a);
	}

	public static void main(String[] args) {
		
		Staicvariable obj = new Staicvariable();
		obj.student(20);
		obj.studen(30);
		

	}

}
