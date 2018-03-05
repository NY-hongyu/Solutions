package Chapter1;

import java.util.Stack;

/**
 * Created by NY on 2017/11/15.
 */
public class QueueByStack {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public QueueByStack(){
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    public void push(int newNum){
        stackPush.push(newNum);
    }

    public int pop(){
        if(stackPush.isEmpty()&&stackPop.isEmpty())
            throw new RuntimeException("Your Queue is empty!");
        if(!stackPop.isEmpty())
            return stackPop.pop();
        else {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
            return stackPop.pop();
        }
    }
}
