package org.example.n3exercici6;

public class BadListClass {
    private String[] list;

    public BadListClass(String[] list) {
        this.list = list;
    }

    public String getElement(int i) throws IndexOutOfBoundsException{
        if (i < 0 || i > list.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
        }
        return list[i];
    }
}
