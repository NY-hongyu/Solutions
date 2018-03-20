package Chapter4;

/**
 * Created by NY on 2018/3/20.
 */
public class GetPath_1 {
    public int getPath(int[][] m){
        int row = m.length;
        int col = m[0].length;
        int[] arr = new int[Math.max(row,col)];
        arr[0] = m[0][0];
        for(int i=1;i<row;i++){
            arr[i] = arr[i-1] + m[i][0];
        }
        for(int i = 1; i<row;i++){
            arr[0] += m[i][0];
            for(int j = 1;j<col;j++){
                arr[j] = Math.min(arr[j-1],arr[j]) + m[i][j];
            }
        }
        return arr[row-1];
    }
}
