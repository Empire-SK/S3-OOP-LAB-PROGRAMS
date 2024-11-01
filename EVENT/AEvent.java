import java.awt.*;
import java.awt.event.*;

class AEvent extends Frame implements ActionListener{

    TextField tf;
    AEvent(){

        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b= new Button("Click Me");
        b.setBounds(100,120,80,30);

        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Exit the program
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome Nice to Meet you");

    }

    public static void main(String args[]){
        new AEvent();
    }
}