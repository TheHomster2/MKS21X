abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
	private String callNumber;

	public LibraryBook(String author, String title, String isbn, String number){
		super(author, title, isbn);
		callNumber = number;
	}

	public String getcallNum(){
		return callNumber;
	}

	public void setcallNum(){
		callNumber = number;
	}
	
	public abstract void checkout(String patron, String due);
	public abstract void returned();
	public abstract String circulationStatus();

// Define the compareTo method
	public int compareTo(LibraryBook book){
		if (callNumber().compareTo(book.getcallNum()) < 0){
			return -1;
		}
		else if (callNumber().compareTo(book.getcallNum()) > 0){
			return 1;
		}
		else{return 0;}
}

	public String toString(){
		return super.toString() + ". The book's call number is " + callNumber;
	}
}