/**
 * @author C00261172 Huu Chi Huynh
 * @date 30/11/2021
 * @summary 
 * This program creates a book class and cd class inside of the LoanItem array and calls their methods "calculatePrice"
 */
public class LibraryTest {

	public static void main(String[] args) {
		LoanItem[] items = new LoanItem[2];
		
		items[0] = new Book("Amazing Author", "Apple Book", 300);
		items[1] = new CD("Amazing Author", "Apple Music", 10);        

	    for (LoanItem item : items) {
			System.out.println(item.calculatePrice());
	    }
	}

}
