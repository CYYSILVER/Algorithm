import java.util.HashMap;

public class Demo_FirstAppearingOnce {
	private static String string;
	private HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	public void Insert(char ch) {
		string += ch;
		if(!map.containsKey(ch)) {
			map.put(ch,1);
		}else {
			map.put(ch,map.get(ch)+1);
		}

	}
	
	public char FirstAppearingOnce() {
		for(int i=0; i<string.length(); i++) {
			if(map.get(string.charAt(i))==1) {
				return string.charAt(i);
			}
		}
		
		return '#';
		
		
	}
}
