package com.hyunwoo.javaAlgorithmBook.ch6.linearLinkedList;

public class Ex6_1 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("(1) insert 3 nodes to the empty list");

        list.insertLastNode("Mon");
        list.insertLastNode("Tue");
        list.insertLastNode("Wed");
        list.printList();

    }

}
