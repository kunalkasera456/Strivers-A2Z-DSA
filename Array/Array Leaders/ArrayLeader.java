/*
 *  Input: n = 6, arr[] = {16,17,4,3,5,2}
    Output: 17 5 2
    Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2
 */

import java.util.Stack;

public class ArrayLeader {
    public static void main(String[] args) {
        int n = 6, arr[] = {16,17,4,3,5,2};
        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
           if(stack.isEmpty() || arr[i] >= stack.peek()) {
            stack.push(arr[i]);
           }
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
}
