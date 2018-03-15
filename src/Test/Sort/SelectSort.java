package Test.Sort;

/**
 * Created by NY on 2018/3/15.
 */
public class SelectSort {
    public static void selectSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            int min = i;
            for(int j = i;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
