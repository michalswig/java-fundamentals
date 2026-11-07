package com.mike.javacookbook;

import com.mike.javacookbook.languagebasics.PrimitiveTypeRanges;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCookbookApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaCookbookApplication.class, args);

		PrimitiveTypeRanges.showPrimitiveTypeRange();

	}

}
