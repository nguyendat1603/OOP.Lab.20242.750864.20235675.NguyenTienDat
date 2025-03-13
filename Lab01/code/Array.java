import java.util.Scanner;
import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] mang = new int[n];
		System.out.println("Hãy nhập từng phần tử của mảng: ");
		int sum = 0;
		for(int i=0;i<n;i++) {
			mang[i] = scanner.nextInt();
			sum = sum + mang[i];
		}
		System.out.println("Các phần tử của mảng là: ");
		System.out.println(Arrays.toString(mang));
		Arrays.sort(mang);
		System.out.println("Mảng sau khi sắp xếp lại là: ");
		System.out.println(Arrays.toString(mang));
		double average = 0;
		average = (double)sum/n;
		System.out.println("Tổng tất cả phần từ là: " + sum + " Và trung bình các phần tử là " + average);
		System.exit(0);
		scanner.close();
	}
}
