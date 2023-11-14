package com.example.SPLab2;

public interface Element {
    void add(Element element);
    void remove(Element element);
    Element get(int index);
    void print();
}

