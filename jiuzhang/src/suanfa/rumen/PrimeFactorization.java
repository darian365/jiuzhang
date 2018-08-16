package suanfa.rumen;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    /**
     * 将一个整数分解为若干质因数之乘积
                        样例
                        给出 10, 返回 [2, 5].
                        
                        给出 660, 返回 [2, 2, 3, 5, 11].
                        
                        注意事项
                        你需要从小到大排列质因子。
     */
    public static List<Integer> primeFactorization(int num) {
        
        List<Integer> result = new ArrayList<>();
        int start = 2;
        while(num%2 == 0) {
            num = num / start;
            result.add(start);
        }
        
        for(start = 3; start*start <= num; start += 2) {
            while(num % start == 0) {
                num = num/ start;
                result.add(start);
            }
        }
                
        if(num != 1) {
            result.add(num);
        }
        return result;
    }
    
    
    public static void main(String[] args) {

    }

}
