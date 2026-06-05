import java.util.*;

public class PrintAllPermutation{
    public void generatePermutations(int nums[],List<List<Integer>> allPermutations ){
        backtrack(nums,allPermutations, new ArrayList<>(),nums.length);
    }
    void backtrack(int nums[],List<List<Integer>> allPermutations,List<Integer> temp,int n){
        if(temp.size() == n){
            allPermutations.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<n; i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(nums, allPermutations, temp, n);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String args[]){
        PrintAllPermutation obj = new PrintAllPermutation();
        int nums[] = {1,2,3};
        List<List<Integer>> allPermutations = new ArrayList<>();
        obj.generatePermutations(nums,allPermutations);
        System.out.print(allPermutations);
    }
}