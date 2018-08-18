package suanfa.rumen;

public class StringToInteger {

	public static int stringToInteger(String str) {
		
		if(str == null || "".equals(str)) {
			return Integer.MIN_VALUE;
		}
		
		char[] array = str.trim().toCharArray();
		int signal = 1;
		if(array[0] == '-') {
			signal = -1;
		}
		
		int total = 0;
		for (int i = 0; i <= array.length - 1; i ++) {
			if(array[i] == '-') {
				continue;
			}
			total = total*10 + array[i]-'0';
		}
		
		return total*signal;
	}
	
	public static void main(String[] args) {
		System.out.println(stringToInteger("32623493"));
		System.out.println(stringToInteger("-1"));
	}

}
