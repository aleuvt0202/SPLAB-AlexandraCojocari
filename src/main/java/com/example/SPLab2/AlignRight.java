package com.example.SPLab2;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(String text) {
        System.out.println("##" + text);
    }
}
