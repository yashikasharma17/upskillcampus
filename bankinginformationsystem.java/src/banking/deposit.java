package banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {
    JTextField amount;
    JButton b1,b2;
    String pin;
    String Form_No;
    deposit(String pin,String Form_No){
     JLabel l1=new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
     l1.setForeground(Color.white);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setBounds(100,40,750,40);
        add(l1);

        amount= new JTextField(50);
        amount.setBounds(150, 200, 500, 29);
        amount.setFont(new Font("Arial", Font.BOLD, 22));
        amount.setForeground(Color.black);
        add(amount);

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

this.Form_No=Form_No;
        this.pin=pin;
        setLocation(300, 50);
        setLayout(null);
        setSize(900, 700);
        getContentPane().setBackground(new Color(5, 5, 5));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
try{
    String money=amount.getText();
    Date date =new Date();
    if(e.getSource()==b1) {
        if (amount.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill all the fields");

        }else{
            connecting c = new connecting();
            c.statement.executeUpdate("insert into deposit11 values('"+pin+"', '"+date+"','deposit', '"+money+"')");
            JOptionPane.showMessageDialog(null,"Rs. "+money+" Deposited Successfully");
            new home(pin,Form_No);
            setVisible(false);

        }

    }
    else if (e.getSource()==b2){
        new home(pin,Form_No);
        setVisible(false);

    }
}catch(Exception E){
    E.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new deposit("","");
    }
}
