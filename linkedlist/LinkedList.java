package com.jeet.linkedlist;

public class LinkedList {
protected Node start;
protected Node end;
public int size;

public LinkedList(){
	start = null;
	end = null;
	size = 0;
}
public boolean isEmpty(){
	return start == null;
}
public int getSize(){
	return size;
}

public void inserAtStart(int val){
	Node node = new Node(val, null);
	size++;
	if(start == null){
		start = node;
		end = start;
	}
	else{
		node.setLink(start);
		start = node;
	}
}//method end
public void insertAtEnd(int val){
	Node node = new Node(val, null);
	size++;
	if(start == null){
		start = node;
		end = start;
	}
	else{
		end.setLink(node);
		end = node;
	}
}//method end
public void insertAtPos(int val, int pos){
	Node node = new Node(val, null);
	Node n = start;
	pos = pos-1;
	for(int i = 1; i<size; i++)
	{
		if(i == pos){
			Node tmp = n.getLink();
			n.setLink(node);
			node.setLink(tmp);
			break;
		}
		n = n.getLink();
	}
	size++;
}//method end
public void deleteAtPos(int pos){
	if(pos == 1)
	{
		start = start.getLink();
		size--;
		return;
	}
	if(pos == size)
	{
		Node s = start;
		Node t = start;
		while(s != end)
		{
			t = s;
			s = s.getLink();
		}
		end = t;
		end.setLink(null);
		size--;
		return;
	}
	Node ptr = start;
	pos = pos - 1;
	for(int i = 1; i<size-1; i++){
		if(i == pos)
		{
			Node tmp = ptr.getLink();
			tmp = tmp.getLink();
			ptr.setLink(tmp);
			break;
		}
		ptr = ptr.getLink();
	}
	size--;
}//method end
public void display()
{
	System.out.println("\n Singly LinkedList: ");
	if(size == 0)
	{
		System.out.println("empty\n");
		return;
	}
	if(start.getLink() == null)
	{
		System.out.println(start.getData());
		return;
	}
	Node ptr = start;
	System.out.println(start.getData()+"->");
	ptr = start.getLink();
	while(ptr.getLink()!=null){
		System.out.println(ptr.getData()+"->");
		ptr = ptr.getLink();
	}
	System.out.println(ptr.getData()+"\n");
  }
}
