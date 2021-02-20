package day12;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class TestBook {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		long count = books.stream().count();
		System.out.println("total count of books " + count);
		long countBooks = books
		  .stream()
		  .filter(c -> c.getRating() > 4.7)
		  .count();
		System.out.println("total count of books with > 4.7 is " + countBooks );		
	// Imperative
//		int count = 0;
//		for(Book b: books) {
//			System.out.println(b);
//			count ++;
//			if(count>2) break;
//		}
		
//		System.out.println( " -----    Declarative syntax   ------ ");
//		// Declarative
		System.out.println("Check if all books match the criteria: ");
		boolean allMatch = books.stream()
		.allMatch((b) -> b.getRating()> 1.1) ;
		System.out.println("Any books matching rating > 1.1 is " + allMatch);
		System.out.println("Print title of books -------");
		System.out.println("\n\n" +"Print all books conatining title \'Java 11\': " );
		books.stream().map(b -> {
			return b.getTitle();
		})
		.forEach((b) -> System.out.print(b +" "));
		books.stream().map(str -> str.getTitle().contains("Java11")).forEach(System.out::println); 
        System.out.println("\n\n" +"Sort books by rating: ");
        books.stream().sorted((book1, book2) -> book1.getRating().compareTo(book2.getRating())).forEach((b) -> System.out.println(b));
		Optional<Book> bookFound = books.stream().min((book1, book2) -> book1.getRating().compareTo(book2.getRating()));
		if(bookFound.isPresent()) {
			System.out.println(bookFound);	
		} else {
			System.out.println("No books found");
		}
		System.out.println("\n\n" +"Find the maximum rating value: "
				+ books.stream().max((book1, book2) -> book1.getRating().compareTo(book2.getRating()))
					.map(b -> {
						return b.getRating();
						}).get());
		// Advanced collectors--- 
				//1. Joining
		System.out.println();			
		System.out.println("All books title----------");
		String booksnames = books.stream()
			      .map(Book::getTitle)
			      .collect(Collectors.joining(", "));
		System.out.println(booksnames);
		DoubleSummaryStatistics stats = books.stream()
			      .collect(Collectors.summarizingDouble(Book::getPrice));
		System.out.println("Summary of prices in books " + stats);
		System.out.println("Minimum price of book is " + stats.getMin());

	
	}
}
		
//		Optional<Book> bookFound = books.stream()
//		.filter((b) -> (b).getTitle()=="Java 11")
//		bookFound.stream().forEach((b)->System.out.println(b));
////		
//		if(bookFound.isPresent()) {
//			System.out.println(bookFound.get());
//		}
//		else {
//			System.out.println("No matching book Found!!");
//		}
