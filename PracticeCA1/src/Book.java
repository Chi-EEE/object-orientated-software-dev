import java.util.Calendar;
import java.util.Date;
public class Book {
	private String bookName;
	private String author;
	private String genre;
	private Date borrowedDate;
	private boolean status;
	
	private int ISBN;
	static private int numberOfBooks = 0;
	
	// One constructor for book because you can't create an empty book
	public Book(String bookName, String author, String genre)
	{
		numberOfBooks++;
		ISBN = numberOfBooks;
		setBookName(bookName);
		setAuthor(author);
		setGenre(genre);
	}
	
	// Set Methods
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	public void Borrow()
	{
		Calendar cal = Calendar.getInstance();
		borrowedDate = cal.getTime();
		status = true;
	}
	
	// Get Methods
	public String getBookName()
	{
		return bookName;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getGenre()
	{
		return genre;
	}
	public int getISBN()
	{
		return ISBN;
	}
	public String getStatus()
	{
		return status ? "B" : "A";
	}
	public Date getBorrowedDate()
	{
		return borrowedDate;
	}
	
	static public int getNumberOfBooks()
	{
		return numberOfBooks;
	}
	// Convert Book to a String
	public String toString()
	{
		String string ="Book Name: " + getBookName() + ", Author: " + getAuthor() + ", Genre: " + getGenre() + ", ISBN: " + getISBN() + ", Status: " + getStatus();
		if (status)
		{
			string += ", Borrowed Date: " + getBorrowedDate();
		}
		return string;
	}
}
