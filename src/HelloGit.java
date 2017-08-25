import java.awt.GraphicsEnvironment;
import java.util.Scanner;

public class HelloGit {

	public static void greeting(String s) {
		System.out.println("Hello Git.");
		System.out.println("I am " + s + ".");
	}

	public static void calculateRecArea() {
		Scanner s = new Scanner(System.in);
		double width, height, area;
		System.out.println("Type in rectangle width");
		width = s.nextDouble();
		System.out.println("Type in rectangle height");
		height = s.nextDouble();
		
		area = width * height;
		System.out.println("The rectangle area is " + area + ".");
		
	}
	
	public static void main(String[] args) {
		greeting("Ajarntoe");
		calculateRecArea();
	}
	
	
}
