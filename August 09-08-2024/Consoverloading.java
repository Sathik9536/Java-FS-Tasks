package mine;

public class Consoverloading 
{
	
	Consoverloading(int a, String b)
	{
		System.out.println("Number :" +a+ " " + "Name :" +b);
	}
	Consoverloading(int c, String d, int e)
	{
		System.out.println("Number : " +c+ " " + "Name : " +d+ " " + "Number : " +e);
	}
    Consoverloading(int f, String g, int h, int i)
    {
    	System.out.println("Number :" +f+ " " + "Name : " +g+ " " + "Number : " +h+ " " + "Number :" +i);
    }
    
    
	public static void main(String[] args) 
	{
		 Consoverloading ob = new Consoverloading(01, "Ahamed");
		 Consoverloading obj = new Consoverloading(01, "Sathik" , 02);
		 Consoverloading obb = new Consoverloading(01, "Ussain" , 02, 03);
	}

}
