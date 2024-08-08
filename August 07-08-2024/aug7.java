package pack.programs;
abstract class animal 
{
   abstract void sound();
}
 class lion extends animal 
 {
	 void sound() 
	 {
		 System.out.println("The lion roars");
	 }
 }
 class tiger extends animal 
 {
	 void sound() 
	 {
		 System.out.println("The tiger meow");
	 }
 }
class aug7
{
	public static void main(String[] args)
	{
		animal a=new lion();
		a.sound();
		animal b=new tiger();
		b.sound();
	}
}
