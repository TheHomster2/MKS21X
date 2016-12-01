public class Book{
	private String author;
	private String title;
	private String isbn;

	public Book(String name, String cover, String barcode){
		author = name;
		title = cover;
		isbn = barcode;
	}

	public String getAuthor(){
		return author;
	}

	public String getTitle(){
		return title;
	}

	public String getISBN(){
		return isbn;
	}

	public void setAuthor(String name){
		return author = name;
	}

	public String setTitle(String cover){
		return title = cover;
	}

	public String setISBN(String barcode){
		return isbn = barcode;
	}

	public String toString(){
		return "This book is " + title + "written by " + author + "and the book's ISBN is: " + isbn
	}
}