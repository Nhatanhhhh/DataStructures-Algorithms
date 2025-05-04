package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        // Thêm node vào cuối danh sách
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);

        System.out.println("Danh sách sau khi thêm node vào cuối:");
        list.printForward();
        list.printBackward();

        System.out.println("\n----------end--------------");

        // Tìm kiếm
        System.out.print("Nhập số cần tìm trong danh sách: ");
        int k = sc.nextInt();
        if (list.search(k)) {
            System.out.println("Đã tìm thấy " + k + " trong danh sách");
        } else {
            System.out.println("Không tìm thấy " + k + " trong danh sách");
        }

        System.out.println("\n---------------------------------------");

        sc.close();
    }
}
