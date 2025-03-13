import java.util.Scanner;
public class linear_system {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Có hệ a11.x1+a12.x2 = b1 \n      a21.x1 + a22.x2 = b2");
		System.out.println("Nhập lần lượt a11 a12 b1 a21 a22 b2 ");
		double a11 = scanner.nextDouble();
		double a12 = scanner.nextDouble();
		double b1 = scanner.nextDouble();
		double a21 = scanner.nextDouble();
		double a22 = scanner.nextDouble();
		double b2 = scanner.nextDouble();
		
		double D = a11*a22 - a21*a12;
		double Dx = b1*a22 - b2*a12;
		double Dy = a11*b2 - a21*b1;
		
		if(D ==0 && Dx == 0 && Dy == 0) {
			System.out.println("Hệ vô số nghiệm ");
		}
		if(D ==0 && Dx != 0 ) {
			System.out.println("Hệ vô nghiệm");
		}else if(D ==0 && Dy != 0 ) {
			System.out.println("Hệ vô nghiệm");
		}
		
		if(D != 0) {
			double x = Dx/D;
			double y = Dy/D;
			System.out.println("Hệ có nghiệm là " + x + " và " + y);
		}
		System.exit(0);
	}
}
