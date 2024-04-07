package com.dsa.linkedlist;



import com.dsa.linkedlist.LL.Node;

public class CheckSingleLinkedListIsPalindrome {

	public static void main(String[] args) {
		LL<Integer> ll = new LL<>();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(20);
		ll.addLast(10);
		
		System.out.println( isPalindrome(ll.head) );

	}
	public static <E> boolean isPalindrome(Node<E> head) 
	{
		if( head == null || head.next == null )
		{
			return true ;
		}
//		Find the middle or end of 1st half of List
		Node<E> middle = middle(head);
//		Find the reverse 2nd half of List
		Node<E> secondHlafStart = reverse(middle.next);
//		Compare 1st half and 2nd half of list
		Node<E> firstHalfHead = head ;
		while( secondHlafStart != null )
		{
			if( firstHalfHead.data != secondHlafStart.data )
			{
				return false ;
			}
			firstHalfHead = firstHalfHead.next ;
			secondHlafStart = secondHlafStart.next ;
		}
		return true ;
	}
	private static <E> Node<E> reverse(Node<E> head) 
	{
		if(head == null || head.next == null)
		{
			return head ;
		}
		
		Node<E> prev = null ;
		Node<E> curr = head ;
		while( curr != null )
		{
			Node<E> next = curr.next ;
			curr.next = prev ;
			prev = curr ;
			curr = next ;
		}
		return prev;
	}
	private static <E> Node<E> middle(Node<E> head)
	{
		Node<E> hare = head ;
		Node<E> turtle = head ;
//		stop when hare reaches end then turtle location will be middle 
		while( hare.next != null  && hare.next.next != null )
		{
//			Move turtle 1 step forward
			turtle = turtle.next ;
//			Move hare 2 step forward
			hare = hare.next.next ;	
		}
		return turtle ;
	}

}
