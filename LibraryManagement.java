package week2.day1;

public class LibraryManagement {
	
	public static void main(String[] args) {
		Library options = new Library();
		String bookTitle = options.addBook("Book added successfully");
		System.out.println(bookTitle);
		options.issueBook();
	}

}
