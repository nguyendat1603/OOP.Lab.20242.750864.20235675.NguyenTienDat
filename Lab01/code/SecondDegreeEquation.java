import java.util.Scanner;
import java.lang.Math;
public class SecondDegreeEquation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Có phương trình là ax^2 + bx + c = 0");
		System.out.println("Nhập a ");
		double a = scanner.nextDouble();
		System.out.println("Nhập b ");
		double b = scanner.nextDouble();
		System.out.println("Nhập c ");
		double c = scanner.nextDouble();
		
		double D = b*b - 4*a*c;
		double A = Math.sqrt(D);
		if(a == 0) {
			System.out.println("Không phải phương trình bậc 2");
			if(b == 0) {
				System.out.println("Phương trình có nghiệm là " + -c);
			}
			else System.out.println("Phương trình có nghiệm là " + -b/c);
		}
		if( a != 0) {
			if(D < 0) {
				System.out.println("Phương trình vô nghiệm");
			}
			if(D==0) {
				System.out.println("Phương trình có 2 nghiệm kép " + -b/(2*a));
			}
			if(D>0) {
				double x1 = (-b+A)/(2*a);
				double x2 = (-b-A)/(2*a);
				System.out.println("Phương trình có 2 nghiệm phân biệt là " + x1 + " và " + x2 );
			}
		}
		System.exit(0);
	}

}
