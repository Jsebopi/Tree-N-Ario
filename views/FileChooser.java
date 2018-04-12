package views;

import javax.swing.JDialog;
import javax.swing.JFileChooser;

import controller.Controller;

public class FileChooser extends JDialog{

	private static final long serialVersionUID = 1L;
	public JFileChooser jFileChooser;

	public FileChooser(Controller controller){
		setSize(800,400);
		setLocationRelativeTo(null);
		setModal(true);
		jFileChooser = new JFileChooser();
		jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	}


	public String getPathFile(){
		int selection = jFileChooser.showOpenDialog(this);
		if(selection == JFileChooser.APPROVE_OPTION){
			return jFileChooser.getSelectedFile().getPath();
		}else {
			return null;
		}
	}
	
	public String showSaveFile() throws Exception{
		int selection = jFileChooser.showSaveDialog(this);
		if(selection == JFileChooser.APPROVE_OPTION){
			return jFileChooser.getSelectedFile().getPath();
		}else
			throw new Exception("Archivo sin seleccionar");
	}
}