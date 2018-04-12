package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import controller.Controller;
import model.Node;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;

	private DefaultTreeModel treeModel;
	private JTree tree;
	private JButton btnDirect;
	private JPanel panel;

	public Window(Controller controller) {
		setSize(300, 400);
		setTitle("Directorio");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(280, 400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		btnDirect = new JButton("Selecciona el Directorio");
		btnDirect.setActionCommand("DIREC");
		btnDirect.addActionListener(controller);


		tree = new JTree();
		tree.setModel(null);
		ScrollPane scroll = new ScrollPane();
		scroll.add(tree);

		panel.add(scroll);
		add(panel, BorderLayout.CENTER);
		add(btnDirect, BorderLayout.PAGE_END);
	}

	public void setData(Node root, ArrayList<String> files, HashSet<String> extensions) {
		DefaultMutableTreeNode father = new DefaultMutableTreeNode(root.getName());
		treeModel = new DefaultTreeModel(father);
		tree.setModel(treeModel);
		treeModel.setAsksAllowsChildren(true);
		int i = 0;
		for (String extension : extensions) {
			DefaultMutableTreeNode childs = new DefaultMutableTreeNode(extension);
			treeModel.insertNodeInto(childs, father, i);
			addFiles(childs, files, extensions);
			i++;
		}
	}

	private void addFiles(DefaultMutableTreeNode childs, ArrayList<String> files, HashSet<String> extensions) {

		int i = 0;
		for (String file : files) {
			if (childs.getUserObject().equals(getFileExtension(new File(file)))) {
				treeModel.insertNodeInto(new DefaultMutableTreeNode(file), childs, i);
				i++;
			}
		}
	}

	private String getFileExtension(File file) {
		String name = file.getName();
		try {
			return name.substring(name.lastIndexOf(".") + 1);
		} catch (Exception e) {
			return "";
		}
	}

}