package com.linkedlist.mymapnode;

public class MyHashMap<K, V> {
	MyLinkedList<K> myLinkedList;
	
	public MyHashMap() {
		myLinkedList = new MyLinkedList<>(); 
	}

	public V get(K key) {
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.searchNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.searchNode(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkedList.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}

	public String toString() {
		return "MyHashMapNodes { " + myLinkedList + " }";
	}
	
	
}
