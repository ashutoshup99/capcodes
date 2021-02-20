
public class Book extends WrittenItem {

	public Book(int identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [Author=" + getAuthor() + ", IdentificationNumber=" + getIdentificationNumber()
				+ ", Title=" + getTitle() + ", NumberOfCopies=" + getNumberOfCopies() + "]";
	}

}
