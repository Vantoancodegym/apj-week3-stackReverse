import java.util.Arrays;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> myStack=new Stack<>();
        int[] firstArray={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < firstArray.length; i++) {
            myStack.push(firstArray[i]);
        }
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i]=myStack.pop();
        }
        System.out.println(Arrays.toString(firstArray));
    }

}
