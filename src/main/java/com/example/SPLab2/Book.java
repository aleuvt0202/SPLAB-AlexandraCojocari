package com.example.SPLab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapters;

    public Book(){};

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.chapters = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor(){
        return author;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void addChapter(Chapter chapter) {
        this.chapters.add(chapter);
    }

    @Override
    public String toString() {
        return "Book: " +
                "title=" + title + ", " +
                "author=" + getAuthor() + '\n' +
                "chapters= " +getChapters();
    }

    public TableOfContents getTableOfContents() {
        return new TableOfContents();
    }
}

