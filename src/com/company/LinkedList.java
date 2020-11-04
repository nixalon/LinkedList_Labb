package com.company;

public class LinkedList {
    private Node head;

    public int get(int index) {
        int i = 0;
        Node n = head;
        while (i < index) {
            n = n.next;
            i++;
        }
        return n.value;
    }

    public void add(int v) {
        if (head == null) {
            head = new Node(v);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(v);
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int size = 1;
        Node n = head;
        while (n.next != null) {
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
 //Hjälp från Facit: Det är likt add-funktionen. Men i while-loopen behöver vi hitta en specifik plats att trycka in ny node på.
 // Den nya noden behöver peka på nexta node Innan den föregående noden pekar på den nya noden. Annars uppstår vanlig bugg.
    /*public void add(int i, int v) {
       Node n = new Node(v);
    }*/


    private class Node {
        protected int value;
        protected Node next;

        public Node(int v) {
            this.value = v;
        }
    }
}
