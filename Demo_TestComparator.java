import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Demo_TestComparator {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(4);
		arr.add(3);
		System.out.println(arr.toString());
		arr.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 > o2? 1:-1;
			}
			
		});
		
		System.out.println(arr.toString());
	}
}
