
public class ArrayExample {

	public static void main(String []args) {
		int arr[];
		arr = new int[3];
		arr[0] = 32;
		arr[1] = 23;
		arr[2] = 1;
		
		
		int temp1[][] = new int[3][5]; // creating a 2-d array;
		int temp[][] = new int[2][];
		
		temp[0] = new int[21];
		temp[1] = new int[3];    // In java it is possible to create 2d array with different length of each array.
		
		// here temp is a reference variable to a array of int[3]
		// then temp[0] is a reference variable to an array of int[21];  
		// temp.length will give us 2
		// while temp[0].length will give us 21, i.e., the size of the array of the temp[0]
		
		// As the array is an instance based so it contains 0 value by default, its not blank variable.
		
		// int arr[5]; this statement is an error, because arr is a reference variable, 
		// the array is created using the new int[3] method; (dynamically)
		// int arr[] or int [] arr, are both correct to declare the reference variable
		// int arr[] = new int[2]{2, 1} is an error, because we cannot mention size and values at the same time;
		// int arr[] = new int[]{1, 2, 4} this is correct;
	}
}
