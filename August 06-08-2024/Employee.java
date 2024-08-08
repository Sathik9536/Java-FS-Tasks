package pack.programs;
class pro
{
	int emp_id;
	String emp_name;
	void insert(int n, String name)
	{
		emp_id=n;
		emp_name=name;
	}
	void display()
	{
		System.out.println(emp_id+" "+emp_name);
	}
}
public class Employee 
{
	public static void main(String[] args) 
	{
		pro s=new pro();
		s.insert(101, "Sathik");
		s.display();
	}
}
