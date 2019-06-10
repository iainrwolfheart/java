// import java.awt.Frame;
// import java.awt.Color;
// import java.awt.Button;
import java.awt.*;
import java.awt.event.*;

class Windows7{
    public static void main(String args[]){
        Frame win=new Frame();
        Button b1=new Button("North");
        Button b2=new Button("South");
        Button b3=new Button("East");
        Button b4=new Button("West");
        Button b5=new Button("Middle Earth");
        Action1 E=new Action1();
        b1.addActionListener(E);
        b2.addActionListener(E);
        b3.addActionListener(E);
        b4.addActionListener(E);
        b5.addActionListener(E);
        win.add(b1, BorderLayout.NORTH);
        win.add(b2, BorderLayout.SOUTH);
        win.add(b3, BorderLayout.EAST);
        win.add(b4, BorderLayout.WEST);
        win.add(b5, BorderLayout.CENTER);
        win.setSize(600,400);
        win.setBackground(Color.blue);
        win.setVisible(true);
    }
}
class Action1 implements ActionListener{
    public void actionPerformed(ActionEvent x){
        System.out.println("Hello my friends");
    }
}