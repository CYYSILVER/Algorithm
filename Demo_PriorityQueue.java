import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Demo_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(10);
		pq.push(10);
		pq.push(15);
		pq.push(100);
		pq.push(5);
		pq.push(30);
		pq.push(45);
		pq.push(46);
		pq.push(44);
	
		System.out.println(pq.top());
		
		pq.pop();
		pq.pop();
		System.out.println(pq.top());
		
		
		

	}
	
	
}



class PriorityQueue{
	private int[] arr;
	private int size;
	
	public PriorityQueue(int maxSize) {
		// TODO Auto-generated constructor stub
		
		this.arr = new int[maxSize];
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public int top() {
		return arr[0];
	}
	
	//push操作
	public void push(int element) {
		size++;
		arr[size-1] = element;
		shiftUp(element);
	}
	
	
	//shiftUp操作
	private void shiftUp(int element) {
		int parent = (size-2)/2;
		int child = size-1;
		while(child > 0) {
			if (arr[parent] < element) {
				arr[child] = arr[parent];
				child = parent;
				parent = (parent-1)/2;
			} else {
				break;
			}
		}
		arr[child] = element;
	}
	
	
	//pop操作
	public int pop() {
		int ret = arr[0];
		arr[0] = arr[size-1];
		size--;
		shiftDown(arr[0]);
		return ret;
	}
	
	//shiftDown操作
	private void shiftDown(int element) {
		int parent = 0;
		for(int k=2*0+1; k<size; k=k*2+1) {
			if(k+1 < size && arr[k+1] > arr[k]) {
				k++;
			}
			if(arr[k] > element) {
				arr[parent] = arr[k];
				parent = k;
			}else {
				break;
			}
		}
		arr[parent] = element;
		
	}
	
}