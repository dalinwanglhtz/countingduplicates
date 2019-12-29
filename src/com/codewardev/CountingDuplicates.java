package com.codewardev;

//https://www.codewars.com/kata/counting-duplicates/train/java

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class CountingDuplicates {

	public static int duplicateCount(String text) {
		String[] textArray = text.toLowerCase().split("");
		return Arrays.stream(textArray)
		.filter(x-> Collections.frequency(Arrays.asList(textArray), x) > 1).distinct()
		.collect(Collectors.toList()).size();
	}

}
