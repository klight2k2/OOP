package aims;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	DigitalVideoDisc(String title) {
		this.title = title;
	}

	DigitalVideoDisc(String category, String title, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	DigitalVideoDisc(String director, String category, String title, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		DigitalVideoDisc disc = (DigitalVideoDisc) obj;
		if (this.title.equals(disc.title) && this.category.equals(disc.category)
				&& this.director.equals(disc.director) && this.length == disc.length && this.cost == disc.cost) {
			return true;
		} else {
			return true;
		}
	}
}
