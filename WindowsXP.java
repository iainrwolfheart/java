import java.awt.*;
import java.awt.event.*;

class WindowsXP{
    public static void main(String args[]){

        Frame f = new Frame("Calculator");
        TextField t1, t2, t3;
        Label l1, l2, l3;

        Button b1 = new Button("=");
        l1 = new Label("First No.");
        l2 = new Label("Second No.");
        l3 = new Label("Result:");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        Ehandler e = new Ehandler(t1, t2, t3);
        b1.addActionListener(e);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(l3);
        f.add(t3);

        f.setSize(400,400);
        f.setVisible(true);
    }
}

class Ehandler implements ActionListener{
    TextField No1, No2, Result;

    public Ehandler(TextField A, TextField B, TextField C){
        No1=A;
        No2=B;
        Result=C;
    }
    public void actionPerformed (ActionEvent X){
        int a, b, c;
        a=Integer.parseInt(No1.getText());
        b=Integer.parseInt(No2.getText());
        c=a+b;
        Result.setText(Integer.toString(c));
    }
}