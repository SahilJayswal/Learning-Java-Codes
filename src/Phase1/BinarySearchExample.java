package Phase1;

public class BinarySearchExample {

	public static int binarySearch(int[] array, int target ) {
		int left=0;
		int right = array.length -1;
		
		while(left<=right) {
			int middle = (left+right)/2;
			if(array[middle] == target) {
				return middle;
			}
			if(target < array[middle]) {
				right = middle - 1;
			}
			if(target > array[middle]) {
				right = middle + 1;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] number = {5,10,12,15,10};
		int index = binarySearch(number, 20); 
		System.out.println(index != -1 ? "Element found: " +index : "Element not found");
	}

}
