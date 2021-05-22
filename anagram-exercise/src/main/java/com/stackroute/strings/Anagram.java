package com.stackroute.strings;
import java.util.Arrays;
public class Anagram {
	private static final String PROPER_MESSAGE = "Give proper input not empty phrases";
	private static final String ANAGRAMS = "Given phrases are anagrams";
	private static final String NOT_ANAGRAMS = "Given phrases are not anagrams";
	// write logic to check given two phrases are anagrams or not and return result
	public String checkAnagrams(final String phraseOne, final String phraseTwo) {
		final char str1[] = phraseOne.toCharArray();
		final char str2[] = phraseTwo.toCharArray();
		final int n1 = str1.length;
		int n2 = str2.length;
		if (phraseOne.isEmpty() | phraseTwo.isEmpty()) {
			return PROPER_MESSAGE;
		}
		if (n1 != n2) {
			return NOT_ANAGRAMS;}
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i]) {
				return NOT_ANAGRAMS;}
		}
		return ANAGRAMS;
			
	}
}