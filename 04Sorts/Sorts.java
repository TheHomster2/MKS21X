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
    int minimum = data[index];
    for (int index = 0; index < data.length; index++){
       for (int tracker = index + 1; tracker < data.length; tracker++){
	if (data[tracker] < minimum){
            minimum = data[tracker];
            }
}
	if (minimum < data [tracker]){
		  
           
           
           
}
 }

}
