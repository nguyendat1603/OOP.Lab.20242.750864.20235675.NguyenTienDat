package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();

	public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks) {
		super(title, category, cost);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
		tracks = new ArrayList<>();
	}

	public String getArtist() {
		return artist;
	}

	public void addTrack(Track t) {
		if (tracks.contains(t)) {
			System.out.println("Already on CD: " + t.getTitle());
		} else {
			tracks.add(t);
			System.out.println("Added track");
		}
	}

	public void removeTrack(Track t) {
		if (tracks.remove(t)) {
			System.out.println("Removed track");
		} else {
			System.out.println("Track not in list");
		}
	}

	public int getLength() {
		int sum = 0;
		for (Track t : tracks)
			sum += t.getLength();
		return sum;
	}

	public String toString() {
		return "CD – [" + getTitle() + "] – [" + getCategory() + "] – [" + getDirector() + "] – [" + artist + "] : ["
				+ getCost() + "] $";
	}

	public void play() {
		System.out.println("Chạy CD: " + getTitle());
		System.out.println("Tác giả: " + artist);
		for (Track track : tracks) {
			track.play(); // từng track để phát
		}
	}
}
