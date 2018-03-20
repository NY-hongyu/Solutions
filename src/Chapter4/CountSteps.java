package Chapter4;

/**
 * Created by NY on 2018/3/20.
 */
public class CountSteps {
    public int countSteps(int stepNum){
        if(stepNum<1)
            return 0;
        if(stepNum==1 || stepNum ==2)
            return stepNum;
        int temp = 1;
        int pre = 2;
        int res = 0;
        for(int i = 3;i<=stepNum;i++){
            res = temp + pre;
            temp = pre;
            pre = res;
        }
        return res;
    }

    public static void main(String[] args) {
        CountSteps cs = new CountSteps();
        System.out.println(cs.countSteps(8));
    }
}
