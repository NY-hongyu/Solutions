package Chapter1;

import java.util.LinkedList;

/**
 * Created by NY on 2017/11/24.
 */
public class MaxSubMinNum {
    public int getNum(int[] arr,int num){
        if(arr.length==0){
            return 0;
        }
        int res = 0;
        LinkedList<Integer> qMax = new LinkedList();
        LinkedList<Integer> qMin = new LinkedList();
        int i = 0,j = 0;
        while (i<arr.length){
            while (j<arr.length){
                if(!qMax.isEmpty()&&arr[qMax.peekLast()]<arr[j]){
                    qMax.pollLast();
                }
                qMax.addLast(j);
                if(!qMin.isEmpty()&&arr[qMin.peekLast()]>arr[j]){
                    qMin.pollLast();
                }
                qMin.addLast(j);
                if(arr[qMax.peekLast()]-arr[qMin.peekLast()]>num){
                    break;
                }
                j++;
            }
            res += j-i;

            if(arr[i]==arr[qMax.peekFirst()]){
                qMax.pollFirst();
            }
            if(arr[i]==arr[qMin.peekFirst()]){
                qMin.pollFirst();
            }
            i++;
        }
        return res;
    }
}
