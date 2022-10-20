package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишите тут ваш код
        Node a = new Node();
        a.value = value;
        if (first.next == null) {
            first.next = a;
            a.prev = first;
            a.next = last;
            last.prev = a;
        } else {
            Node p = last.prev;
            p.next = a;
            a.prev = p;
            a.next = last;
            last.prev = a;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
