package suanfa.rumen;

public class LowercaseToUppercase {

    /**
     * 145. 大小写转换
                        将一个字符由小写字母转换为大写字母
                        
                        样例
        a -> A
        
        b -> B
     */
	public static char covert(char a) {
		return (char)(a - 32);
	}
	
	public static void main(String[] args) {
		System.out.println(covert('b'));
		System.out.println(covert('z'));
		System.out.println(covert('w'));
	}
}
