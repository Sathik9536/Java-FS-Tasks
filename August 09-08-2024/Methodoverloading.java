package mine;

public class Methodoverloading 
{
	public void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	public void add(double a, double b) 
	{
		double sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		Methodoverloading obj = new Methodoverloading();
		obj.add(30, 40);
		Methodoverloading objj = new Methodoverloading();
		obj.add(30.5, 40.5);

	}

}
