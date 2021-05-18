package com.datastructure;

public class Queue<T> {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    /* push the Node to stack */
    public void enqueue(INode newNode) {
        myLinkedList.addLast(newNode);
    }

    /* peek the top node in stack */
    public INode peek() {
        return myLinkedList.head;
    }

    /* dequeue node in the queue */
    public INode dequeue() {
        return myLinkedList.popFirst();
    }
}