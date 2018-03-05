package Chapter1;

import java.util.Stack;

/**
 * Created by NY on 2017/11/16.
 */
public class SortStackByStack {

    public static Stack sort(Stack<Integer> stack){
        Stack<Integer> sortStack = new Stack<Integer>();
        while(!stack.isEmpty()) {
            int temp = stack.pop();
            if (sortStack.isEmpty())
                sortStack.push(temp);
            else {
                while (!sortStack.isEmpty() && sortStack.peek() > temp) {
                    stack.push(sortStack.pop());
                }
                sortStack.push(temp);
            }
        }
        return sortStack;
    }
}
