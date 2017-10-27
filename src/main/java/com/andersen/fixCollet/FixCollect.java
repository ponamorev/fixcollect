package com.andersen.fixCollet;

import java.util.ArrayList;

class FixCollect extends ArrayList<Integer> {
    final int size;
    FixCollect() {
        size = 16;
    }

    FixCollect(int s) {
        size = s;
    }

    @Override
    public void add(int index, Integer value) {
        System.out.println("Недопустимая операция.");
    }

    public boolean add(Integer value) {
        if (this.size() < size) {
            super.add(value);
            return true;
        }
        else {
            remove(0);
            super.add(value);
            return true;
        }
    }

    /*void printList() {
        System.out.print("[");
        for (int val : this) {
            System.out.print(val + " ");
        }
        System.out.println("\b]\n");
    }*/
}
