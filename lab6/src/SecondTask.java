public class SecondTask {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
