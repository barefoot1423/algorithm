package com.hyunwoo.javaAlgorithmBook.linkedList;

public class DoubleLinkedListNode<T> {

    private T value;
    private DoubleLinkedListNode<T> next;
    private DoubleLinkedListNode<T> previous;

    public DoubleLinkedListNode(T value, DoubleLinkedListNode<T> next, DoubleLinkedListNode<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

}
