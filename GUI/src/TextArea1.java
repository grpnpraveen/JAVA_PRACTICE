import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextArea1 implements ActionListener {
 JTextArea text;
 public static void main (String[] args) {
 TextArea1 gui = new TextArea1();
 gui.go();
 }
 public void go() {
 JFrame frame = new JFrame();
 JPanel panel = new JPanel();
 JButton button = new JButton("Just Click It");
 button.addActionListener(this);
 text = new JTextArea(25,40);
 text.setLineWrap(true);

 JScrollPane scroller = new JScrollPane(text);
 scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
 scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

 panel.add(scroller);

 frame.add(BorderLayout.CENTER, panel);
 frame.add(BorderLayout.SOUTH, button);

 frame.setSize(600,500);
 frame.setVisible(true);
 }
 public void actionPerformed(ActionEvent ev) {
 text.append("\n________Praveen clicked \n ");
 }
}