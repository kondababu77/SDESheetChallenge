import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        int count = 0;
        for(int num : nums){
            if(set.contains(num) && !set.contains(num - 1)){
                count = 1;
                int curr = num;
                while(set.contains(curr +1)){
                    set.remove(curr);
                    curr++;
                    count++;
                }

                max = count > max ? count : max;
            }
        }
        return max;    
    }
}