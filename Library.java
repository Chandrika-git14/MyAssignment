package week2.day1;

public class Library {
	
	public String addBook(String bookTitle) {
		bookTitle = "Book added successfully";
		return bookTitle; 
	}
	
	public void issueBook() {
System.out.println("Book issued successfully");		
	}
	
	public static void main(String[] args) {
		Library bookDetails = new Library();
		String bookTitle = bookDetails.addBook("Book added successfully");
		System.out.println(bookTitle);
		bookDetails.issueBook();
	}

}
