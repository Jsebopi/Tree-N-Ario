package views;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import controller.Controller;

public class FileChooser extends JDialog{

	private static final long serialVersionUID = 1L;
	public JFileChooser jFileChooser;

	public FileChooser(Controller controller){
		setSize(800,400);
		setLocationRelativeTo(null);
		setModal(true);
		FileNameExtensionFilter xml = new FileNameExtensionFilter(".xml", "xml");
		FileNameExtensionFilter json = new FileNameExtensionFilter(".jsn", "jsn");
		FileNameExtensionFilter bin = new FileNameExtensionFilter(".bin", "bin");
		FileNameExtensionFilter txt = new FileNameExtensionFilter(".txt", "txt");
		FileNameExtensionFilter jpg = new FileNameExtensionFilter(".jpg", "jpg");
		FileNameExtensionFilter png = new FileNameExtensionFilter(".png", "png");
		FileNameExtensionFilter exe = new FileNameExtensionFilter(".exe", "exe");
		jFileChooser = new JFileChooser();
		jFileChooser.setFileFilter(xml);
		jFileChooser.setFileFilter(json);
		jFileChooser.setFileFilter(bin);
		jFileChooser.setFileFilter(txt);
		jFileChooser.setFileFilter(jpg);
		jFileChooser.setFileFilter(png);
		jFileChooser.setFileFilter(exe);
		
		add(jFileChooser);
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
			throw new Exception("No se ha seleccionado ningun archivo");
	}
}