import java.util.*;

public class Barcode implements Comparable<Barcode>{
// instance variables
// bars goes in order of the what each digit represents from 0-9
   private String _zip;
   private int _checkDigit;
	private static String[] bars = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"}; 
// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(java.lang.String zip) {
	if (zip.length() != 5){ 		
	throw new IllegalArgumentException("Inappropriate zip length!");
	}
	else{
		_zip = zip;
	}
	_checkDigit = checkSum();

}

// postcondition: Creates a copy of a bar code. In Java a clone method builds a second copy of an object and returns it. 
  public Barcode clone(){
	Barcode clone = new Barcode (zip);
	return clone;
}


// postcondition: computes and returns the check sum for _zip
// loop through the string and take the ASCII value to determine the sum... We'd use charAt or substring 
// checkSum() is used to indicate each object's unique sum
  private int checkSum(){
	int sum = 0;
	for (int index = 0; index < _zip.length(); index++){
	if (_zip.charAt(index) < 58 && _zip.charAt(index) > 47){
	sum = sum + _zip.charAt(index) - 48;
}
}
	int checkDigit = sum % 10;
	_checkDigit = checkDigit;
	return checkDigit;
	
	
		

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"   
//add the two bars to the barcode   
  public String toString(){
	String result = "";
	result += _zip;
	result += _checkDigit + "  ";
	for (int digitindex = 0; digitindex < _zip.length(); digitindex++){
		for (int index = 0; index < bars.length; index++){
			if (index == Integer.parseInt(_zip.substring(digitindex, digitindex + 1))){
				result += "|" + bars[index] + "|";
			}
		}
	}
	return result;
}

// postcondition: compares the zip + checkdigit, in numerical order. 
// Don't compare the barcode with the string 
//Compares the barcode with the numerical order. In this case it takes the first five digits excluding the check digit
  public int compareTo(Barcode other){
    return (toString().substring(0,6).compareTo(other.toString().substring(0,6)))
}

	public static String toCode(String zip){
		String result = "|";
		if (zip.length() != 5 || (zip.contains("[0-9]+")) == false){
			throw new IllegalArgumentException("Inappropriate zip length!");
		}
		else{
			for(int digitindex = 0; digitindex < zip.length; digitindex++){
				for (int index = 0; index < bars.length; index++){
					if (index == Integer.parseInt(zip.substring(digitindex, digitindex + 1))){
						result += bars[index] + "|";
			}
		}
	}
	return result;
}
}

	public static String toZip(String code){
		String result = "";

	}


/*What data should a Barcode object store? The Barcode should store the String zipcode
What methods does a Barcode need to be minimally useful? (Public Methods) Constructor that takes the zipcode, toString, compareTo
What methods could be useful for other classes? (static methods) -> http://stackoverflow.com/questions/2671496/java-when-to-use-static-methods
toZip(String code)
toCode(String zip)

