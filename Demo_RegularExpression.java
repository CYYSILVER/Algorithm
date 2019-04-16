import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo_RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String patternExpression = "(\\d)([+-\\\\*](\\(?\\d+)\\)?)*";
		String input = "3+(2+5)*6";
		Pattern pattern = Pattern.compile(patternExpression);
		Matcher m = pattern.matcher(input);
		System.out.println(Pattern.matches(patternExpression, input));
		
		System.out.println(m.matches());
		System.out.println();
		
		
			
		
		
	}

}
