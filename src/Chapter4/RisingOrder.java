package Chapter4;

/**
 * Created by NY on 2018/3/20.
 */
public class RisingOrder {
    public int[] risingOrder(int[] arr){
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = 1;
            for(int j = 0;j<i;j++){
                if(arr[i]>arr[j]){
                    res[i] = Math.max(res[i],res[j]+1);
                }
            }
        }
        return res;
    }
    public int[] getLIS(int[] arr, int[] res){
        int len = 0;
        int index = 0;
        for(int i = 0;i<arr.length;i++){
            if(res[i]>len){
                len = res[i];
                index = i;
            }
        }
        int[] lis = new int[len];
        lis[--len] = arr[index];
        for(int i=index;i>=0;i--){
            if(arr[i]<arr[index] && res[i] == res[index]-1){
                lis[--len] = arr[i];
                index = i;
            }
        }
        return lis;
    }
}
