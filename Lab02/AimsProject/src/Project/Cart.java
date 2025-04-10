package Project;

public class Cart {
	public static final int MAX_NUMBERS_ORDERRED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERRED];
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERRED) {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		} else {
			System.out.println("The cart is almost full");
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemOrdered[j] = itemOrdered[j + 1];
				}
				itemOrdered[qtyOrdered - 1] = null;
				qtyOrdered--;
				System.out.println("The disc has been removed.");
				return;
			}

		}
		System.out.println("The disc was not found in the cart.");
	}

	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemOrdered[i].getCost();
		}
		return total;
	}

	// 14.1
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (int i = 0; i < dvdList.length; i++) {
			if (qtyOrdered < MAX_NUMBERS_ORDERRED) {
				itemOrdered[qtyOrdered] = dvdList[i];
				qtyOrdered++;
				System.out.println("The" + dvdList[i].getTitle() + "has been added");
			} else {
				System.out.println("The cart is almost full cannot add" + dvdList[i].getTitle());
			}
		}
	}

	// 14.2
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered < MAX_NUMBERS_ORDERRED) {
			itemOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			System.out.println("The disc" + dvd1.getTitle() + "has been added");
		} else {
			System.out.println("The cart is almost full");
		}
		if (qtyOrdered < MAX_NUMBERS_ORDERRED) {
			itemOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
			System.out.println("The disc" + dvd2.getTitle() + "has been added");
		} else {
			System.out.println("The cart is almost full");
		}

	}

	public void printCart() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.printf("%-4d %-20s %6.2f\n", i + 1, itemOrdered[i].getTitle(), itemOrdered[i].getCost());
		}
		System.out.printf("%-20s %6.2f\n", "Total Cost", totalCost());
	}
}
