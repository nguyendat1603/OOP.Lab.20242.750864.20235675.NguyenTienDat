import java.util.Scanner;
public class FirstdegreeEquation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Have ax + b = 0");
		System.out.println("Enter a ");
		double a = scanner.nextDouble();
		System.out.println("Enter b ");
		double b = scanner.nextDouble();
		double x;
		if (a == 0) {
			System.out.println("No solution");
		}
		else {x = -b/a;
		System.out.println("x is " + x);}
		System.exit(0);
	}
}
