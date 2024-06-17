package com.hyunwoo.javaAlgorithmBook.ch6.linearLinkedList;

public class Ex6_1 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("(1) insert 3 nodes to the empty list");

        list.insertLastNode("Mon");
        list.insertLastNode("Wed");
        list.insertLastNode("Sun");
        list.printList();

        System.out.println("(2) insert \"Fri\" node after \"Wed\" node ");
        ListNode pre = list.searchNode("Wed");
        if (pre != null) {
            list.insertMiddleNode(pre, "Fri");
            list.printList();
        } else {
            System.out.println("Can't find the day in the list");
        }

        System.out.println("(3) delete the last node");
        list.deleteLastNode();
        list.printList();
        π
    }

}
