import Chapter1.MaxWindowVlaue;

/**
 * Created by NY on 2017/11/15.
 */
public class Solutions {
    public static void main(String[] args) {
//        Stack<Integer> s1 = new Stack<>();
//        s1.push(1);
//        s1.push(5);
//        s1.push(3);
//        s1.push(6);
//        s1.push(2);
//        s1.push(4);
        int[] arr = {4,3,5,4,3,3,6,7};
        int[] res = MaxWindowVlaue.getMax(arr,3);
        for(int i:res)
            System.out.println(i);
        System.out.println(MaxWindowVlaue.getMax(arr,3).toString());

    }
}
