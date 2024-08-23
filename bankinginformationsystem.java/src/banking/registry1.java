package banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.Arrays;

import static java.lang.Math.*;
public class registry1 extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4;
    String Form_No;
    String money;
    JTextField textfield1, textfield2;
    JPasswordField passwordfield;
    JButton button1, button2, button3;

    registry1(String Form_No) {
        label1 = new JLabel("WELCOME TO NATIONAL BANK");
        label1.setBounds(280, 50, 350, 30);
        label1.setFont(new Font("Arial", Font.BOLD, 22));
        label1.setForeground(Color.BLACK);
        add(label1);

        label2 = new JLabel("ENTER NAME: ");
        label2.setBounds(150, 100, 200, 150);
        label2.setFont(new Font("Arial", Font.BOLD, 15));
        label2.setForeground(Color.BLACK);
        add(label2);

        textfield1 = new JTextField(50);
        textfield1.setBounds(320, 150, 200, 40);
        textfield1.setFont(new Font("Arial", Font.BOLD, 15));
        textfield1.setForeground(Color.BLACK);
        add(textfield1);
        String name= String.valueOf(textfield1);

        label3 = new JLabel("ENTER CARD NO. :  ");
        label3.setBounds(150, 200, 200, 150);
        label3.setFont(new Font("Arial", Font.BOLD, 15));
        label3.setForeground(Color.BLACK);
        add(label3);

        textfield2 = new JTextField(50);
        textfield2.setBounds(320, 250, 200, 40);
        textfield2.setFont(new Font("Arial", Font.BOLD, 15));
        textfield2.setForeground(Color.BLACK);
        add(textfield2);

        label4 = new JLabel("ENTER PIN:  ");
        label4.setBounds(150, 300, 200, 150);
        label4.setFont(new Font("Arial", Font.BOLD, 15));
        label4.setForeground(Color.BLACK);
        add(label4);

        passwordfield = new JPasswordField(50);
        passwordfield.setBounds(320, 360, 200, 40);
        passwordfield.setFont(new Font("Arial", Font.BOLD, 15));
        passwordfield.setForeground(Color.BLACK);
        add(passwordfield);

        button1 = new JButton("LOG IN");
        button1.setBounds(320, 450, 200, 40);
        button1.setFont(new Font("Arial", Font.BOLD, 15));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("SIGN UP");
        button2.setBounds(320, 500, 200, 40);
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("CLEAR");
        button3.setBounds(320, 550, 200, 40);
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.addActionListener(this);
        add(button3);
this.Form_No=Form_No;
        setLocation(300, 50);
        setTitle("Banking Information System");
        setLayout(null);
        setSize(900, 700);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==button1){
                connecting c= new connecting();
                String name=textfield1.getText();
                String card=textfield2.getText();
                String pin= passwordfield.getText();

                String q="select * from login011 where Card_Number= '"+card+"'and PIN= '"+pin+"'";
                ResultSet rs=c.statement.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new home(pin,Form_No);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }
        }
            else if(e.getSource()==button2){
                new signup(money);
                setVisible(false);
            }
            else if(e.getSource()==button3){
                textfield1.setText("");
                textfield2.setText("");
                passwordfield.setText("");

            }

        }
         catch(Exception E){
E.printStackTrace();
        }
        }

        public static void main (String[]args) throws IOException {
            new registry1("");
        }
    }


