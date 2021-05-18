package com.datastructure;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyNodeTest {

    @Test
    public void GivenThreeNumbersWhenLinkedShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode));
        Assertions.assertTrue(result);
    }

}
