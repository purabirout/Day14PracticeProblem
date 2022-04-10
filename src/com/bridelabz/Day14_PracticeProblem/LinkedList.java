package com.bridelabz.Day14_PracticeProblem;

import java.util.LinkedHashSet;

public class LinkedList {
	static Node head;
	public void add(int data) {
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	 public void insertAtMid(int x)
	    {
	        // if list is empty
	        if (head == null)
	            head = new Node(x);
	        else {
	            // get a new node
	            Node newNode = new Node(x);
	 
	            Node temp = head;
	            int len = 0;
	 
	            // calculate length of the linked list
	            //, i.e, the number of nodes
	            while (temp!=null) {
	                len++;
	                temp = temp.next;
	            }
	 
	            // 'count' the number of nodes after which
	            // the new node is to be inserted
	            int count = ((len % 2) == 0) ? (len / 2) :
	                                        (len + 1) / 2;
	            temp = head;
	 
	            // 'temp' points to the node after which
	            // the new node is to be inserted
	            while (count-- > 1)
	                temp = temp.next;
	 
	            // insert the 'newNode' and adjust
	            // the required links
	            newNode.next = temp.next;
	            temp.next = newNode;
	        }
	    }
	public void display() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
	}
		System.out.println(node.data);
	}
	public Node deleteFirst() {
		if(head==null) {
			return null;
		}else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}
	}
	public void deleteLast() {
		Node last=head;
		Node previousToLast=null;
		while(last.next!=null) {
			previousToLast=last;
			last=last.next;
		}
		previousToLast.next=null;
	}
	
}
//	public static Node head = null;
//	public static Node tail = null;
//	
//	private ArrayList <Node> nodeList = new ArrayList <Node> ();
//	
//	public ArrayList <Node> getArrayList() 
//	{
//		return nodeList;
//	}
//	
//	public void add(Node node)
//	{
//		nodeList.add(node);		
//	}
//		
//	public void remove(Node node)
//	{
//		nodeList.remove(node);	
//	}
//
//	public void display() {
//		
//	}
//
//	public void addNode(int i) {
//		
//	}
//
//	public void addNodeAtFront(Node node) {
//		
//	}
//
//	public void addNodeAtEnd(Node node) {
//		
//		

