package banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame implements ActionListener {
    String pin;
    String Form_No;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    home(String pin,String Form_No){
        this.Form_No=Form_No;
        this.pin=pin;
        JLabel l1=new JLabel("SELECT YOUR TRANSACTION ");
        l1.setForeground(Color.white);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setBounds(100,40,750,70);
        add(l1);

        b1=new JButton("DEPOSIT");
        b1.setFont(new Font("Raleway",Font.BOLD,23));
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.black);
        b1.setBounds(100,150,300,50);
       b1.addActionListener(this);
        add(b1);

        b2=new JButton("CASH WITHDRAWAL");
        b2.setFont(new Font("Raleway",Font.BOLD,23));
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.BLACK);
        b2.setBounds(100,250,300,50);
        b2.addActionListener(this);
        add(b2);


        b4=new JButton("MINI STATEMENT");
        b4.setFont(new Font("Raleway",Font.BOLD,23));
        b4.setBackground(Color.yellow);
        b4.setForeground(Color.black);
        b4.setBounds(550,150,300,50);
           b4.addActionListener(this);
        add(b4);

        b5=new JButton("BALANCE INQUIRY");
        b5.setFont(new Font("Raleway",Font.BOLD,23));
        b5.setBackground(Color.yellow);
        b5.setForeground(Color.BLACK);
        b5.setBounds(550,250,300,50);
         b5.addActionListener(this);
        add(b5);

        b6=new JButton("TRANSFER MONEY");
        b6.setFont(new Font("Raleway",Font.BOLD,25));
        b6.setBackground(Color.yellow);
        b6.setForeground(Color.BLACK);
        b6.setBounds(550,350,300,50);
         b6.addActionListener(this);
        add(b6);

        b3=new JButton("FAST CASH ");
        b3.setFont(new Font("Raleway",Font.BOLD,25));
        b3.setBackground(Color.yellow);
        b3.setForeground(Color.BLACK);
        b3.setBounds(550,450,300,50);
        b3.addActionListener(this);
        add(b3);

        b8=new JButton("CHANGE PIN ");
        b8.setFont(new Font("Raleway",Font.BOLD,25));
        b8.setBackground(Color.yellow);
        b8.setForeground(Color.BLACK);
        b8.setBounds(100,350,300,50);
        b8.addActionListener(this);
        add(b8);

        b7=new JButton("EXIT");
        b7.setFont(new Font("Raleway",Font.BOLD,25));
        b7.setBackground(Color.yellow);
        b7.setForeground(Color.BLACK);
        b7.setBounds(100,450,300,50);
         b7.addActionListener(this);
        add(b7);

        setLocation(300, 50);
        setLayout(null);
        setSize(900, 700);
        getContentPane().setBackground(new Color(5, 17, 241));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b1){
                new deposit(pin,Form_No);
            }
            else if(e.getSource()==b7){
                System.exit(0);
            }
         else   if(e.getSource()==b2){
                new withdraw(pin,Form_No);
            }
            else   if(e.getSource()==b5){
                new balance(pin,Form_No);
            }
            else   if(e.getSource()==b6){
                new try3();
            }
            else if(e.getSource()==b4){
                new statement(pin);
            }
            else if (e.getSource()==b8){
new pin(pin,Form_No);
            }
            else if (e.getSource()==b3){
new fast(pin);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new home("","");
    }
}
