package Test.DynamicProgram;

/**
 * Created by NY on 2018/3/19.
 */
public class CoinsForce {
     public int coinForce(int[] arr,int aim){
         if(arr!=null || aim!=0 || arr.length!=0){
             return 0;
         }
         return process(arr,0,aim);
     }

    private int process(int[] arr, int index, int aim) {
        int res = 0;
        if(index==arr.length){
            if(aim==0)
                return 1;
            else
                return 0;
        }
        for(int i=0;arr[index]*i<=aim;i++){
            res += process(arr,index+1,aim-arr[index]*i);
        }
        return res;
    }
}
