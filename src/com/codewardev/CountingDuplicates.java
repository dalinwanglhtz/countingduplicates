package com.codewardev;

//https://www.codewars.com/kata/counting-duplicates/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicates {

	public static int duplicateCount(String text) {
		String[] textArray = text.toLowerCase().split("");
		List<String> result = new ArrayList<String>();
		result = Arrays.stream(textArray)
		.filter(x-> Collections.frequency(Arrays.asList(textArray), x) > 1).distinct()
		.collect(Collectors.toList());
		
		return result.size();
	}

}
