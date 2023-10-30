package com.example.SPLab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpLab2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpLab2Application.class, args);

		List<SubChapter> subChapters = new ArrayList<>();
		Author author = new Author("Alexandra Cojocari");

		Book book = new Book("First Project", author);

		SubChapter subchapter1 = new SubChapter("Sub1.1");
		SubChapter subchapter2 = new SubChapter("Sub1.2");

		Chapter chapter1 = new Chapter("Introduction");
		Chapter chapter2 = new Chapter("Chapter 1");

		// Add SubChapters to Chapter
		chapter1.addSubChapter(subchapter1);
		chapter1.addSubChapter(subchapter2);

		// Add Chapters to Book
		book.addChapter(chapter1);
		book.addChapter(chapter2);

		book.getTableOfContents().addContent("Chapter 1: Introduction");
		book.getTableOfContents().addContent("Chapter 2: Getting Started");

		Image image1 = new Image("image1.jpg");

		subchapter1.addImage(image1);

		Paragraph paragraph1 = new Paragraph("This is a paragraph.");
		subchapter1.addParagraph(paragraph1);

		Table table1 = new Table("Table 1");
		subchapter1.addTable(table1);

		// Access and manipulate the SubChapter's contents
		System.out.println("SubChapter Name: " + subchapter1.getName());
		System.out.println("Images in SubChapter:");
		for (Image image : subchapter1.getImages()) {
			System.out.println("- " + image.getImageName());
		}

		System.out.println("Paragraphs in SubChapter:");
		for (Paragraph paragraph : subchapter1.getParagraphs()) {
			System.out.println("- " + paragraph.getText());
		}

		System.out.println("Tables in SubChapter:");
		for (Table table : subchapter1.getTables()) {
			System.out.println("- " + table.getTitle());
		}

		System.out.println(book);
	}

}
