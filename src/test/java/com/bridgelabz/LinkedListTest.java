package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    private Assertions Assert;

    public LinkedListTest(){

    }

    @Test
    void given3NumbersWhenLinkedShouldPassLinkedListTest() {
        LinkedList<Integer> myFirstNode = new LinkedList<>(56);
        LinkedList<Integer> mySecondNode = new LinkedList<>(30);
        LinkedList<Integer> myThirdNode = new LinkedList<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);

    }

    @Test
    public void given3NumbersWhenAppendedShouldBeAddedToLast() {
        LinkedList<Integer> myFirstNode = new LinkedList<>(56);
        LinkedList<Integer> mySecondNode = new LinkedList<>(30);
        LinkedList<Integer> myThirdNode = new LinkedList<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);

    }


}
