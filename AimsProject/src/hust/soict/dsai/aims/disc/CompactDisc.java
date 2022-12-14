package hust.soict.dsai.aims.disc;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class CompactDisc extends Media implements Playable {
	private String artist;

	public String getArtist() {
		return artist;
	}

	private List<Track> tracks = new ArrayList<Track>();

	public CompactDisc(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
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

	public void play() throws PlayerException {
		if(this.getLength()>0) {
		System.out.println("Artist " + this.getArtist());
		int size = tracks.size();
		for (int i = 0; i < size; i++) {
			try {				
			tracks.get(i).play();
			}catch(PlayerException e) {
				throw e;
			}
		}
		}else {
			throw new PlayerException("Error: CD length is non-positive!");
		}
	}

}
