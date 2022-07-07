import java.util.Stack;

public class CorrectSequence {

    public static boolean sequence(String[] array){
        String open = "(";
        String close = ")";
        Stack<String> stk = new Stack<>();
        if (array[0].equals(close)) return false;
        else stk.push(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(close) && ((stk.size() != 0) && (stk.peek().equals(open))))
                stk.pop();
            else stk.push(array[i]);
        } return stk.isEmpty();
    }
}


