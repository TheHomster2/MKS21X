abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
	private String callNumber;

	public LibraryBook(String author, String title, String isbn, String number){
		super(author, title, isbn);
		callNumber = number;
	}

	public String getcallNum(){
		return callNumber;
	}

	public String setcallNum(){
		return callNumber = number;
	}

	abstract void checkout(String patron, String due);
	abstract void returned();
	abstract String circulationStatus();
/*
	public String compareTo(LibraryBook num){
		if (num implements LibraryBook){
	LibraryBook other = LibraryBook num;
}
*/

else {return -1;}
	}

	public String toString(){
		return super.toString() + ". The book's call number is " + callNumber;
	}
}