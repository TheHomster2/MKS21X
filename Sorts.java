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
    return "01.Hom.Anthony"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){ 
	int minimum = data[0];
	int tracker = data[0];
	for (int index = 1; index < data.length - 1; index++){
		if (data[index] < minimum){
			minimum = data[index];
			data[index] = tracker;	
			
			
			
}
 }

}

