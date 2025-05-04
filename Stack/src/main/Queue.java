package main;

public class Queue {

    private static final int SIZE = 100;
    private int[] data = new int[SIZE];
    private int head = 0;
    private int tail = 0;

    public void enqueue(int value) {
        int next = (tail + 1) % SIZE;
        if (next == head) {
            System.out.println("Hàng đợi đã đầy!!!");
            return;
        }
        data[next] = value;
        tail = next;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int next = (head + 1) % SIZE;
        int item = data[next];
        head = next;
        return item;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public void print() {
        System.out.println("Danh sách hàng đợi Queue (các số lẻ):");
        int value = dequeue();
        while (value != -1) {
            System.out.print(value + " ");
            value = dequeue();
        }
        System.out.println();
    }
}
