package com.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    /* Created Simple Linked List and Added to the First Position */
    @Test
    public void GivenThreeNumbersWhenAddedToLinkedListShouldAddedtoTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assertions.assertEquals(true, result);
    }

    /* Created Simple Linked List and Added to the Last Position */
    @Test
    public void GivenThreeNumbersWhenAddedToLinkedListShouldAddedtoBottom() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addLast(myFirstNode);
        myLinkedList.addLast(mySecondNode);
        myLinkedList.addLast(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assertions.assertEquals(true, result);
    }
}