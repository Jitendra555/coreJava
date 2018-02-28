package com.jeet.linkedlist;

public class Node {
protected int data;
protected Node link;

public Node(){
	link = null;
	data = 0;
}
public Node(int d, Node n){
	data = d;
	link = n;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public Node getLink() {
	return link;
}
public void setLink(Node link) {
	this.link = link;
}

}
