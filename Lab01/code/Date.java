import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập tháng
		System.out.print("Nhập tháng (tên đầy đủ, viết tắt hoặc số): ");
		String monthInput = scanner.nextLine().trim();

		// Nhập năm
		int year;
		while (true) {
			System.out.print("Nhập năm (số nguyên không âm, đủ 4 chữ số): ");
			if (scanner.hasNextInt()) {
				year = scanner.nextInt();
				if (year >= 0 && String.valueOf(year).length() == 4) {
					break;
				} else {
					System.out.println("Lỗi: Năm phải là số nguyên dương có đúng 4 chữ số.");
				}
			} else {
				System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
				scanner.next(); // Xóa đầu vào không hợp lệ
			}
		}

		// Xác định tháng
		int month = getMonthNumber(monthInput);
		if (month == -1) {
			System.out.println("Lỗi: Tháng không hợp lệ.");
		} else {
			int days = getDaysInMonth(month, year);
			System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
		}

		scanner.close();
	}

	// Chuyển đổi tên tháng thành số tháng
	private static int getMonthNumber(String input) {
		switch (input.toLowerCase()) {
		case "january":
		case "jan.":
		case "jan":
		case "1":
			return 1;
		case "february":
		case "feb.":
		case "feb":
		case "2":
			return 2;
		case "march":
		case "mar.":
		case "mar":
		case "3":
			return 3;
		case "april":
		case "apr.":
		case "apr":
		case "4":
			return 4;
		case "may":
		case "5":
			return 5;
		case "june":
		case "jun.":
		case "jun":
		case "6":
			return 6;
		case "july":
		case "jul.":
		case "jul":
		case "7":
			return 7;
		case "august":
		case "aug.":
		case "aug":
		case "8":
			return 8;
		case "september":
		case "sep.":
		case "sep":
		case "9":
			return 9;
		case "october":
		case "oct.":
		case "oct":
		case "10":
			return 10;
		case "november":
		case "nov.":
		case "nov":
		case "11":
			return 11;
		case "december":
		case "dec.":
		case "dec":
		case "12":
			return 12;
		default:
			return -1; // Không hợp lệ
		}
	}

	// Xác định số ngày trong tháng
	private static int getDaysInMonth(int month, int year) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear(year) ? 29 : 28;
		default:
			return -1; // Không hợp lệ
		}
	}

	// Kiểm tra năm nhuận
	private static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
}
