import java.util.Scanner;
import java.util.Stack;

public class TwoStackProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        System.out.println("Enter elements for stack 1 (enter -1 to stop):");
        int input = scanner.nextInt();
        while (input != -1) {
            stack1.push(input);
            input = scanner.nextInt();
        }

        System.out.println("Enter elements for stack 2 (enter -1 to stop):");
        input = scanner.nextInt();
        while (input != -1) {
            stack2.push(input);
            input = scanner.nextInt();
        }

        System.out.println("Popping elements from stack 1:");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }

        System.out.println("Popping elements from stack 2:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }

        scanner.close();
    }
}
