
public class CD extends MediaItem {
	private String artist; 
	private String genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public CD(int identificationNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
		super(identificationNumber, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", getRuntime()=" + getRuntime()
				+ ", getIdentificationNumber()=" + getIdentificationNumber() + ", getTitle()=" + getTitle()
				+ ", getNumberOfCopies()=" + getNumberOfCopies() + "]";
	}

}
