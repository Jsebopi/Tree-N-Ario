package model;

import java.util.ArrayList;

public class Node {

	private ArrayList<String> files;
	private ArrayList<Node> directory;
	
	private String name;
	
	public Node() {
		files = new ArrayList<>();
		directory = new ArrayList<>();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getFiles() {
		return files;
	}
	
	public ArrayList<Node> getDirectory() {
		return directory;
	}
	
	public void addFile(String file) {
		
		files.add(file);
		
	}
	
	public void addNode(Node node) {
		directory.add(node);
	}
	
}