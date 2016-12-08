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
	Barcode clone = new Barcode (zip);
	return clone;
}


// postcondition: computes and returns the check sum for _zip
// loop through the string and take the ASCII value to determine the sum... We'd use charAt or substring 
  private int checkSum(){
	for (int index = 0; index < zip; index++){
		

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}


