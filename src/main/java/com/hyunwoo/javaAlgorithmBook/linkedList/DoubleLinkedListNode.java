package com.hyunwoo.javaAlgorithmBook.linkedList;

import java.util.Optional;

public class DoubleLinkedListNode<V> {

    private V value;
    private DoubleLinkedListNode<V> next;
    private DoubleLinkedListNode<V> previous;

    public DoubleLinkedListNode(V value, DoubleLinkedListNode<V> next, DoubleLinkedListNode<V> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public Optional<DoubleLinkedListNode<V>> getNext() {
        return Optional.ofNullable(next);
    }

    public Optional<DoubleLinkedListNode<V>> getPrevious() {
        return Optional.ofNullable(previous);
    }

    public V getValue() {
        return value;
    }

    public DoubleLinkedListNode setValue(V value) {
        this.value = value;
        return this;
    }

    public DoubleLinkedListNode setNext(DoubleLinkedListNode<V> next) {
        this.next = next;
        return this;
    }


    public DoubleLinkedListNode setPrevious(DoubleLinkedListNode<V> previous) {
        this.previous = previous;
        return this;
    }

}
