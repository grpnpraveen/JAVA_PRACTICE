import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class QuizCard implements Serializable {

 
    private String question;
    private String answer;


    public QuizCard(String q, String a) {
        question = q;
        answer = a;
   }


    public String getQuestion() {
       return question;
    }

  

    public String getAnswer() {
       return answer;
    }

    public static void main (String[] args) {
    	
    }
}    

class QuizCardBuilder {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList cardList;
    private JFrame frame;
    
    public static void main (String[] args) {
       QuizCardBuilder builder = new QuizCardBuilder();
       builder.go();
    }
    
    public void go() {

        frame = new JFrame("Quiz Card Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // title bar
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);
        question = new JTextArea(6,20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);
       
        JScrollPane qScroller = new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(
                  ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(
                  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        answer = new JTextArea(6,20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);
       
        JScrollPane aScroller = new JScrollPane(answer);
        aScroller.setVerticalScrollBarPolicy(
                  ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(
                  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nextButton = new JButton("Next Card");
        cardList = new ArrayList();
        JLabel qLabel = new JLabel("Question:");
        JLabel aLabel = new JLabel("Answer:");
        
        mainPanel.add(qLabel);
        mainPanel.add(qScroller);
        mainPanel.add(aLabel);
        mainPanel.add(aScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        
        JMenuItem saveMenuItem = new JMenuItem("Save");
        newMenuItem.addActionListener(new NewMenuListener());
        saveMenuItem.addActionListener(new SaveMenuListener());

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
    
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500,600);
        frame.setVisible(true);        
    }


    public class NextCardListener implements ActionListener {
       public void actionPerformed(ActionEvent ev) {
          QuizCard card = new QuizCard(question.getText(), answer.getText());
          cardList.add(card);
          clearCard();
          
        }
     }

     public class SaveMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
           QuizCard card = new QuizCard(question.getText(), answer.getText());
           cardList.add(card);
       
           JFileChooser fileSave = new JFileChooser();
           fileSave.showSaveDialog(frame);
           saveFile(fileSave.getSelectedFile());
        }
     }

    public class NewMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
           cardList.clear();
           clearCard();           
        }
    }

    
    private void clearCard() {
       question.setText("");
       answer.setText("");
       question.requestFocus();
    }

    private void saveFile(File file) {
         
       try {
          BufferedWriter writer = new BufferedWriter(new FileWriter(file));
          Iterator cardIterator = cardList.iterator();
          while (cardIterator.hasNext()) {
             QuizCard card = (QuizCard) cardIterator.next();
             writer.write(card.getQuestion() + "/");
             writer.write(card.getAnswer() + "\n");
          }
         writer.close();


       } catch(IOException ex) {
           System.out.println("couldn't write the cardList out");
           ex.printStackTrace();
       }
       
    } 
}

class QuizCardReader {

    private JTextArea display;
    private JTextArea answer;
    private ArrayList cardList;
    private QuizCard currentCard;
    private Iterator cardIterator;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;



    public static void main (String[] args) {
       QuizCardReader qReader = new QuizCardReader();
       qReader.go();
    }
    
    public void go() {

        frame = new JFrame("Quiz Card Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        display = new JTextArea(9,20);
        display.setFont(bigFont);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setEditable(false);
       
        JScrollPane qScroller = new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(
              ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(
              ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      
        nextButton = new JButton("Show Question");
        
        mainPanel.add(qScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        
        JMenuItem loadMenuItem = new JMenuItem("Load card set");
            
        loadMenuItem.addActionListener(new OpenMenuListener());
            
        fileMenu.add(loadMenuItem);
        
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
    
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500,600);
        frame.setVisible(true);        
    }


   public class NextCardListener implements ActionListener {
       public void actionPerformed(ActionEvent ev) {
          if (isShowAnswer) {
            
             display.setText(currentCard.getAnswer());
             nextButton.setText("Next Card");
             isShowAnswer = false;
          } else {
              
             if (cardIterator.hasNext()) {
                
                showNextCard();
                
              } else {
                
                 display.setText("That was last card");
                 nextButton.disable();
              }
           } 
        } 
     } 

  
   public class OpenMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
             JFileChooser fileOpen = new JFileChooser();
             fileOpen.showOpenDialog(frame);
             loadFile(fileOpen.getSelectedFile());
        }
    }

   private void loadFile(File file) {
      cardList = new ArrayList();
      try {
         BufferedReader reader = new BufferedReader(new FileReader(file));
         String line = null;
         while ((line = reader.readLine()) != null) {
            makeCard(line);
         }
         reader.close();

      } catch(Exception ex) {
          System.out.println("couldn't read the card file");
          ex.printStackTrace();
      }

     
     cardIterator = cardList.iterator();
     showNextCard();
   }

   private void makeCard(String lineToParse) {
   
      StringTokenizer parser = new StringTokenizer(lineToParse, "/");
      if (parser.hasMoreTokens()) {
         QuizCard card = new QuizCard(parser.nextToken(), parser.nextToken());
         cardList.add(card);
      }
   }

   private void showNextCard() {
        currentCard = (QuizCard) cardIterator.next();
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnswer = true;
   }
}