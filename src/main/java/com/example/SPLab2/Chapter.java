package com.example.SPLab2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String title;
    private List<SubChapter> subChapters;
    private TableOfContents tableOfContents;

    public Chapter(String title) {
        this.title = title;
        this.subChapters=new ArrayList<>();
        this.tableOfContents = new TableOfContents();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }

    public void setSubChapters(List<SubChapter> subChapters) {
        this.subChapters = subChapters;
    }

    public void addSubChapter(SubChapter subChapters) {
        this.subChapters.add(subChapters);
    }

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    @Override
    public String toString() {
        return "Chapter= " +
                "title='" + title+", subchapters: "+subChapters;
    }
}

