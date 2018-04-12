package models;


public class Tree<T> {
	private Node<T> root;

	public Tree(Node<T> root) {
		this.root = root;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void addChildTo(Node<T> child, Node<T> father) {
		child.setFather(father);
		father.addChild(child);

	}

	public void print() {
		printIdenty(root, "");
	}

	public void printIdenty(Node<T> root, String ident) {
		if (root != null) {
			System.out.println(ident + root);
		}
		for (Node<T> node : root.getChildren()) {
			printIdenty(node, ident + "\t");
		}
	}


	public boolean haveChild(Node<T> node) {
		for (int i = 0; i < node.getChildren().size(); i++) {
			if (node.getChildren().get(i) != null) {
				return true;
			}
		}
		return false;
	}

	public Node<T> getFatherByNode(Node<T> child) {
		return getFatherByNode(root, child);
	}

	private Node<T> getFatherByNode(Node<T> root, Node<T> child) {
		if (root != null) {
			if (isChildrenInList(root, child))
				return root;
		}
		for (Node<T> node : root.getChildren()) {
			return getFatherByNode(node, child);
		}
		return null;
	}


	private boolean isChildrenInList(Node<T> root, Node<T> child) {
		return root.getChildren().contains(child);
	}

}
