package Chapter3;

import java.util.Stack;

/**
 * Created by NY on 2017/11/25.
 */
public class PosOrderUnRecur {
    public void postOderUnRecur(Node head){
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        if(head==null)
            return;
        s1.push(head);
        Node cur;
        while (!s1.isEmpty()){
            cur = (Node)s1.pop();
            s2.push(cur);
            if(cur.left!=null)
                s1.push(cur.left);
            if(cur.right!=null)
                s1.push(cur.right);
        }
        while (!s2.isEmpty()){
            System.out.println("node " + ((Node)s2.pop()).val);
        }
    }
}
