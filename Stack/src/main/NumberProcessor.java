
package main;

import java.util.Scanner;

public class NumberProcessor {

    private Stack stack;
    private Queue queue;

    public NumberProcessor() {
        stack = new Stack();
        queue = new Queue();
    }

    public void inputNumbers() {
        Scanner sc = new Scanner(System.in);
        int x;
        while (true) {
            System.out.print("Nhập giá trị x, nhập -1 để thoát: ");
            x = sc.nextInt();
            if (x == -1) {
                break;
            }
            if (x % 2 == 0) {
                stack.push(x);
            } else {
                queue.enqueue(x);
            }
        }
    }

    public void printResult() {
        stack.print();
        queue.print();
    }
}
