package Chapter4;

/**
 * Created by NY on 2018/3/20.
 */
public class CountStepsForce {
    public int countStepForce(int stepNum){
        if(stepNum<1)
            return 0;
        if(stepNum==1 || stepNum ==2)
            return stepNum;
        return countStepForce(stepNum - 1) + countStepForce(stepNum - 2);
    }
    public static void main(String[] args) {
        CountStepsForce cs = new CountStepsForce();
        System.out.println(cs.countStepForce(8));
    }
}
