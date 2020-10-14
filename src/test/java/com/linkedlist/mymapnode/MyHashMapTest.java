package com.linkedlist.mymapnode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyHashMapTest {

	
	
	@Test
	public void GivenASentence_WhenAddedtoList_ShouldGiveFrequencyOfWords() {
		String sentence = "to be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String words[] = sentence.toLowerCase().split(" ");
		
		for(String word : words) {
			Integer value = myHashMap.get(word);
			if(value == null) {
				value = 1;
			}
			else {
				value++;
			}
			myHashMap.add(word, value);
		}
		int frequencyTo = myHashMap.get("to");
		System.out.println(myHashMap);
		System.out.println(frequencyTo);
		Assert.assertEquals(2, frequencyTo);
	}
}
