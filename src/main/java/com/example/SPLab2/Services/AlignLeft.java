package com.example.SPLab2.Services;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println(text + "##");
    }
}
