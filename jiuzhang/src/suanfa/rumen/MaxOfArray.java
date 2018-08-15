package suanfa.rumen;

public class MaxOfArray {

	
    public static float maxOfArray(float[] a) {
        if(a.length <= 0) {
        	return Float.MIN_VALUE;
        }
        
        float maxVal = a[0];
        for(float val : a) {
        	maxVal = Math.max(val, maxVal);
        }
    	
    	return maxVal;
    }
    
    public static float maxOfArray1(float[] a) {
        if(a.length <= 0) {
        	return Float.MIN_VALUE;
        }
        
        float maxVal = a[0];
        for(float val : a) {
        	if(maxVal < val) {
        		maxVal = val;
        	}
        }
    	
    	return maxVal;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] a = new float[] {1.0f, 2.1f, -3.3f};
		System.out.println(maxOfArray(a));
	}

}
