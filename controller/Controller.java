package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import models.ManageStructures;
import views.FileChooser;
import views.Window;

public class Controller implements ActionListener , MouseListener{
	private Window window;
	private FileChooser chooser;
	private ManageStructures manageStructures;
	
	public Controller() {
	manageStructures = new ManageStructures();
	chooser = new FileChooser(this);
	window = new Window(this, manageStructures.getMedicines().getRoot().getInfo());
	window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch (arg0.getActionCommand()) {
		case "DIREC":
			chooser.getPathFile();
			chooser.setVisible(true);
			
			break;

		default:
			break;
		}

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}