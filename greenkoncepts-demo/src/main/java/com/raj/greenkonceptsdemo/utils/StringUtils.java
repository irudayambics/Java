/**
 * 
 */
package com.raj.greenkonceptsdemo.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author user
 *
 */
public class StringUtils {

	/**
	 * Function to count words
	 * 
	 * @param s
	 * @return no of words
	 */
	public static int countWordsInSentence(String sentence) {

		Map<String, Integer> wordsMap = new HashMap<>();

		String[] tokens = sentence.split(" "); // split based on space

		for (String token : tokens) {

			String word = token.toLowerCase();
			if (wordsMap.containsKey(word)) {
				int count = wordsMap.get(word); // get word count
				wordsMap.put(word, count + 1); // override word count
			} else {
				wordsMap.put(word, 1); // initial word count to 1
			}
		}
		return wordsMap.size();
	}
}
