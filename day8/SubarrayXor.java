import java.util.HashMap;
public class SubarrayXor {
    public long subarrayXor(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int xor = 0;
        for(int num : arr){
            xor = xor^num;
            if(map.containsKey(xor^k)){
                count += map.get(xor^k);
            }
            map.put(xor , map.getOrDefault(xor , 0) + 1);
        }
        return count;
    }
}