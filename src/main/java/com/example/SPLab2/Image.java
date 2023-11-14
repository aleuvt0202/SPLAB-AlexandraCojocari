package com.example.SPLab2;


import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    // crate a print method
    public void print() {
        System.out.println("Image with name: " + imageName);
    }



}



