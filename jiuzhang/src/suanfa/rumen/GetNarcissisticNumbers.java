package suanfa.rumen;

import java.util.ArrayList;
import java.util.List;

public class GetNarcissisticNumbers {

    /**
     * 147. 水仙花数
                水仙花数的定义是，这个数等于他每一位上数的幂次之和 见维基百科的定义
                
                比如一个3位的十进制整数153就是一个水仙花数。因为 153 = 13 + 53 + 33。
                
                而一个4位的十进制数1634也是一个水仙花数，因为 1634 = 14 + 64 + 34 + 44。
                
                给出n，找到所有的n位十进制水仙花数。
                
                样例
                比如 n = 1, 所有水仙花数为：[0,1,2,3,4,5,6,7,8,9]。
                而对于 n = 2, 则没有2位的水仙花数，返回 []。
                
                注意事项
                你可以认为n小于8。
     */
    public static List<Integer> getNarcissisticNumbers(int n) {
        // write your code here
        if(n <= 0 || n == 2) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        if(n == 1) {
            for(int i = 0; i <= 9; i++) {
                result.add(i);
            }
            return result;
        }
        
        for(int i = (int) Math.pow(10, n-1); i <= (int)Math.pow(10, n) - 1; i++) {
        	int power = getPowerValue(i);
            if(isTheNumber(i, power)){
                result.add(i);
            }
        }
        
        return result;
    }
    public static int getPowerValue(int number) {
        int count = 0;
        
        while(number != 0) {
        	count++;
            number = number/10;
        }
        
        return count;
    }
    public static boolean isTheNumber(int number, int n) {
        int total = 0;
        int originalNumber = number;
        
        while(number != 0) {
            int temp =  number%10;
            number = number/10;
            total += Math.pow(temp, n);
        }
        if(originalNumber == total) {
        	System.out.println("水仙花数字:" + originalNumber + ":" + total);
        }
        
        return originalNumber == total;
    }
    
    public static void main(String[] args) {
       getNarcissisticNumbers(4);
//       System.out.println((int)Math.pow(10, 5));
//       System.out.println((int)Math.pow(10, 5)-1);
       
    }

}
