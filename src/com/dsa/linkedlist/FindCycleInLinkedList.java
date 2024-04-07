package com.dsa.linkedlist;

import com.dsa.linkedlist.LL.Node;

public class FindCycleInLinkedList 
{
	public static void main(String[] args) 
	{
		LL<Integer> ll = new LL<>();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		
		Node<Integer> n = ll.head.next ;
		ll.head.next.next.next.next.next = n ;
		
		System.out.println( hasCycle(ll.head));
	}
	
	public static <E> boolean hasCycle(Node<E> head) 
	{
		if(head == null )
		{
			return false ;
		}
		Node<E> hare = head ;
		Node<E> turtle = head ;
		
		while(hare != null && hare.next != null )
		{
			turtle = turtle.next ;
			hare = hare.next.next ;
			if( turtle == hare )
			{
				return true ;
			}
		}
		return false ;
	}
}
