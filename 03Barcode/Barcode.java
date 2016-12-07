public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
	if (zip.length() != 5 || zip.isdigit() != true){ //checks whether the zip string is a digit or not 			
	throw new RunTimeException();
	}
}

// postcondition: Creates a copy of a bar code. In Java a clone method builds a second copy of an object and returns it. 
  public Barcode clone(){
	Barcode clone = new String _zip;
	return clone;
}


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
	int sum = Integer.parseint(zip[0]) + Integer.parseint(zip[1]) + Integer.parseint(zip[2]) + Integer.parseint(zip[3]) + Integer.parseint(zip[4])	
}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}


