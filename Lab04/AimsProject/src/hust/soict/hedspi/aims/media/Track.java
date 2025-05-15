package hust.soict.hedspi.aims.media;

public class Track implements Playable {
	private String title;
	private int length;

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	public String toString() {
		return title + " (" + length + " min)";
	}

	public void play() {
		System.out.println("Chạy track: " + title);
		System.out.println("Độ dài là: " + length);
	}

	public boolean equals(Object O) {
		if (this == O) {
			return true;
		}
		if (O == null || !(O instanceof Track)) {
			return false;
		}
		Track other = (Track) O;
		return this.title.equals(other.getTitle()) && this.length == other.getLength();
	}

}
