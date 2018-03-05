package Chapter1;

import java.util.LinkedList;

/**
 * Created by NY on 2017/11/19.
 */
public class MaxWindowVlaue {

    public static int[] getMax(int[] arr,int windowWidth){
        LinkedList<Integer> qMax = new LinkedList();
        int[] res = new int[arr.length-windowWidth+1];
        if(arr.length==0)
            return null;
        for(int i=0;i<arr.length;i++ ){
            while (!qMax.isEmpty() && arr[qMax.peekLast()] <= arr[i]) {
                    qMax.pollLast();
            }
            qMax.addLast(i);
            if(qMax.peekFirst()<i-windowWidth+1)
                qMax.pollFirst();
            if(i>=windowWidth-1){
                res[i-windowWidth+1] = arr[qMax.peekFirst()];
            }
        }
        return res;
    }
}
