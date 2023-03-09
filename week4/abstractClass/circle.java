package week4.abstractClass;
import java.util.Scanner;
public class circle extends shape{
    Scanner sc=new Scanner(System.in);
	@Override
	public void perimeter() {
		double radius=0;
		System.out.println("Enter Radius of Circle :- ");
		radius=sc.nextDouble();
		System.out.println("Perimeter of Circle :- "+(2*Math.PI*radius));
	}

	@Override
	public void area() {
		double radius=0;
		System.out.println("Enter Radius of Circle :- ");
		radius=sc.nextDouble();
		System.out.println("Area of Circle :- "+(Math.PI*Math.pow(radius, 2)));
	}
}
