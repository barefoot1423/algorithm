package com.hyunwoo.javaAlgorithmBook.ch6.linearLinkedList;

class LinkedList {

    private ListNode head;

    public LinkedList() {
        head = null;
    }
˚
    public void insertLastNode(String day) {
        ListNode newNode = new ListNode(day);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void printList() {
        ListNode temp = head;
        System.out.printf("L = (");
        while (temp != null) {
            System.out.printf(temp.getData());
            temp = temp.link;
            if (temp != null) {
                System.out.printf(", ");
            }
        }
        System.out.println(")");
    }

    public ListNode searchNode(String day) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.getData().equals(day)) {
                return temp;
            } else {
                temp = head.link;
            }
        }
        return null;
    }

    public void insertMiddleNode(ListNode pre, String day) {
        ListNode newNode = new ListNode(day);
        newNode.link = pre.link;
        pre.link = newNode;
    }

}
