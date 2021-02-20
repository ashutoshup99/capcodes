
public class Video extends MediaItem {
	String director;
	String genre;
	int yearReleased;
	public Video(int identificationNumber, String title, int numberOfCopies, int runtime, String director, String genre,
			int yearReleased) {
		super(identificationNumber, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + "]";
	}
}
