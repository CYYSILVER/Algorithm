import java.util.Arrays;

public class Demo_HeapSort {
	

	
	public static void main(String[] args) {
		int[] arr = {2,4,7,9,10,1,3,9,2,4,6,7,9};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void heapSort(int[] arr) {
		
		//×¢ÒâÊÇ>=0
		for(int i=arr.length/2-1; i>=0; i--) {
			ajustHeap(arr,i,arr.length);
		}
		
		for(int i=arr.length-1;i>0;i--) {
			int tmp = arr[i];
			arr[i] = arr[0];
			arr[0] = tmp;
			ajustHeap(arr,0,i);
		}
		
	}
	
	public static void ajustHeap(int[] arr, int parent, int end) {
		int tmp = arr[parent];
		for(int p=parent*2+1; p<end; p=2*p+1) {
			if(p+1<end && arr[p] > arr[p+1]) {
				p++;
			}
			if(tmp > arr[p]) {
				arr[parent] = arr[p];
				parent = p;
			}else {
				break;
			}
		}
		arr[parent] = tmp;
		
	}
	
	
}
