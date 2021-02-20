
public class JournalPaper extends WrittenItem {
	private int yearPublished;

	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}



	public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author,
			int yearPublished) {
		super(identificationNumber, title, numberOfCopies, author);
		this.yearPublished = yearPublished;
	}
	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", Author=" + getAuthor() + ", IdentificationNumber=" + getIdentificationNumber() + ", Title="
				+ getTitle() + ", NumberOfCopies=" + getNumberOfCopies() + "]";
	}
	
	
}
