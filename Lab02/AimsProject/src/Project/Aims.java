package Project;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Hero", "Animation", 20.84f);
		anOrder.addDigitalVideoDisc(dvd4);
		// Bài 13
		anOrder.removeDigitalVideoDisc(dvd4);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.printCart();
		
		// Bài 16
		/*System.out.println("DVD 1 - ID: " + dvd1.getId() + ", Tiêu đề: " + dvd1.getTitle());
		System.out.println("DVD 2 - ID: " + dvd2.getId() + ", Tiêu đề: " + dvd2.getTitle());
		System.out.println("DVD 3 - ID: " + dvd3.getId() + ", Tiêu đề: " + dvd3.getTitle());

		System.out.println("Tổng số DVD đã tạo: " + DigitalVideoDisc.getNbDigitalVideoDiscs());

		
	}
}
