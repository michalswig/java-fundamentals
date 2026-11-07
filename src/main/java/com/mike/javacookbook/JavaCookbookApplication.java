package com.mike.javacookbook;

import com.mike.javacookbook.languagebasics.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class JavaCookbookApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaCookbookApplication.class, args);

		PrimitiveTypeRanges.showPrimitiveTypeRange();
		Factorial.countFactorial(5);
		FizzBuzz.displayFizzBuzzFromOneToOneHundredUsingIfElse();
		FizzBuzz.displayFizzBuzzFromOneToOneHundredUsingSwitch();
		Prime.displayPrimeFromOneToThousand();
		double resultInt = MoneyCount.addTwoNumbers(0.1, 0.2);
		System.out.println("result add two int: " + resultInt);
		//efekt niedokładnej reprezentacji liczb dziesiętnych w systemie binarnym.
		BigDecimal printBigDecimal = MoneyCount.addTwoNumbersBigDecimalReturn(0.1, 0.2);
		System.out.println("result add two int return BigDecimal " + printBigDecimal);

	}

}
