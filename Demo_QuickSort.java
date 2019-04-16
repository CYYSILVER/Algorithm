import java.util.Arrays;

public class Demo_QuickSort {
	public static void main(String[] args) {
		int[] arr = new int[25];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) (Math.random()*100);
		}
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left >= right) return;
		int index = partition3(arr,left,right);
		quickSort(arr,left,index-1);
		quickSort(arr,index+1,right);
	}
	
	
	public static int partition1(int[] arr, int left, int right) {
		int index = left;
		int key = arr[left];
		while(left < right) {
			while(left < right && arr[right] >= key) {
				right--;
			}
			while(left < right && arr[left] <= key) {
				left++;
			}
			swap(arr,left,right);
		}
		swap(arr,index,left);
//		System.out.println(left==right);
		
		
		return right;
	}
	
	public static int partition2(int[] arr, int left, int right) {
		int key = arr[right];
		while(left < right) {
			while(left <right && arr[left]<=key) {
				left++;
			}
			arr[right] = arr[left];
			while(left <right && arr[right]>=key) {
				right--;
			}
			arr[left]=arr[right];
		}
		arr[right] = key;
		return right;
	}
	
	public static int partition3(int[] arr, int left, int right) {
		int key = arr[right];
		int cur = left;
		int pre = left-1;
		while(cur < right) {
			
			
			while(arr[cur]<key && ++pre!=cur) {
				swap(arr,cur,pre);		
			}
			cur++;
			
		}
		swap(arr,cur,++pre);
		
		return pre;
	}
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
