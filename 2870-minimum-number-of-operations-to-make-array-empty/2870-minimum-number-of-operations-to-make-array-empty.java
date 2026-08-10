import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int num : nums) {
            // Put the element in the map and increment its count by 1
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int t = entry.getValue();
            
            if (t == 1)
                return -1;

            count += t / 3; 
            if (t % 3 != 0)
                count++;
        }
        
        return count;
    }
}

