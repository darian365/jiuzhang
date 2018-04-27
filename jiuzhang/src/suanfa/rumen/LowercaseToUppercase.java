package suanfa.rumen;

public class LowercaseToUppercase {

	public static char covert(char a) {
		if(a < 97 && a > 122) {
			return '0';
		}
		
		return (char)(a - 32);
	}
	
	public static void main(String[] args) {
		System.out.println(covert('b'));
		System.out.println(covert('z'));
		System.out.println(covert('w'));
	}
}
