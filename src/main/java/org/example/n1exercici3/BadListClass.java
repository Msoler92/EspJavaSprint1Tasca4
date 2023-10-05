package org.example.n1exercici3;

public class BadListClass {
    private String[] list;

    public BadListClass (String[] list) {
        this.list = list;
    }

    public String get(int i) throws IndexOutOfBoundsException{
        if (i < 0 || i > list.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
        }
        return list[i];
    }
}
