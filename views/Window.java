package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import controller.Controller;
import models.Directory;
import models.Tree;


public class Window extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanelTree jPanelTree;
	private Directory root;
	private JScrollPane scroll;
	private JButton btnFile;

	public Window(Controller controller, Directory root) {
		jPanelTree = new JPanelTree(root, controller);
		this.root = root;
		initComponents(controller);
		
	}

	private void initComponents(Controller controller) {
		setSize(300, 400);
		setTitle("Directorio");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(280, 400));
		scroll = new JScrollPane();
		scroll.setViewportView(jPanelTree);
		
		btnFile = new JButton("Seleccionar Directorio");
		btnFile.setActionCommand("DIREC");
		btnFile.addActionListener(controller);
		
		add(scroll);
		add(btnFile,BorderLayout.PAGE_END);

	}

	public void paintTree(Tree<Directory> tree, Controller controller) {
		jPanelTree = new JPanelTree(root, controller);
		jPanelTree.paintTree(tree);
		scroll.setViewportView(jPanelTree);
	}
}