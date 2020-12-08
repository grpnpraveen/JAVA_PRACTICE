import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstGui implements ActionListener{
	int count=0;
	 private JLabel lable;
	 private JFrame frame;
	 private JPanel panel;
	  public void GUI() {
		  
		  frame =new JFrame();
		   panel=new JPanel();
		  JButton button=new JButton("Click Me");
		  lable=new JLabel("Number of Clicks:0");
		  
		  button.addActionListener(this);
		  
		  panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		  panel.setLayout(new GridLayout(0,1));
		  panel.add(button);
		  panel.add(lable);
		  
		  frame.add(panel,BorderLayout.CENTER);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setTitle("My FIRST GUI");
		  frame.pack();
		  frame.setVisible(true);
	  }
	
	
	  
	  
	  
	  
	  public static void main(String[] args) {
		
       FirstGui z=new FirstGui();
       z.GUI();
	}






	@Override
	public void actionPerformed(ActionEvent e) {
		
		count++;
		lable.setText("Number of clicks"+count);
	}

}
