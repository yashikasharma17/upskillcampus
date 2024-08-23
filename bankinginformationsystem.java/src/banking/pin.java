package banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pin extends JFrame implements ActionListener{
    JButton b1,b2;
    String pin;
    String Form_No;
    JPasswordField p1,p2;
    pin(String pin,String Form_No){

        JLabel l1=new JLabel("ENTER YOUR NEW PIN: ");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setBounds(100,40,750,40);
        add(l1);

        JLabel l2=new JLabel("NEW PIN:  ");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Raleway",Font.BOLD,30));
        l2.setBounds(100,150,750,40);
        add(l2);

        p1= new JPasswordField(50);
        p1.setBounds(420, 150, 250, 40);
        p1.setFont(new Font("Arial", Font.BOLD, 15));
        p1.setForeground(Color.BLACK);
        add(p1);

        JLabel l3=new JLabel("RE-ENTER NEW PIN:  ");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Raleway",Font.BOLD,30));
        l3.setBounds(100,250,750,40);
        add(l3);

        p2= new JPasswordField(50);
        p2.setBounds(420, 250, 250, 40);
        p2.setFont(new Font("Arial", Font.BOLD, 15));
        p2.setForeground(Color.BLACK);
        add(p2);

        b1=new JButton("SUBMIT");
        b1.setFont(new Font("Raleway",Font.BOLD,20));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(320,400,200,30);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.BOLD,20));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(320,450,200,30);
        b2.addActionListener(this);
        add(b2);

        this.pin=pin;
        setLocation(300, 50);
        setLayout(null);
        setSize(900, 700);
        getContentPane().setBackground(new Color(224, 224, 230));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();
            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "ENTER THE PIN PROPERLY");
                return;
            }
            if (e.getSource() == b1) {
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "FILL THE PIN PROPERLY");
                }


                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "FILL THE RE-PIN PROPERLY");
                } else {
                    connecting c = new connecting();
                    String q = "Update signup set PIN ='" + pin1 + "'where PIN='" + pin + "'";
                    String q2 = "Update login011 set PIN ='" + pin1 + "'where PIN='" + pin + "'";
                    String q3 = "Update deposit11 set PIN ='" + pin1 + "'where PIN='" + pin + "'";
                    c.statement.executeUpdate(q);
                    c.statement.executeUpdate(q2);
                    c.statement.executeUpdate(q3);

                    JOptionPane.showMessageDialog(null, "PIN CHANGED SUCCESSFULLY");
                    setVisible(false);
                    new home(pin, Form_No);
                }
            }
 if(e.getSource()==b2){
     new home(pin,Form_No);
     setVisible(false);
 }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new pin("","");
    }
}
