public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot =  -1;
        for(int i=n-1; i>0; i--){
            if(nums[i-1] < nums[i]){
                pivot = i-1;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums,0,n-1);
            return;
        }
        int minIndex = n-1;
        for(int i=pivot+1; i<n; i++){
            if(nums[pivot] < nums[i]){
                minIndex = i;
            }
        }
        swap(nums,pivot,minIndex);
        reverse(nums,pivot+1,n-1);
    }
    void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void reverse(int nums[],int start, int end){
        while(start <= end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}