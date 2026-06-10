import java.util.*;

public class ReversePairs {
    int merge(int nums[], int low , int mid , int high){
        List<Integer> temp = new ArrayList<>();
        int count = 0;
        
        int j=mid+1;
        for(int i=low; i<=mid; i++){
            while( j<= high && nums[i] > 2L * nums[j]) j++;
            count += j - (mid+1);
        }

        int i = low;
        j = mid+1;

        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                temp.add(nums[i]);
                i++;
            }else{
                temp.add(nums[j]);
                j++;
            }
        }
        while(i <= mid){
            temp.add(nums[i]);
            i++;
        }
        while(j <= high){
            temp.add(nums[j]);
            j++;
        }

        int k =0;
        for(i = low; i<=high; i++){
            nums[i] = temp.get(k);
            k++;
        }

        return count;
    }
    int mergeSort(int nums[],int low , int high){
        if(low >= high) return 0;

        int count =0;
        int mid = low + ( high - low )/2;

        count = mergeSort(nums, low , mid) +
                mergeSort(nums , mid+1, high) +
                merge(nums, low , mid , high);
        return count;        
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0 , nums.length-1);    
    }
}