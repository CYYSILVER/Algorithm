import java.util.Arrays;

public class Demo_MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[] {10,2,3,4,7,7,10};
		mergeSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] arr, int start, int end) {
		int[] tmp = new int[end-start];
		mergeSortSub(arr, start, end, tmp);
	}
	
	
	public static void mergeSortSub(int[] arr, int start, int end, int[] tmp) {
		if(start + 1 >= end) {
			return ;
		}
		int mid = (end+start)/2;
		mergeSortSub(arr, mid, end, tmp);
		mergeSortSub(arr, start, mid, tmp);
		int i=start;
		int j=mid;
		int k =0;
		while(i<mid && j<end) {
			if(arr[i]<=arr[j]) {
				tmp[k++] = arr[i++];
			}
			else {
				tmp[k++] = arr[j++];
			}
		}
		while(i<mid) {
			tmp[k++] = arr[i++];
		}
		while(j<end) {
			tmp[k++] = arr[j++];
		}
		k=0;
		while(start < end) {
			arr[start++] = tmp[k++];
		}
	}
}
