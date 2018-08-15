package suanfa.rumen;

public class Reverse3digitsNumeric {

	/**
	 * 321 -> 1
	 * 32 -> 10 + 2
	 * 3 -> 120 + 3
	 */
    public static int reverseInteger(int number) {
        // write your code here
        if(number < 100 || number >= 1000) {
            return -1;
        }
        
    	int total=0;

        while (number!=0)
        {
            int temp = total*10 + number%10;
            System.out.println("temp :"+temp + "total*10 :"+total*10 + "number%10 :"+number);
            number = number/10;
            System.out.println("number/10 :"+number/10);
            System.out.println("temp/10 :"+temp/10 + "  total :"+total);
            if(temp/10 != total) return 0;
            total = temp;
        }
        return total;
    }
	
	public static void main(String[] args) {
		System.out.println(reverseInteger(321));
	}
}
