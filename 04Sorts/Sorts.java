/*
[   64 25 12 22 11] // this is the initial, starting state of the array
[11    25 12 22 64] // sorted sublist = {11}
[11 12    25 22 64] // sorted sublist = {11, 12}
[11 12 22    25 64] // sorted sublist = {11, 12, 22}
[11 12 22 25    64] // sorted sublist = {11, 12, 22, 25}
[11 12 22 25 64   ] // sorted sublist = {11, 12, 22, 25, 64}
*/

public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME
  */
  public static String name(){
    return "09.Hom.Anthony";
  }

  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
    for (int index = 0; index < data.length; index++){
        int minimum = data[index];
        int minimumIndex = index;
       for (int tracker = index + 1; tracker < data.length; tracker++){
	       if (data[tracker] < minimum){
          minimum = data[tracker];
          minimumIndex = tracker;
            }
          }
        }
      }


  public static void insertionSort(int[] data){
    for (int index = 1; index < data.length; index++){
        int temp = data[index];
        int other;
	      for (other = index; other >= 0 && temp < data[other -1]; other--){
          data[other] = data[other - 1];
        }
        data[other] = temp;
    }
  }

 public static void bubbleSort(int[] data){
  boolean swapped = true; 
	for (int index = data.length; index > 0 && swapped; index--){
    swapped = false;
		for(int index2 = 1; index2 < (data.length); index2++){
		if (data[index2 - 1] > data[index2]){
			int temp = data[index2 - 1];
			data [index2 - 1] = data[index2];
			data [index2] = temp;	
      swapped = true;
      }
    }
  }
}


 public static String array(int[] data){
  String result = "{";
  for (int index = 0; index < data.length; index++){
    result += data[index] + ", ";
  }
  return result.substring(0, result.length() - 1) + "}";
 }
}
/*
endtime = System.currentTimeMillis();
*/
