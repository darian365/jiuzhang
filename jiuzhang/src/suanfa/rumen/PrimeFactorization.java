package suanfa.rumen;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    /**
     * ��һ�������ֽ�Ϊ����������֮�˻�
                        ����
                        ���� 10, ���� [2, 5].
                        
                        ���� 660, ���� [2, 2, 3, 5, 11].
                        
                        ע������
                        ����Ҫ��С�������������ӡ�
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
