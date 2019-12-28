package com.codewardev;

//https://www.codewars.com/kata/counting-duplicates/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicates {

	public static int duplicateCount(String text) {
		String[] textArray = text.split("");
		List<String> result = new ArrayList<String>();
		result = Arrays.stream(textArray)
		.map(String::toLowerCase)
		.filter(x-> Collections.frequency(Arrays.asList(text.toLowerCase().split("")), x) > 1).distinct()
		.collect(Collectors.toList());
		
		return result.size();
	}

}
