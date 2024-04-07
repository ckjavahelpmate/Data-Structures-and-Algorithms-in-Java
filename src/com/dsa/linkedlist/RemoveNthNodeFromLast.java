package com.dsa.linkedlist;

import com.dsa.linkedlist.LL.Node;

public class RemoveNthNodeFromLast {

	public static void main(String[] args) 
	{
		LL<Integer> ll = new LL<>();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		
		System.out.println( ll );
		removeNthNodeFromLast(ll.head, 3);
		System.out.println(ll);
		
	}
	public static void removeNthNodeFromLast(Node<Integer> head, int n)
	{
		if( head == null || head.next == null )
		{
			return ;
		}
//		find size of Single Linked List 
		int size = 0 ;
		Node<Integer> curr = head ;
		while( curr != null )
		{
			curr = curr.next ;
			size++ ;
		}
		if( n == size)
		{
			head = head.next; return;
		}
//		Find Index to Search
		int indexToSearch = size - n ;
		int i =  1;
		curr = head ;
		while( i < indexToSearch )
		{
			curr = curr.next ;
			i++;
		}
		
//		Remove node at nth index
		curr.next = curr.next.next ;

	}

}
