import java.awt.BorderLayout;

import javax.swing.*;
public class Gui1 {

 public static void main(String[] args) {
	
	 JFrame frame=new JFrame();
//	 JPanel panel=new JPanel();
	 JButton button=new JButton("Click Me");
	 frame.add(button);
	 //JRadioButton,JCheckBox,JLabel,JList,JScrollPane
	 //JSlider,JTextArea,JTextField,JTable
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	 frame.add(BorderLayout.SOUTH, button);
	 frame.setSize(300, 300);
	 frame.setVisible(true);
	 
	 //	button.setText("praveen");
 } 
} 
