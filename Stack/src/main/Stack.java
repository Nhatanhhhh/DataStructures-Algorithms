package main;

public class Stack {

    private static final int SIZE = 100;
    private int[] data = new int[SIZE];
    private int top = -1;

    public void push(int value) {
        if (top == SIZE - 1) {
            System.out.println("Ngăn xếp Stack đầy!!!");
            return;
        }
        data[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Ngăn xếp Stack rỗng!!!");
            return -1;
        }
        return data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void print() {
        System.out.println("Danh sách ngăn xếp Stack (các số chẵn):");
        while (!isEmpty()) {
            System.out.print(pop() + " ");
        }
        System.out.println();
    }
}
