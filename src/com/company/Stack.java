package com.company;

public class Stack extends LinkedList {

    public int push(int v) {
        if (size() == 0) {
            super.add(v);
        } else {
            super.add(v, size());
        }
        return v;
    }

    public int pop(){
        int index = (size() - 1);             //Hämtar index från size()
        int value = super.get(size() -1);
        super.remove(index);
        return value;
    }

    public int peek() {
        if(super.empty()) {
            throw new RuntimeException("Gör om och gör rätt, dumhuvud.");
        }
        int index = (size() - 1);
        return super.get(index);
    }
}
