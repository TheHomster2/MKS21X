import java.util.Iterator;
import java.util.NoSuchElementException;

public class SuperArrayIterator implements Iterator<String>{
	private SuperArray array;
	private int startpoint;

	public SuperArrayIterator(SuperArray array){
		this.array = array;
		startpoint = 0;
	}

	public boolean hasNext(){}

	public String next(){}

	public void remove(){}
}