package Loop;

import java.util.HashMap;
import java.util.Map.Entry;

public class NonUniqueDuplicate {
	
	static void findNonRepeatingElement(int nums[]) {
	    HashMap<Integer,Integer> hashMap = new HashMap<>();
	    
	    for(int i:nums) {
	        if(hashMap.get(i) == null) hashMap.put(i,1);
	        else hashMap.put(i,hashMap.get(i)+1);
	    }
	    
	    for(Entry<Integer,Integer> entry:hashMap.entrySet()) {
	        if(entry.getValue()==1)
	            System.out.print(entry.getKey()+" ");
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
			System.out.println("Non-Unique numbers are: ");
			findNonRepeatingElement(my_array);

	}

}
