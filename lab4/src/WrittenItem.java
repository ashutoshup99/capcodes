public class WrittenItem extends Item {
	private String author;
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies);
		this.author = author;
	}


	public String toString() {
		return "WrittenItem [author=" + author + ", IdentificationNumber=" + getIdentificationNumber()
				+ ", Title=" + getTitle() + ", NumberOfCopies=" + getNumberOfCopies() + "]";
	}
//
//	@Override
//	public void addItem(Item item) {
//		// TODO Auto-generated method stub
//		
//		
//	}	
		
	}

	
	

