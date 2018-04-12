package models;

import java.util.ArrayList;

public class ManageStructures {
	private Tree<Directory> treeDirectory;
	private ArrayList<Integer> ids;


	public ArrayList<Integer> getIds() {
		return ids;
	}

	public void setIds(ArrayList<Integer> ids) {
		this.ids = ids;
	}

	public ManageStructures() {
		Directory direct = new Directory(0, "Disco Local "," ", 0);
		Node<Directory> root = new Node<Directory>(direct);
		treeDirectory = new Tree<Directory>(root);
		ids = new ArrayList<Integer>();
	}

	public void add(int aux, Node<Directory> nodeTree) {
		treeDirectory.addChildTo(nodeTree, getSelectNode(aux));
	}


	public void add(Node<Directory> father, Node<Directory> nodeTree) {
		treeDirectory.addChildTo(nodeTree, father);
	}


	public Tree<Directory> getMedicines() {
		return treeDirectory;
	}

	public Node<Directory> getSelectNode(int idAux) {
		return getSelectNode(treeDirectory.getRoot(), idAux);
	}
	
	private Node<Directory> getSelectNode(Node<Directory> rootNode, int path) {
		if (rootNode != null) {
			for (Node<Directory> node : rootNode.getChildren()) {
				int idAux = node.getInfo().getIdFather();
				if (path == (idAux))
					return node;
				else {
					if (getSelectNode(node, path) != null)
						return getSelectNode(node, path);
				}
			}
		}
		return null;
	}

	public void addID(int id) {
		ids.add(id);
	}


}