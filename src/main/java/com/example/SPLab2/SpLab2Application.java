package com.example.SPLab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpLab2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpLab2Application.class, args);

		Author author=new Author("Alexandra Cojocari");

		Book book=new Book("First Project", author);

		System.out.println(book);
	}

}
