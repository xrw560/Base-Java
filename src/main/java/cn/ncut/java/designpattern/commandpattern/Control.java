package cn.ncut.java.designpattern.commandpattern;

public interface Control {

	public void onButton(int slot);

	public void offButton(int slot);
	
	public void undoButton();
}
