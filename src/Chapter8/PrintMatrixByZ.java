package Chapter8;

/**
 * Created by NY on 2018/3/14.
 */
public class PrintMatrixByZ {
    public static void printMatrixByZ(int[][] arr){
        int hx = 0;
        int hy = 0;
        int tx = 0;
        int ty = 0;
        int endX = arr.length-1;
        int endY = arr[0].length-1;
        boolean flag = true;
        while (hx!=endX+1){
            printByZ(arr,hx,hy,tx,ty,flag);
            hx = hy == endX ? hx+1:hx;
            hy = hy == endX ? hy:hy+1;
            ty = tx == endY ? ty+1 :ty;
            tx = tx == endY ? tx : tx+1;
            flag = !flag;
        }
    }

    private static void printByZ(int[][] arr, int hx, int hy, int tx, int ty,boolean flag) {
        int curX,curY;
        if(flag){
            curX = tx;
            curY = ty;
            while (curX!=hx-1){
                if(arr[curX][curY]==14){
                    System.out.println("");
                }
                System.out.println(arr[curX--][curY++]+" ");
            }
        }else {
            curX = hx;
            curY = hy;
            while (curY!=ty-1) {
                System.out.println(arr[curX++][curY--] + " ");
            }
        }

    }
}
