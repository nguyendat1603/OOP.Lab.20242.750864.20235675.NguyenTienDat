import java.util.Arrays;
import java.util.Scanner;

public class Add2Martrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập số hàng và số cột cho 2 ma trận: ");
		int n = scanner.nextInt(); // Số hàng
		int m = scanner.nextInt(); // Số cột
		int[][] matran1 = new int[n][m];
		int[][] matran2 = new int[n][m];
		int[][] sum = new int[n][m];
		System.out.println("Hãy nhập ma trận 1:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matran1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Hãy nhập ma trận 2:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matran2[i][j] = scanner.nextInt();
				sum[i][j] = matran1[i][j] + matran2[i][j];
			}
		}
		System.out.println("Ma trận tổng của 2 ma trận trên là: ");
		System.out.println(Arrays.deepToString(sum));
		scanner.close();
		System.exit(0);

	}
}
