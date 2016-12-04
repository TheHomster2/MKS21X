public class CirculatingBook extends LibraryBook{
	private String currentHolder;
	private String dueDate;

	public CirculatingBook(String author, String title, String isbn, String number){
		super(author, title, isbn, number);
		currentHolder = null;
		dueDate = null;
	}

	public String getcurrentHolder(){
		return currentHolder;
	}

	public String getdueDate(){
		return dueDate;
	}

	public void setcurrentHolder(String newHolder){
		currentHolder = newHolder;
	}

	public void setdueDate(String newDate){
		dueDate = newDate;
	}

	public void checkout(String patron, String due){
		setcurrentHolder(patron);
		setdueDate(due);
	}

	public void returned(){
		currentHolder = null;
		dueDate = null;
	}

	public String circulationStatus(){
		if (currentHolder == null && dueDate == null){
			return "Book available on shelves";
		}
		else {return "Checked out by: " + currentHolder + " , " + dueDate;}
	}

	public String toString(){
		if (currentHolder == null && dueDate == null){
			return super.toString();
		}
		else{return super.toString() + " -- " + currentHolder + " , " + dueDate;}
	}
}