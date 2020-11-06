package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Stack stackList = new Stack();
        list.add(1);
        list.add(2);
        list.add(3);
        list.size();
        list.add(99,0);
        list.size();
        list.get(0);
        list.get(3);
        list.remove(3);
        list.size();
        list.empty();

        list.print();

        stackList.push(55);
        stackList.print();
        stackList.pop();
        stackList.peek();
    }
}
