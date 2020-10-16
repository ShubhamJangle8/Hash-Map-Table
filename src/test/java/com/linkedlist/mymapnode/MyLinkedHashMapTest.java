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
		Integer frequency = myLinkedHashMap.get("paranoid");
		System.out.println("Frequency of 'they'" + frequency + "\n");
		Assert.assertEquals((Integer)4, frequency);
	}
	
	@Test
	public void GivenASentence_WhenAddedtoList_ShouldGiveFrequencyOfThey() {
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
		Integer frequency = myLinkedHashMap.get("they");
		System.out.println("Frequency of 'they'" + frequency + "\n");
		Assert.assertEquals((Integer)2, frequency);
	}
	@Test
	public void GivenASentence_WhenRemovedAKey_ShouldGetPopped() {
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
		for(String word : words) {
			if (word.equals("avoidable")) {
				myLinkedHashMap.remove(word);
			} 
		}
		System.out.println("Avoidable removed\n");
		Assert.assertTrue(myLinkedHashMap.remove("avoidable"));
	}
}
