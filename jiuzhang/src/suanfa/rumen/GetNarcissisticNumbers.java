package suanfa.rumen;

import java.util.ArrayList;
import java.util.List;

public class GetNarcissisticNumbers {

    /**
     * 147. ˮ�ɻ���
                ˮ�ɻ����Ķ����ǣ������������ÿһλ�������ݴ�֮�� ��ά���ٿƵĶ���
                
                ����һ��3λ��ʮ��������153����һ��ˮ�ɻ�������Ϊ 153 = 13 + 53 + 33��
                
                ��һ��4λ��ʮ������1634Ҳ��һ��ˮ�ɻ�������Ϊ 1634 = 14 + 64 + 34 + 44��
                
                ����n���ҵ����е�nλʮ����ˮ�ɻ�����
                
                ����
                ���� n = 1, ����ˮ�ɻ���Ϊ��[0,1,2,3,4,5,6,7,8,9]��
                ������ n = 2, ��û��2λ��ˮ�ɻ��������� []��
                
                ע������
                �������ΪnС��8��
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
        
        for(int i = (int) Math.pow(10, 2); i <= Math.pow(10, n+1) - 1; i++) {
            if(isTheNumber(i, n)){
                result.add(i);
            }
        }
        
        return result;
    }
    
    public static boolean isTheNumber(int number, int n) {
        int total = 0;
        while(number != 0) {
            int temp =  number%10;
            number = number/10;
            total += Math.pow(temp, n);
        }
        return number == total;
    }
    
    public static void main(String[] args) {
        System.out.println(getNarcissisticNumbers(3).contains(153));
    }

}
