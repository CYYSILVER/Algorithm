import java.lang.String;

public class Demo_ReverseNumber {

	public static void main(String[] args){
        int n = 0;
        while(n<256){
            Integer ans = n*n;
            String str = ans.toString();
            boolean flag = true;
            
            for(int i=0; i<str.length()/2; i++){
                if (str.charAt(i) != str.charAt(str.length()-i-1)){
                    flag = false;
                    break;
                }
            }
            
            if(flag){
                System.out.println(ans);
            }
            n++;
        }
        
    }

}
