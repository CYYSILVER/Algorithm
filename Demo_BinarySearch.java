
public class Demo_BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,4,8,10,20,128};
		System.out.println(binarySearch(arr,8));
		
	}
	
	//二分查找
	public static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length;
		int index = -1;
		while(left < right) {
			int middle = (left+right)/2;
			if(arr[middle] == key) {
				index = middle;
				break;
			}else if(arr[middle] > key) {
				right = middle;
			}else {
				left = middle + 1;
			}
			
			
		}
		return index;
	}
}
