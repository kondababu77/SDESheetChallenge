import java.util.*;

public class CountInversionOfArray {
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length-1);   
    }
    
    static int mergeSort(int arr[], int low , int high){
        int count =0;
        if(low >= high) return 0;
        
        int mid = low + (high-low)/2;
        
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1,high);
        count += merge(arr,low,mid,high);
        
        return count;
    }
    
    static int merge(int arr[], int low, int mid , int high){
        List<Integer> temp = new ArrayList<>();
        int i = low;
        int j = mid+1;
        int count = 0;
        
        while( i<= mid && j<=high){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                count += mid - i +1 ;
                j++;
            }
        }
        while( i<= mid){
            temp.add(arr[i]);
            i++; 
        }
        while( j<=high){
            temp.add(arr[j]);
            j++;
        }
        int k=0;
        for(i = low; i<=high; i++){
          arr[i] = temp.get(k);
          k++;
        }
        return count;
    }
}