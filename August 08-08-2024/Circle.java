package pack.programs;

public class Circle {
	int radius;
	String color;
	
	
	Circle(int n, String m){
		radius = n;
		color =  m;
		
		System.out.println("The radius is"+n);
		System.out.println("The color is"+m);
		
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle(50,"red");


	}

}
