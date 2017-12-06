package week4;

public class j_71206_12 {
	static long factorial(int n) {
		if(n<=0 || n>20) return -1;
		if(n<=1) return 1;
		return n* factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 21;
		long result = 0;
		for(int i=1; i<=n; i++) {
			result = factorial(i);
			
			if(result == -1) {
				System.out.println("유효하지 않음");
				break;
			}
			System.out.printf("%2d!=%20d%n",  i, result);
		}
	}

}
