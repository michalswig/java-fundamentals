package com.mike.javacookbook;

import com.mike.javacookbook.languagebasics.Factorial;
import com.mike.javacookbook.languagebasics.FizzBuzz;
import com.mike.javacookbook.languagebasics.Prime;
import com.mike.javacookbook.languagebasics.PrimitiveTypeRanges;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCookbookApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaCookbookApplication.class, args);

		PrimitiveTypeRanges.showPrimitiveTypeRange();
		Factorial.countFactorial(5);
		FizzBuzz.displayFizzBuzzFromOneToOneHundredUsingIfElse();
		FizzBuzz.displayFizzBuzzFromOneToOneHundredUsingSwitch();
		Prime.displayPrimeFromOneToThousand();

	}

}
