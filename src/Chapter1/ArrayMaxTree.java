package Chapter1;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by NY on 2017/11/19.
 */
public class ArrayMaxTree {
    public class Node{
        public int val;
        public Node left;
        public Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public Node getMaxTree(int[] arr){
        Node[] nArr = new Node[arr.length];
        Stack<Node> stack = new Stack<>();
        HashMap<Node,Node> lBigMap = new HashMap<>();
        HashMap<Node,Node> rBigMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            nArr[i] = new Node(i);
        }
        for(int i=0;i<nArr.length;i++){
            Node curNode = nArr[i];
            while (!stack.isEmpty() && curNode.val > stack.peek().val){
                popAndPut(stack,lBigMap);
            }
            stack.push(nArr[i]);
        }
        while (!stack.isEmpty()){
            popAndPut(stack,lBigMap);
        }
        for(int i=nArr.length-1;i>=0;i--){
            Node curNode = nArr[i];
            while (!stack.isEmpty() && curNode.val > stack.peek().val){
                popAndPut(stack,rBigMap);
            }
            stack.push(nArr[i]);
        }
        while (!stack.isEmpty()){
            popAndPut(stack,rBigMap);
        }
        Node head =null;
        for (int i=0;i<nArr.length;i++){
            Node curNode = nArr[i];
            Node left = lBigMap.get(curNode);
            Node right = rBigMap.get(curNode);
            if(left==null && right==null){
                head = curNode;
            }else if(left==null){
                if(right.left==null){
                    right.left = curNode;
                }else
                    right.right = curNode;
            }else if(right==null){
                if(left.left==null)
                    left.left = curNode;
                else
                    left.right = curNode;
            }else {
                Node parent = left.val > right.val ? right:left;
                if(parent.left==null)
                    parent.left = curNode;
                else
                    parent.right = curNode;
            }
        }
        return head;
    }

    private void popAndPut(Stack<Node> stack, HashMap<Node, Node> lBigMap) {
        Node popNode = stack.pop();
        if(stack.isEmpty())
            lBigMap.put(popNode,null);
        else {
            lBigMap.put(popNode,stack.peek());
        }
    }
}
