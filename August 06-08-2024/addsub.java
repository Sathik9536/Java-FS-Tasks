package pack.programs;
class program
{
	int c;
	int d;
	void insert(int a, int b)
	{
		c=a;
		d=b;
	}
	void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	void mul(int a, int b)
	{
		int mul=a*b;
		System.out.println(mul);
	}
	void div(int a, int b)
	{
		int div=a/b;
		System.out.println(div);
	}
	void display()
	{
		System.out.println(c+" "+d);
	}
}
class addsub 
{
	public static void main(String[] args) 
	{
		program s=new program();
		s.insert(10, 5);
		s.display();
		s.add(10, 5);
		s.sub(10, 5);
		s.mul(10, 5);
		s.div(10, 5);
		
	}
}
