package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Playable;

public class Track implements Playable {
	private String title;
	private int length;

	public Track(String title, int length) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public void play() throws PlayerException {
		if(this.getLength()>0) {	
		System.out.println("Play track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		}else {
			throw new PlayerException("Error:Track length is non-positive");
		}
		
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Track) {
			Track obj = (Track) o;
			return this.getTitle().equals(obj.getTitle()) && this.getLength() == obj.getLength();
		}
		return false;
	}
}
