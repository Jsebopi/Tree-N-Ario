package models;

import java.util.ArrayList;

public class Node<T> {
	private T info;
	private Node<T> father;
	private ArrayList<Node<T>> children;

	public Node(T info, Node<T> father) {
		this.info = info;
		this.father = father;
		children = new ArrayList<>();
	}

	public Node(T info) {
		this.info = info;
		children = new ArrayList<>();
	}

	public void setFather(Node<T> father) {
		this.father = father;
	}

	public void addChild(Node<T> newChild) {
		children.add(newChild);
	}

	public void printChildren() {
		children.forEach(System.out::println);
	}

	public T getInfo() {
		return info;
	}

	public Node<T> getFather() {
		return father;
	}

	public ArrayList<Node<T>> getChildren() {
		return children;
	}

	@Override
	public String toString() {
		return info.toString();
	}
}