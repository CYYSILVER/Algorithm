
public class FastExp {
	public static void main(String[] args) {
		//�������㷨
		
		System.out.println(fastExp(2,-2));

		
	}
	
	public static float fastExp(int base, int exp) {
		float ans = 1;
		int exponent = Math.abs(exp);
		while(exponent != 0) {
			if((exponent & 1) == 1) {
				ans *= base;
			}
			//��λ
			exponent >>= 1;
			base *= base;
			
		}
		
		return exp>0? ans: 1.0f/ans;
	}
}
