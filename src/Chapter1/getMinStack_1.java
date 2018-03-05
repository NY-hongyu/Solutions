package Chapter1;

import java.util.Stack;

/**
 * Created by NY on 2017/11/15.
 */
public class getMinStack_1 {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public getMinStack_1(){
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int newNum){
        dataStack.push(newNum);
        if(minStack.isEmpty()){
            minStack.push(newNum);
        }else if(newNum <= this.getMin()){
            minStack.push(newNum);
        }else
            minStack.push(this.getMin());
    }

    public int pop(){
        if(dataStack.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        minStack.pop();
        return dataStack.pop();
    }

    public int getMin() {
        if(minStack.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return minStack.peek();
    }
}
