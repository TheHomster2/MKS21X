import javax.swing.*;
import java.awt.*;
public class Temp extends JFrame{
 
 private Container pane;
 private JButton b;
 private JLabel l;
 private JTextField t;
 private JCheckBox c;

 public Window2() {
     this.setTitle("My first GUI");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);

     b = new JButton("Do Nothing");
     l = new JLabel("This is AWESOME! (lies)",null,JLabel.CENTER);
     t = new JTextField(12);
     c = new JCheckBox("Overclock!!!");
     pane.add(l);
     pane.add(b);
     pane.add(t);
     pane.add(c);
 }

  public static void main(String[] args) {
     Window2 g = new Window2();
     g.setVisible(true);
  }
}


