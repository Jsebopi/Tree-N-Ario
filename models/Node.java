package models;

public class Node {
	private String info;
	private Node next;
	private Node previous;

	public Node(String info) {
		this.info = info;
		this.next = null;
		this.previous = null;
	}

	public Node(String info, Node next) {
		this.info = info;
		this.next = next;
		this.previous = null;
	}

	public Node(String info, Node next, Node previous) {
		this.info = info;
		this.next = next;
		this.previous = previous;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}