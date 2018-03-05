package Chapter1;

import java.util.Stack;

/**
 * Created by NY on 2017/11/15.
 */
public class getMinStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public getMinStack(){
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int newNum){
        dataStack.push(newNum);
        if(minStack.isEmpty()){
            minStack.push(newNum);
        }else if(newNum <= this.getMin()){
            minStack.push(newNum);
        }
    }

    public int pop(){
        if(dataStack.isEmpty()){
            throw new RuntimeException("Your Stack is EMPTY!");
        }
        if(dataStack.peek()==this.getMin()){
            minStack.pop();
        }
        return dataStack.pop();
    }

    public int getMin(){
        if(minStack.isEmpty())
            throw new RuntimeException("Your Stack is EMPTY!");
        return minStack.peek();
    }
}
