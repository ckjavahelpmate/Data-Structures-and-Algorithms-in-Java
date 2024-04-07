package com.dsa.linkedlist;

import java.util.LinkedList;

class Node<E> {
	E data;
	Node<E> next;

	public Node(E data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data + "";
	}
}

class LL<E> {
	Node<E> head;

	public void addFirst(E data) {
		Node<E> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(E data) {
		Node<E> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<E> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}

	public String toString() {
		if (head == null) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		Node<E> newNode = head;
		while (newNode != null) {
			sb.append(newNode.data);
			if (newNode.next == null) {
				return sb.append(" ]").toString();
			}
			sb.append(", ");
			newNode = newNode.next;
		}
		return sb.append("]").toString();
	}

	public boolean contains(E data) {
		return indexOf(data) >= 0 ;
	}

	public boolean remove(E data) {
		if (head == null) {
			return false;
		}
		if (head.data != null && head.data.equals(data)) {
			head = head.next;
			return true;
		} else if (data == null && head.data == data) {
			head = head.next;
			return true;
		}
		for (Node<E> newNode = head,
				previousNode = head; newNode != null; previousNode = newNode, newNode = newNode.next) {
			if (newNode.data != null && newNode.data.equals(data)) {
				previousNode.next = newNode.next;
				newNode.next = null;
				return true;
			} else if (data == null && newNode.data == data) {
				previousNode.next = newNode.next;
				newNode.next = null;
				return true;
			}

		}
		return false;
	}
	public int indexOf(E data) {
		if (head == null) {
			return -1;
		}
		int index = 0 ;
		for (Node<E> newNode = head; newNode != null; newNode = newNode.next) {
			if (newNode.data != null && newNode.data.equals(data)) {
				return index;
			} else if (data == null && newNode.data == data) {
				return index;
			}
			index++ ;
		}
		return -1;
	}
	
}

public class TestLL {

	public static void main(String[] args) {

		LL<Integer> ll = new LL<>();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(40);
		ll.addLast(null);

		System.out.println(ll);
		
		System.out.println(ll.indexOf(null));

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.contains(10);
	}

}
