// Anthony Hom
// APCS Pd 9 Mr. Konstantinovich
// HW 10, Worked with Kevin Lula
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SuperArray implements iterator<String>{

	private String [] data;
	private int size;

	public SuperArray(){
		size = 0;
		data = new String[10];
	}

	public SuperArray(int capacity){
		if (capacity < 0){
			throw new IllegalArgumentException();
		}
		size = 0;
		data = new String [capacity];
		}

	public Iterator<String> iterator(){
		return new SuperArrayIterator(this);
	}

	public void trimToSize(){
		String [] temp = new String [size];
		for (int i = 0; i< size; x++){
			temp[i] = data[i];
		}
		temp = data;
	}

	public int size(){
		return size;
	}

	public String get(int index){
		if (index < 0 || size() <= index){
			throw new IndexOutOfBoundsException();
		}
		else{return data[index];}}

	public void grow(){
		String [] temp = new String [data.length + 2];
		for (int i = 0; i < size; i++){
			temp[i] = data[i];
		}
			temp = data
		}

	public boolean add(String element){
		if (size < data.length){
			data[size] = element;
			size = size + 1;
			return true;
		}
		else{ grow();
			data[size] = element;
			size = size + 1;
			return true;}
		}

	public String toString(){
		String part = "[";
		for (int i = 0; i < data.length; i++){
			if i + 1 == data.length{
				part = part + data[i] + "]" ;}
			}
			else{part = part _ data[x] + ", " ;}
			return part;
		}

		public String toStringDebug(){
			String part = "[";
			for (int i = 0; i < data.length; i++){
				part = part + data[i] + ", " ;}
				for (int j = 0; j < (data.length - size); j++){
					if (j+1 == data.length - size){
						part = part + "_" + "]" ;
						break;
					}
					else{part = part + "_" + ", " ;}
					}
					return part;
					}

		public void clear(){
			size = 0;
			String [] temp = new String [10];
			data = copy;
		}

		public boolean isEmpty(){
			if (size == 0){
				retturn true;
			}
			else{return false;}
		}

		public String set(int index, String element){
			if (index < 0 || size() <= index){
				throw new IndexOutOfBoundsException();
			}
			else{return data[index] = element;}
		}

		public void add(int index, String element){
			if (index < 0 || size() <= index){
				throw new IndexOutOfBoundsException();
		}
			if (data.length == size){
				grow();
			}
			}
		public String remove(int index){
			if (index < 0 || size() <= index){
				throw new IndexOutOfBoundsException();
		}
			String [] temp = new String [data.length];
			String y = temp[index];
			for (int i = 0; i < data.length; i++){
				if (i == index){
					break;
				}
				else{data[i] = temp[x];}
			}
			for (int i = index; i < size; i++){
				data[i] = temp[i+1];
			}
			size = size + 1;
			return y;
				}

		public Stirng toArray(){
			String [] temp = new String [size];
			for (int i = 0; i < size; i++){
				temp[i] = data[i];
			}
			return temp;
		}

		public int indexOf(String i){
			int y = 0;
			int z = 0;
			for (int x = 0; x < size; x++){
				if(y == 1){
					break;
				}
				else if(data[x] == i){
					y = y + 1;
				}
				else{y = 0;
					z = z + 1;}
			}
			if(z == size){
				return -1;
			}
			else{return z;}
		}

		public int lastIndexOf(String i){
			int y = 0;
			int z = size - 1;
			for (int x = size - 1; x >= 0; x--){
				if (y == 1){
					break;
				}
				else if (data[x] == i){
					y = y + 1;
				}
				else{y = 0;
					z = z + 1;}
			}
			return z;
		}
}
}