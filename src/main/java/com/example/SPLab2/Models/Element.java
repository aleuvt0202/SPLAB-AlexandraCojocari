package com.example.SPLab2.Models;
import com.example.SPLab2.Services.Visitor;
public interface Element  {

    void print();

    void add(Element e);

    void remove(Element e);

    Element get(int index);

    void accept (Visitor v);
}

