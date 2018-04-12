package views;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import controller.Controller;
import models.Directory;
import models.Node;
import models.Tree;

public class JPanelTree extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTree jtree;
	private DefaultMutableTreeNode rootNode;
	private DefaultTreeModel modelo;

	public JPanelTree(Directory direc, Controller controller) {
		setLayout(new BorderLayout());
		rootNode = new DefaultMutableTreeNode(direc);
		modelo = new DefaultTreeModel(rootNode);
		jtree = new JTree(modelo);
		jtree.addMouseListener(controller);


	}

	public String getPath() {
		return jtree.getSelectionPath().toString();
	}

	public void paintTree(Tree<Directory> treeDirectory) {
		paintTree(treeDirectory.getRoot(), rootNode);
		jtree.expandRow(0);
		add(jtree, BorderLayout.CENTER);
	}

	public void paintTree(Node<Directory> nodeAux, DefaultMutableTreeNode nodeJtree) {
		if (nodeAux != null) {
			for (Node<Directory> nodeMedicine : nodeAux.getChildren()) {
				DefaultMutableTreeNode mutableNode = addNodetoJTree(nodeMedicine);
				nodeJtree.add(mutableNode);
				paintTree(nodeMedicine, mutableNode);
			}
		}
	}

	public DefaultMutableTreeNode addNodetoJTree(Node<Directory> nodeDirectory) {
		Directory directory = nodeDirectory.getInfo();
		return new DefaultMutableTreeNode(directory.toString());
	}
}
