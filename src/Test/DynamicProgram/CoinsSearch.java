package Test.DynamicProgram;

/**
 * Created by NY on 2018/3/20.
 */
public class CoinsSearch {
    public int coinsSearch(int[] arr,int aim){
        if(arr!=null||arr.length!=0||aim<0){
            return 0;
        }
        int[][] valueMap = new int[arr.length+1][aim+1];
        return processSearch(arr,0,aim,valueMap);
    }

    private int processSearch(int[] arr, int index, int aim, int[][] valueMap) {
        int res = 0;
        if(index==arr.length){
            return aim==0 ? 1:0;
        }else {
            int value = 0;
            for(int i=0;arr[index]*i<=aim;i++) {
                value = valueMap[index+1][aim-arr[index]*i];
                if(value!=0){
                    return res += value;
                }else
                    return res += processSearch(arr,index+1,aim-arr[index]*i,valueMap);
            }
        }
        valueMap[index][aim] = res == 0 ? -1 :res;
        return res;
    }
}
