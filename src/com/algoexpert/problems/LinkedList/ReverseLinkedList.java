package com.algoexpert.problems.LinkedList;

public class ReverseLinkedList {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node prevNode = null;
        Node currentNode = head;

        while(currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        return prevNode;
    }
}
