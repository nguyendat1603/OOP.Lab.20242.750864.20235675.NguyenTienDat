import java.util.Scanner;
public class Triangle_withStar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập n ");
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j< n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k< 2*i - 1;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
	}
	}
}
