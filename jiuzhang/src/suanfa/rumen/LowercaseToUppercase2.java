package suanfa.rumen;

public class LowercaseToUppercase2 {

    /**
     * 146. ��Сдת�� II
                            ��һ���ַ����е�Сд��ĸת��Ϊ��д��ĸ����������������ĸ���ַ���
                            
                            ����
                            ���� "abc", ���� "ABC".
                            
                            ���� "aBc", ���� "ABC".
                            
                            ���� "abC12", ���� "ABC12".
     * 
     */
    public static String lowercaseToUppercase2(String str) {
        if(str == null || "".equals(str)) {
            return "";
        }
        
        StringBuilder sbBuilder = new StringBuilder();
        for(char arr : str.toCharArray()) {
            if(arr >= 97 && arr <= 122) {
                arr = (char)(arr-32);
            }
            sbBuilder.append(arr);
        }
        
        return sbBuilder.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(lowercaseToUppercase2("abc"));
        System.out.println(lowercaseToUppercase2("abC"));
        System.out.println(lowercaseToUppercase2("aBc12"));
    }

}
