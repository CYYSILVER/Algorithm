
public class Demo_KmpAlgorithm {
	public static void main(String[] args) {
		String str = "abcdefgabcdefghabcdefgabcdefghiabcdefghijkabcdefghijkl";
		String pattern = "abcdefghijkl";
		long start = System.currentTimeMillis();
		System.out.println(kmp(str,pattern));
		System.out.println(System.currentTimeMillis() - start);
		
		start = System.currentTimeMillis();
		System.out.println(str.indexOf(pattern));
		System.out.println(System.currentTimeMillis() - start);
	}
	
	static int kmp(String str, String pattern) {
		if(pattern.length() == 0) return -1;
		int[] next = fail(pattern);
		int i=0;
		int j=0;
		for(; i<str.length()&&j<pattern.length();) {
			if(str.charAt(i) == pattern.charAt(j)) {
				i++;
				j++;
			} else if(j==0) {
				i++;
			} else {
				j = next[j-1];
			}
		}
		if(j==pattern.length()) {
			return i-pattern.length();
		}else {
			return -1;
		}
		
	}
	
	static int[] fail(String pattern) {
		int[] next  = new int[pattern.length()];
		next[0] = 0;
		int i=0;
		int j=1;
		while(j<pattern.length()) {
			if(pattern.charAt(j) == pattern.charAt(i)) {
				next[j++] = ++i;
			} else if (i==0) {
				next[j++] = 0;
			} else {
				i = next[i-1];
			}
		}

		
		return next;
		
		
	}
	
	
}
