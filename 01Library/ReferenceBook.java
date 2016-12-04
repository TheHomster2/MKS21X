public class ReferenceBook extends LibraryBook{
	private String stringcollection;

	public ReferenceBook(String author, String title, String isbn, String number, String collection){
		super(author, title, isbn, number, collection);
		collection = collect;
	}

	public String getcollection(){
		return collection;
	}

	public void setcollection(String collect){
		collection = collect;
	}

	public void checkout(String patron, String due){
		System.out.println ("Cannot checkout a reference book");
	}

	public void returned(){
		System.out.println("Reference book could not have been checked out -- return impossible");
	}

	public String circulationStatus(){
		return "Non-circulating reference book";
	}

	public String toString(){
		super.toString() + " This book is found at: " + collection;
	}
}