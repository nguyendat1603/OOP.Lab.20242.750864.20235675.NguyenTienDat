package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

	public DigitalVideoDisc(String title) {
		super(title);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}

	@Override
	public String toString() {
		return "DVD – [" + getTitle() + "] – [" + getCategory() + "] – [" + getDirector() + "] – [" + getLength()
				+ " mins] : [" + getCost() + "] $";
	}

	public boolean isMatch(String title) {
		return this.getTitle().toLowerCase().contains(title.toLowerCase());
	}

	public void play() {
		System.out.println("Chạy DVD: " + this.getTitle());
		System.out.println("Độ dài DVD là: " + this.getLength());
	}
}
