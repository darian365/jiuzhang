package suanfa.rumen;

import java.util.Arrays;

public class Anagram {

    /**
     * 写出一个函数 anagram(s, t) 判断两个字符串是否可以通过改变字母的顺序变成一样的字符串。

                样例
                给出 s = "abcd"，t="dcab"，返回 true.
                给出 s = "ab", t = "ab", 返回 true.
                给出 s = "ab", t = "ac", 返回 false.
                
                挑战
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
