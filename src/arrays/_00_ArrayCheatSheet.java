package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = new String[5];
		//2. print the third element in the array
		System.out.println(names[3]);
		//3. set the third element to a different value
		names[3]="Hello";
		//4. print the third element again
		System.out.println(names[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] num = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i<num.length; i++) {
			Random random = new Random();
			num[i]=random.nextInt(100);
		
		}
		int smallest = 100;
		//8. without printing the entire array, print only the smallest number in the array
		for(int x=0; x<num.length; x++) {
			 
if (num[x] < smallest) {
	smallest = num[x];
}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for(int y =0; y<num.length; y++) {
			
		
		System.out.println(num[y]);
		//10. print the largest number in the array.
	}
		int largest = 0;
		//8. without printing the entire array, print only the smallest number in the array
		for(int x=0; x<num.length; x++) {
			 
if (num[x] > largest) {
	largest = num[x];
}
		}
		System.out.println(largest);
		
	}
}
