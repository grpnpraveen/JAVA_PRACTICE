import javax.swing.*;
import java.awt.event.*;
public class Gui2 implements ActionListener {
	JButton button;

	public void go()
	{
		JFrame frame=new JFrame();
		button=new JButton("Click Me");
		button.addActionListener(this);
	
		frame.getContentPane().add(button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(400,300);
		 frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		 button.setText("I�ve been clicked!");
		 }

public static void main(String[] args) {
		
		Gui2 gui=new Gui2();
		gui.go();
		
	}


}
