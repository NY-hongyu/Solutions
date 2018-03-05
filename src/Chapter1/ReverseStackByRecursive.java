package Chapter1;

import java.util.Stack;

/**
 * Created by NY on 2017/11/15.
 */
public class ReverseStackByRecursive {
    public static int getAndRemoveLastEle(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }
        int last = getAndRemoveLastEle(stack);
        stack.push(result);
        return last;
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int i = getAndRemoveLastEle(stack);
        reverse(stack);
        stack.push(i);
    }
}
