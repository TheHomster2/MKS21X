import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Temp extends JFrame implements ActionListener{
 
 private Container pane;
 private JTextField t;
 private JButton b;
 private JButton b2;
 private JTextField c;
 private JLabel a;

 public Temp() {
     this.setTitle("Temperature Conversion Window");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);

     pane = this.getContentPane();
     pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

     JLabel a = new JLabel();
     a.setText("Enter the temperature");
     t = new JTextField(5);

     JButton b = new JButton("Enter temperature to convert to Fahrenheit");
      b.addActionListener(this);
      b.setActionCommand("CtoF");
      JButton b2 = new JButton("Enter temperature to convert to Celsius");
      b2.addActionListener(this);
      b2.setActionCommand("FtoC");

     c = new JTextField();
     c.setText("Output");

     pane.add(a);
     pane.add(t);
     pane.add(b);
     pane.add(b2);
     pane.add(c);
  }

 public void actionPerformed(ActionEvent e){
   String event = e.getActionCommand();
   if(event.equals("CtoF")){
     String s = t.getText();
     double input = Integer.parseInt(s);
    double output = CtoF (input);
    c.setText("This is " + output + " degrees Fahrenheit");
   }
   else if(event.equals("FtoC")){
    String s = t.getText();
     double input = Integer.parseInt(s);
    double output = FtoC (input);
    c.setText("This is " + output + " degrees Celsius");
   }
   }

public static double CtoF(double t){
    return t * (9.0/5) + 32;
}

public static double FtoC(double t){
    return ((t - 32) * (5.0/9));
}

  public static void main(String[] args) {
     Temp g = new Temp();
     g.setVisible(true);
  }
}



