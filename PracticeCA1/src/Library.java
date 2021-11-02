/**
 * @author C00261172 Huu Chi Huynh
 * @date 02/11/2021
 * @summary Creates 3 books with the book name, author and genre.
 * Each book is initalised using the book name, author and genre. 
 * Each book an ISBN is created automatically.
 * 
 * The library class is testing the methods inside of the book class
 */
public class Library {
	static public void main(String args[])
	{
		Book book1 = new Book("Among", "Inner", "Steafh");
		System.out.println(book1);
		System.out.println("There are " + Book.getNumberOfBooks() + " Book(s) in the library");
		
		Book book2 = new Book("Mine", "MOj", "Sandbox");
		System.out.println("Borrowed At: " + book2.getBorrowedDate()); // Check borrowed date function
		System.out.println(book2);
		System.out.println("There are " + Book.getNumberOfBooks() + " Book(s) in the library");
		
		Book book3 = new Book("Rob", "Lox", "Platform");
		book3.Borrow();
		System.out.println(book3);
		System.out.println("There are " + Book.getNumberOfBooks() + " Book(s) in the library");
		
	}
}
