package com.example.SPLab2;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> images;
    private List<Paragraph> paragraphs;
    private List<Table> tables;

    public SubChapter(String name){
        this.name=name;
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addImage(Image image) {
        images.add(image);
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public List<Image> getImages() {
        return images;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public List<Table> getTables() {
        return tables;
    }

    @Override
    public String toString() {
        return "SubChapter=" +
                "name: '" + name;
    }
}
