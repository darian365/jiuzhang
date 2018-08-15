package suanfa.rumen;

import java.util.Arrays;

public class Anagram {

    /**
     * д��һ������ anagram(s, t) �ж������ַ����Ƿ����ͨ���ı���ĸ��˳����һ�����ַ�����

                ����
                ���� s = "abcd"��t="dcab"������ true.
                ���� s = "ab", t = "ab", ���� true.
                ���� s = "ab", t = "ac", ���� false.
                
                ��ս
                O(n) time, O(1) extra space
     */
    public static boolean anagram(String s, String t) {
        // write your code here
        if(s == null || "".equals(s) || t == null || "".equals(t)) {
            return false;
        }
        
        s = s.replaceAll(" ","");
        t = t.replaceAll(" ","");
        
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        
        return Arrays.equals(arrS, arrT);
    }
    
    public static void main(String[] args) {
        System.out.println(anagram("abcd", "dca b"));
        System.out.println(anagram("ab", "ab"));
        System.out.println(anagram("ab", "ac"));
    }

}
