//import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//counter class
public class Counter implements ActionListener {
  //Declare and initialize variables
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

  Counter() {
    //create frame and initialize
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200, 110);

    //declare and initialize left/right buttons
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    //add actionListeners to the buttons
    left.addActionListener(this);
    right.addActionListener(this);

    //add left/right buttons to the frame
    frame.add(left);
    frame.add(right);

    //initialize left/right labels
    leftLabel = new JLabel("Count: " + leftCount);
    rightLabel = new JLabel("Count: " + rightCount);

    //add labels to the frame
    frame.add(leftLabel);
    frame.add(rightLabel);

    //declare and initialize reset buttons
    JButton reset = new JButton("Reset");

    //add actionListener for reset buttons
    reset.addActionListener(this);

    //add reset button to the frame
    frame.add(reset);

    //set frame to be visible
    frame.setVisible(true);
  }

//change counters depending on action performed
public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Left")) {
    leftCount += 1;
    leftLabel.setText("Count: " + leftCount);
  } else if (ae.getActionCommand().equals("Right")) {
    rightCount += 1;
    rightLabel.setText("Count: "+ rightCount);
  } else {
    leftCount = 0;
    rightCount = 0;
    leftLabel.setText("Count: " + leftCount);
    rightLabel.setText("Count: "+ rightCount);
  }
}
}