public class CD extends LibraryItem implements LoanItem {
	private String band;
	private String title;
	private int numTracks;

	public CD(String band, String title, int numTracks) {
		setBand(band);
		setTitle(title);
		setNumTracks(numTracks);
	}

	public double calculatePrice() {
		return numTracks * 0.4;
	}

	public int getNumTracks() {
		return numTracks;
	}

	public void setNumTracks(int numTracks) {
		this.numTracks = numTracks;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}
}
