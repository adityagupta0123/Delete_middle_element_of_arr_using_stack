import java.util.*;

public class Solution {
    static int top = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            top++;
            stack.push(arr[i]);
        }
        removeMiddleElement(stack, top, n);
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        sc.close();
    }

    public static void removeMiddleElement(Stack<Integer> stack, int top, int n) {
        if (top == n - n / 2) {
            stack.pop();
            return;
        }
        top--;
        int temp = stack.pop();
        removeMiddleElement(stack, top, n);
        stack.push(temp);
    }
}
