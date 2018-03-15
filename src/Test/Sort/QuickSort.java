package Test.Sort;

/**
 * Created by NY on 2018/3/15.
 */
public class QuickSort {
    public void quickSort(int[] arr,int first,int last){
        if(first<last){
            int pivot = partition(arr,first,last);
            quickSort(arr,first,pivot-1);
            quickSort(arr,pivot+1,last);
        }
    }

    private int partition(int[] arr, int first, int last) {
        int pivot = arr[first];
        if(first<last){
            while (first<last&&arr[last]>=pivot) last--;
            arr[first] = arr[last];
            while (first<last&&arr[first]<=pivot) first++;
            arr[last] = arr[first];
        }
        arr[first] = pivot;
        return first;
    }
}
