import java.util.Iterator;
import java.util.NoSuchElementException;

//Reference: https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
public class SuperArrayIterator implements Iterator<String>{
	private SuperArray array;
	private int startpoint;

	public SuperArrayIterator(SuperArray array){
		this.array = array;
		startpoint = 0;
	}
//Returns true if the iteration has more elements.
	public boolean hasNext(){
		return start < array.size();
	}
//Returns the next element in the iteration.
	public String next(){
		if (hasNext()){
			startpoint += 1;
			return array.get(startpoint - 1);
		}
	}
//Removes from the underlying collection the last element returned by this iterator (optional operation).

	public void remove(){
	throw NoSuchElementException;\
 }
}
