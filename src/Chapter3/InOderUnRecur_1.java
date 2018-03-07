package Chapter3;

import java.util.Stack;

/**
 * Created by NY on 2018/3/7.
 */
public class InOderUnRecur_1 {
    public void InOrderUnRecur(Node head) {
        Stack s = new Stack();
        if (head == null)
            return;
        s.push(head);
        Node cur = head;
        while (!s.isEmpty()) {
            while (cur.left != null) {
                s.push(cur.left);
                cur = (Node) s.peek();
            }
            cur = (Node)s.pop();
            System.out.println("visit " + cur.val);
            if(cur.right!=null){
                s.push(cur.right);
                cur = (Node)s.peek();
            }
        }
    }
}
