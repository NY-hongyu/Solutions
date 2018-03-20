package Chapter4;

/**
 * Created by NY on 2018/3/20.
 */
public class GetPath {
    public int getPath(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] path = new int[row][col];
        for(int i=0;i<row;i++){
            for (int j = 0;j < col;j++){
                if(i==0&&j==0) {
                    path[i][j] = matrix[i][j];
                }
                else if (i==0) {
                    path[i][j] = path[i][j-1] +  matrix[i][j];
                }
                else if(j==0) {
                    path[i][j] = path[i-1][j] +  matrix[i][j];
                }
                else {
                    path[i][j] = matrix[i][j] + Math.min(path[i-1][j],path[i][j-1]);
                }
            }
        }
        return  path[row-1][col-1];
    }
}
