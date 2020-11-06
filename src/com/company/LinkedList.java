package com.company;

public class LinkedList {
    private Node head;

    public int get(int index) {         //Hämtar värdet från ett specifikt index
        int i = 0;
        Node n = head;
        while (i < index) {
            n = n.next;
            i++;
        }
        return n.value;
    }

    public void add(int v) {            //Om listan är tom, lägg till nytt värde på första plats.
        if (head == null) {
            head = new Node(v);
        } else {                        //Annars lägg till nytt värde på sista plats i listan.
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(v);
        }
    }

    public int size() {                 //Kollar hur många element det finns i en litsa
        if (head == null) {
            return 0;
        }
        int size = 1;
        Node n = head;
        while (n.next != null) {        //Så länge n.next inte pekar ut i tomma rymden, fortsätt räkningen
            n = n.next;
            size++;
        }
        return size;
    }

    public void remove(int index) {
        if (index == 0) {                // Kollar så remove inte tar bort från tom lista
            head = head.next;
        } else {
            Node n = head;
            int i = 0;
            while (++i < index) {
                n = head.next;
            }
            n.next = n.next.next;       // Hoppar 2 steg framåt. Java tar automatiskt bort varaiabeln däremellan.
        }
    }

    public boolean empty() {            // Om första platsen i en lista är tom är resten av listan också tom.
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains (int v) {
        for (int i = 0; i < size(); i++) {
            if (get(i) == v) {
                return true;
            }
        }
        return false;
    }

    public void add(int v, int index) {
        Node n = head;
        if(index == 0){
            Node node = new Node(v);
            node.next = head;
            head = node;
            return;
        }
        if (n != null) {
            for (int j = 0; j < size(); j++) {
                if (j == (index - 1)) {
                    Node addedNode = new Node(v);
                    addedNode.next = n.next;
                    n.next = addedNode;
                    return;
                }
                n = n.next;
            }
        }
    }

    public void print(){
        System.out.print("LinkedList --> ");
        Node n = head;
        while (n != null){
            System.out.print("Node(");
            System.out.print(n.value);
            System.out.print(") --> ");
            n = n.next;
        }
        System.out.println("");
    }


    protected class Node {
        protected int value;
        protected Node next;

        public Node(int v) {
            this.value = v;
        }
    }
}

