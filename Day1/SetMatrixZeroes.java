package Day1;

class BruteForce {
    public void setRowColumnZeros(int i, int j, int temp[][]){
        for(int x=0; x<temp[0].length; x++){
            temp[i][x]=0;
        }
        for(int y=0; y<temp.length; y++){
            temp[y][j]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int temp[][] = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                temp[i][j]=matrix[i][j];
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    setRowColumnZeros(i,j,temp);
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] =temp[i][j];
            }
        }
    }
}
class Better {

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean row[] = new boolean[n];
        boolean column[] = new boolean[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if( row[i] || column[j]){
                   matrix[i][j] = 0;
                }
            }
        }
    }
}
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean firstRow = false;
        boolean firstCol = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) firstRow = true;
                    if(j == 0) firstCol = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0]== 0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRow){
            for(int i=0; i<m; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstCol){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        } 
    }
}