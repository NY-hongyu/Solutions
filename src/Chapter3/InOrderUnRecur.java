package Chapter3;

import java.util.Stack;

/**
 * Created by NY on 2017/11/25.
 */
public class InOrderUnRecur {
    public void inOrderUnRecur(Node head){
        if(head!=null) {
            Stack<Node> stack = new Stack();
            while (!stack.isEmpty() || head!=null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.println("visit node " + head.val);
                    head = head.right;
                }
            }
        }
    }
}
