package com.example.SPLab2;

public class Table {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Table{" +
                "title='" + title + '\'' +
                '}';
    }
}
