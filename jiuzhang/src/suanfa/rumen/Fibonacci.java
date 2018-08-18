package suanfa.rumen;

public class Fibonacci {
    public static int fibonacci(int n) {
        
    	if(n == 1) {
    		return 0;
    	}
    	
    	if(n == 2) {
    		return 1;
    	}
    	
    	return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static int fibonacci1(int n) {
    	int a = 0;
    	int b = 1;
    	for(int i = 0; i < n - 1; i ++) {
    		int c = a + b;
    		a = b;
    		b = c;
    	}
    	
    	return a;
    }
    
    public static void main(String[] args) {
    	System.out.println(fibonacci1(10));
//    	System.out.println(fibonacci(10));
    }
}
