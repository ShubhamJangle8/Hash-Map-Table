package com.linkedlist.mymapnode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyLinkedHashMapTest {

	@Test
	public void GivenASentence_WhenAddedtoList_ShouldGiveFrequencyOfParanoid() {
		String sentence = "Paranoid are not paranoid because they are paranoid "
				+ "but because they keep putting themselves " + "deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String words[]  = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null) {
				value = 1;
			} 
			else {
				value++;
			}
			myLinkedHashMap.add(word, value);
		}
		int frequencyTo = myLinkedHashMap.get("paranoid");
		System.out.println(frequencyTo);
		Assert.assertEquals(4, frequencyTo);
	}
}
