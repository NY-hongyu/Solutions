package Test.Sort;

/**
 * Created by NY on 2018/3/15.
 */
public class MergeSort {
    public void mergeSort(int[] arr,int first,int last){
        if(first<last) {
            int mid = (first + last) / 2;
            mergeSort(arr,first,mid);
            mergeSort(arr,mid+1,last);
            mergeArray(arr,first,mid,last);
        }
    }

    public void mergeArray(int[] arr,int first,int mid,int last){
        int[] arrTemp = new int[last-first+1];
        int i,j,k;
        for(i = first,j = mid+1,k = 0;i<=mid&&j<=last;){
            if(arr[i]<=arr[j]){
                arrTemp[k++] = arr[i++];
            }else {
                arrTemp[k++] = arr[j++];
            }
        }

        while (i<=mid){
            arrTemp[k++] = arr[i++];
        }
        while (j<=last){
            arrTemp[k++] = arr[j
                    ++];
        }
        for(int k1 = 0;k1<arrTemp.length;k1++){
            arr[first+k1] = arrTemp[k1];
        }
    }
}
