package Day1;
import java.util.*;
public class PascalTriangle {
    List<Integer> generateRow(int n){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        long p = 1;
        for(int i=1; i<=n; i++){
            p = p *(n-i+1)/i;
            result.add((int)p);
        }
        return result;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
           ans.add(generateRow(i)); 
        }
        return ans;
    }
}
class BruteForce {
    int nCr(int n, int r){
        r = Math.min(r, n-r);
        int result = 1;
        for(int i=1; i<=r; i++){
            result = result * (n - i + 1)/i;
        }
        return result;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> sub = new ArrayList<>();
            for(int j=0; j<=i; j++){
                sub.add(nCr(i,j));
            }
            result.add(sub);
        }
        return result;
    }
}