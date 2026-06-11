import java.util.*;
public class LongestSubarrayWithSumK {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        map.put(0,-1);
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum-k)){
                max = Math.max(max, i - map.get(sum-k) );
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
    }
}
