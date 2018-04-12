package models;

public class Directory {
	private int idFather;
	private String nameDirectory;
	private String extension;
	private int heighDirectory;

	public Directory(int idFather, String nameDirectory, String extension, int heighDirectory) {
		this.idFather = idFather;
		this.nameDirectory = nameDirectory;
		this.extension = extension;
		this.heighDirectory = heighDirectory;
	}

	public int getIdFather() {
		return idFather;
	}

	public void setIdFather(int idFather) {
		this.idFather = idFather;
	}

	public String getNameDirectory() {
		return nameDirectory;
	}

	public void setNameDirectory(String nameDirectory) {
		this.nameDirectory = nameDirectory;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getHeighDirectory() {
		return heighDirectory;
	}

	public void setHeighDirectory(int heighDirectory) {
		this.heighDirectory = heighDirectory;
	}

	@Override
	public String toString() {
		return idFather + nameDirectory + extension + heighDirectory;
	}

}
