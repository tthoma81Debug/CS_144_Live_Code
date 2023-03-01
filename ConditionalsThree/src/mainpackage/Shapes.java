package mainpackage;

public class Shapes {

	public static void triangleArea(float width, float height)
	{
		System.out.println("Calculating triangle area");
		float area = 0.5f * (width * height);
		System.out.println("The area of the triangle is " + area);
		
		//area is 1/2 base times height
		
	
		
	}
	
	public static void rectangleArea(float width, float height)
	{
		System.out.println("Calculating rectangle area");
		float area = width * height;
		System.out.println("Area of rectangle is " + area);
	}
	
	public static void circleArea(float radius)
	{
		System.out.println("Calculating circle area");
		double area = Math.PI * (Math.pow(radius, 2));
		System.out.println("area of circle is " + area);
	}
	
}
