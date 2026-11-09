package com.mike.javacookbook;

import com.mike.javacookbook.languagebasics.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class JavaCookbookApplication {

	public static void main(String[] args) throws InterruptedException {

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
		int[] tab = {10, 20, 30, 40};
		ArrayLearn.swap(tab, 0,3);
		Integer i = 10;
		Integer j = 20;
		ArrayLearn.swapInteger(i, j);
		System.out.println("i: " + i + " j: " + j);
		int[] tabTwo = {40, 50, 60, 70};
		ArrayLearn.reverse(tabTwo);
		for(int number: tabTwo){
			System.out.print(number + ", ");
		}
		int secondBiggestValue = ArrayLearn.findSecondLargest(tabTwo);
		System.out.println();
		System.out.println(secondBiggestValue
		);

		System.out.println("overload:");
		System.out.println(Overload.sum(1,2));
		System.out.println(Overload.sum(1,2.0)); //TODO przekazuje 1.0 i 2.0
		System.out.println(Overload.sum());

		CacheTrap.showDifference();

		GuessNumber.findThatNumber();




	}

}
