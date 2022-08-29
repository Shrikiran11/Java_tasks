package com.cf.OOps;
interface Notepad{
	public abstract void writeFile(String s);
	public abstract void newFile();
	public abstract void saveFile();
	public abstract void openFile();
	public abstract void textSize(int size);
}
class Windows implements Notepad{
	public  void writeFile(String s) {
		System.out.println(" Windows os writing data "+s);
	}
	public  void newFile() {
		System.out.println(" Windows os create new File");
	}
	public  void saveFile() {
		System.out.println(" Windows os File Saved");
	}
	public  void openFile() {
		System.out.println(" Windows os file opened");
	}
	public  void textSize(int size) {
		System.out.println(" Windows os textSize modified by "+size);
	}
}
class Linux implements Notepad{
	public  void writeFile(String s) {
		System.out.println("Linux os writing data "+s);
	}
	public  void newFile() {
		System.out.println("Linux os create new File");
	}
	public  void saveFile() {
		System.out.println("Linux os File Saved");
	}
	public  void openFile() {
		System.out.println("Linux os file opened");
	}
	public  void textSize(int size) {
		System.out.println("Linux os textSize modified by "+size);
	}
}
class Mac implements Notepad{
	public  void writeFile(String s){
		System.out.println("Mac os writing data "+s);
	}
	public  void newFile() {
		System.out.println("Mac os create new File");
	}
	public  void saveFile() {
		System.out.println("Mac os File Saved");
	}
	public  void openFile() {
		System.out.println("Mac os file opened");
	}
	public  void textSize(int size) {
		System.out.println("Mac os textSize modified by "+size);
	}
}
public class UserInterface {
	public static void main(String[] args) {
		Notepad np=new Windows();
		np.writeFile("NotepadWindows");
		np.newFile();
		np.saveFile();
		np.openFile();
		np.textSize(8);
		Notepad linux=new Linux();
		linux.writeFile("Linux");
		linux.newFile();
		linux.saveFile();
		linux.openFile();
		linux.textSize(9);
		Notepad mac=new Mac();
		mac.writeFile("Mac");
		mac.newFile();
		mac.saveFile();
		mac.openFile();
		mac.textSize(5);
	}

}