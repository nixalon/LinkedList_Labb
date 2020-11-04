package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        //System.out.println(list.size());
        list.remove(1);
        list.empty();
        list.contains(1);
        /*list.size();
        //list.add(0,99);
       /* list.size();
        list.get(0);
        list.get(3);*/
       // list.remove(3);
        //l.size() -> 3
        //l.empty() -> false*/

        System.out.println("Number: " + list.get(0));
        System.out.println("Number: " + list.get(1));
        System.out.println("Empty: " + list.empty());
        System.out.println("Contains: " + list.contains(1));
        /*System.out.println("Number: " + list.get(2));
        System.out.println("Size: " + list.size());
        System.out.println("Number: " + list.get(3));
        System.out.println("Size: " + list.size());
        System.out.println("Value of index: " + list.get(0));
        System.out.println("Value of index: " + list.get(3));
       // System.out.println("Removed a number: " + list.remove(3));*/
    }
}
