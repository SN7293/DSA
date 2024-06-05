import java.util.Scanner;
import java.util.Stack;

public class StackRecursion {

    static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }

    static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter elements for the stack (enter -1 to stop):");
        int input = scanner.nextInt();
        while (input != -1) {
            stack.push(input);
            input = scanner.nextInt();
        }

        System.out.println("Original stack:");
        System.out.println(stack);

        reverseStack(stack);

        System.out.println("Reversed stack:");
        System.out.println(stack);

        scanner.close();
    }
}
