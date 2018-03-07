import Chapter3.Node;
import Chapter3.PosOrderUnRecur;

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

//        int[] arr = {4,3,5,4,3,3,6,7};
//        int[] res = MaxWindowVlaue.getMax(arr,3);
//        for(int i:res)
//            System.out.println(i);
//        System.out.println(MaxWindowVlaue.getMax(arr,3).toString());
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
//        InOderUnRecur_1 temp1 = new InOderUnRecur_1();
//        InOrderUnRecur temp = new InOrderUnRecur();
//        temp1.InOrderUnRecur(n1);
//        temp.inOrderUnRecur(n1);
        PosOrderUnRecur p = new PosOrderUnRecur();
        p.postOderUnRecur(n1);

    }
}
