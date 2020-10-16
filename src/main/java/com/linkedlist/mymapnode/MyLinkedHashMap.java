package com.linkedlist.mymapnode;

import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {
	private int noOfBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;

	public MyLinkedHashMap() {
		this.noOfBuckets = 10;
		this.myBucketArray = new ArrayList<>(noOfBuckets);
		for (int i = 0; i < noOfBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}

	public int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % 10;
		return index;
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			return null;
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.searchNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<K>();
			this.myBucketArray.set(index, myLinkedList);
		}
		@SuppressWarnings("unchecked")
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.searchNode(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	public boolean remove(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			System.out.println("Nothing present to remove");
		}
		if (myLinkedList == null) {
			return false;
		} else {
			myLinkedList.delete(key);
			return true;
		}
	}

}
