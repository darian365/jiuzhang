package suanfa.rumen;

public class LowercaseToUppercase {

    /**
     * 145. ��Сдת��
                        ��һ���ַ���Сд��ĸת��Ϊ��д��ĸ
                        
                        ����
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
