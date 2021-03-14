package swing_study02.component.JLabelJButton;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyButton extends JButton{
	
	private String path = System.getProperty("user.dir") + File.separator + "images" + File.separator;
	
	
	public MyButton() {
		setIcon(new ImageIcon(path + "button1.gif"));
		setRolloverIcon(new ImageIcon(path + "button2.gif"));
		setPressedIcon(new ImageIcon(path + "button3.gif"));
	}
}
