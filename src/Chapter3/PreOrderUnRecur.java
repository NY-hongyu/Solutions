package Chapter3;

import java.util.Stack;

/**
 * Created by NY on 2017/11/25.
 */
public class PreOrderUnRecur {
    public void perOrderUnRecur(Node head){
        Stack<Node> stack = new Stack<>();
        if(head==null)
            return;
        stack.push(head);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println("visit node "+cur.val);
            if(cur.right!=null)
                stack.push(cur.right);
            if(cur.left!=null)
                stack.push(cur.left);
        }
    }
}
