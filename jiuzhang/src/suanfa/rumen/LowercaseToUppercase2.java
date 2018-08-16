package suanfa.rumen;

public class LowercaseToUppercase2 {

    /**
     * 146. 大小写转换 II
                            将一个字符串中的小写字母转换为大写字母。忽略其他不是字母的字符。
                            
                            样例
                            给出 "abc", 返回 "ABC".
                            
                            给出 "aBc", 返回 "ABC".
                            
                            给出 "abC12", 返回 "ABC12".
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
