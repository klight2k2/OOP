package hust.soict.dsai.aims.disc;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class CompactDisc extends Media {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("Track has been added!");
		} else {
			tracks.add(track);
			System.out.println("Add successfully!");

		}
	}

	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Track has been removed!");
		} else {
			System.out.println("Can't remove track not exist!");
		}
	}

	public int getLength() {
		int size = tracks.size();
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += tracks.get(i).getLength();
		}
		return sum;
	}

}
