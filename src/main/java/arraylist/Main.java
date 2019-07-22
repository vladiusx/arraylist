package arraylist;

import arraylist.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList queue = new ArrayList();
        System.out.println(queue.getSize());
        queue.add(5);
        System.out.println(" " + queue.getSize());
        queue.add(6);
        queue.add(7);
        queue.add(8);
        System.out.println(" " + queue.getSize());
        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(" " + queue.getIndex(i));
        }
        queue.add(9);
        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        System.out.print(" " + queue.getSize());
        queue.remove(0);
        System.out.println(" " + queue.getSize());
        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(" " + queue.getIndex(i));
        }
        System.out.println(queue.getIndex(-1));
        queue.remove(-1);
        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(" " + queue.getIndex(i));
        }
        System.out.println();
            queue.indAdd(5, 4);
            System.out.println(" " + queue.getSize());
        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(" " + queue.getIndex(i));
        }
        System.out.println();
            queue.indAdd(6,21);
        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(" " + queue.getIndex(i));
        }

        }
    }
