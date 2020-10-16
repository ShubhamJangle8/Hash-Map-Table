package com.linkedlist.mymapnode;

public class MyLinkedList<K> {
	INode<K> head;
	INode<K> tail;
	
	public MyLinkedList() {
		this.head = null;
	}
	
	public INode<K> getHead(){
		return head;
	}
	
	public void setHead(INode<K> head) {
		this.head = head;
	}
	
	public INode<K> getTail(){
		return tail;
	}
	
	public void setTail(INode<K> tail) {
		this.tail = tail; 
	}
	
	public INode<K> searchNode(K key) {
		INode<K> tempNode = head;
		while (tempNode != null && tempNode.getNext() != key) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void append(INode<K> myNode) {
		if(head == null) {
			head = myNode;
		}
		if(tail == null) {
			tail = myNode;
		}
		else {
			tail.setNext(myNode);
			tail = myNode;
		}
	}
	
	public INode<K> popFindingKey(K key) {
		INode<K> tempNode = head;
		INode<K> prevNode = null;
		if (this.head == null) {
			return null;
		}
		if (tempNode.getNext() == null) {
			return null;
		} 
		else if (tempNode.getKey() == key) {
			this.head = tempNode.getNext();
			return tempNode;
		}
		else {
			while (tempNode != null && tempNode.getKey() != key) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			prevNode.setNext(tempNode.getNext());
			return tempNode;
		}
	}
	
	public INode<K> delete(K key) {
		INode<K> temp = head;
		INode<K> prev = head;
		if (head.getKey().equals(key)) {
			head = head.getNext();
		} else {
			while (temp.getNext() != null) {
				if (temp.getKey().equals(key))
					break;
				prev = temp;
				temp = temp.getNext();
			}
			if (tail.getKey().equals(key)) {
				tail = prev;
				tail.setNext(null);
			}
			prev.setNext(temp.getNext());
		}
		return temp;
	}
	
	public String toString() {
		return "My Linked list node{ " + head + "}";
	}
}
