package banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balance extends JFrame implements ActionListener {
    JLabel l2;
    String pin;
    JButton b2;
    String Form_No;
    balance(String pin,String Form_No){

        JLabel l1=new JLabel("THE BALANCE IN YOUR ACCOUNT IS :");
        l1.setForeground(Color.white);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setBounds(100,40,750,40);
        add(l1);

         l2=new JLabel();
        l2.setForeground(Color.white);
        l2.setFont(new Font("Raleway",Font.BOLD,30));
        l2.setBounds(100,150,750,40);
        add(l2);

        b2=new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.BOLD,20));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(320,450,200,30);
        b2.addActionListener(this);
        add(b2);
int balance=0;
try{
    connecting c=new connecting();
    ResultSet rs=c.statement.executeQuery("select * from deposit11 where PIN ='"+pin+"'");
    while(rs.next()) {
        if (rs.getString("type").equals("deposit")) {
            balance += Integer.parseInt(rs.getString("money"));
        } else {
            balance -= Integer.parseInt(rs.getString("money"));
        }
    }
}catch(Exception E){
    E.printStackTrace();
        }

l2.setText(""+balance);
this.pin=pin;
        setLocation(300, 50);
        setLayout(null);
        setSize(900, 700);
        getContentPane().setBackground(new Color(5, 5, 5));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
setVisible(false);
new home(pin,Form_No);
    }

    public static void main(String[] args) {
        new balance("","");
    }
}
