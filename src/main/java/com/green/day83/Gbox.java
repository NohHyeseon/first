package com.green.day83;

public class Gbox<T> { //<T>는 타입

    private T item;

    public void selItem(T item) {
        this.item = item;
    }


    public T getItem() {
        return this.item;
    }


}
