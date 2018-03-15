package Chapter8;

/**
 * Created by NY on 2018/3/14.
 */
public class PrintMatrixByCircle {
    public static void printMatrixByCircle(int[][] arr){
        int hx = 0;
        int hy = 0;
        int tx = arr.length-1;
        int ty = arr[0].length-1;
        while (hx <= tx && hy <= ty){
            printEgde(arr,hx++,hy++,tx--,ty--);
        }
    }

    private static void printEgde(int[][] arr, int hx, int hy, int tx, int ty) {
        int curX = hx;
        int curY = hy;
        if(curX==tx){
            for(int i = curY;i <= ty;i++){
                System.out.print(arr[curX][i]+" ");
            }
        }
        if(curY==ty){
            for(int i=curX;i<=tx;i++){
                System.out.print(arr[i][curY]+" ");
            }
        }
        while (curY < ty){
            System.out.print(arr[curX][curY]+" ");
            curY++;
        }
        while (curX < tx){
            System.out.print(arr[curX][curY]+" ");
            curX++;
        }

        while (curY > hy){
            System.out.print(arr[curX][curY]+" ");
            curY--;
        }
        while (curX > hx){
            System.out.print(arr[curX][curY]+" ");
            curX--;
        }


    }
}
