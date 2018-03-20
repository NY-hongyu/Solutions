package Test.Sort;

import java.util.Arrays;

/**
 * Created by NY on 2018/3/15.
 */
public class HeapSort {
    public void heapSort(int[] arr){
        arr = buildMaxHeap(arr);
        for(int i = arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adustDownToTop(arr,0,i);
            System.out.println(Arrays.toString(arr));
        }
    }

    public int[] buildMaxHeap(int[] arr){
        for(int i=arr.length/2-1;i>=0;i--){
            adustDownToTop(arr,i,arr.length);
        }
        return arr;
    }

    private void adustDownToTop(int[] arr, int k, int len) {
        int temp = arr[k];
        for(int i = k*2+1;i<len;i*=2+1){
            if(i+1<len&&arr[i]<arr[i+1])
                i++;
            if(arr[i]<temp)
                break;
            else{
                arr[k] = arr[i];
                k = i;
            }
        }
        arr[k] = temp;
    }
}
