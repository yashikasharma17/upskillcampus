package banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fast extends JFrame implements ActionListener {
    String pin;
    String Form_No;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    fast(String pin){
        this.pin=pin;
        JLabel l1=new JLabel("SELECT YOUR AMOUNT FOR TRANSACTION ");
        l1.setForeground(Color.white);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setBounds(100,40,750,70);
        add(l1);

        b1=new JButton("RS 100");
        b1.setFont(new Font("Raleway",Font.BOLD,23));
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.black);
        b1.setBounds(100,150,300,50);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("RS 500");
        b2.setFont(new Font("Raleway",Font.BOLD,23));
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.BLACK);
        b2.setBounds(100,250,300,50);
        b2.addActionListener(this);
        add(b2);


        b4=new JButton("RS 1000");
        b4.setFont(new Font("Raleway",Font.BOLD,23));
        b4.setBackground(Color.yellow);
        b4.setForeground(Color.black);
        b4.setBounds(550,150,300,50);
        b4.addActionListener(this);
        add(b4);

        b5=new JButton("RS 2000");
        b5.setFont(new Font("Raleway",Font.BOLD,23));
        b5.setBackground(Color.yellow);
        b5.setForeground(Color.BLACK);
        b5.setBounds(550,250,300,50);
        b5.addActionListener(this);
        add(b5);

        b6=new JButton("RS 5000");
        b6.setFont(new Font("Raleway",Font.BOLD,25));
        b6.setBackground(Color.yellow);
        b6.setForeground(Color.BLACK);
        b6.setBounds(550,350,300,50);
        b6.addActionListener(this);
        add(b6);

        b8=new JButton("RS 10000");
        b8.setFont(new Font("Raleway",Font.BOLD,25));
        b8.setBackground(Color.yellow);
        b8.setForeground(Color.BLACK);
        b8.setBounds(100,350,300,50);
        b8.addActionListener(this);
        add(b8);

        b7=new JButton("BACK");
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
            if(e.getSource()==b7){
                new home(pin,Form_No);
                setVisible(false);
            }
            else{
                String money=((JButton)e.getSource()).getText().substring(3);
                connecting c=new connecting();
                Date date =new Date();
                ResultSet rs=c.statement.executeQuery("select * from deposit11 where PIN='"+pin+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("deposit")){
                        balance+=Integer.parseInt(rs.getString("money"));
                    }
                   else{
                        balance -=Integer.parseInt(rs.getString("money"));
                        JOptionPane.showMessageDialog(null,"RS."+money+" withdrawn successfully");
                        return;
                    }
                   String num="17";
                   if(e.getSource()!=b7 && balance<Integer.parseInt(money)){
                       JOptionPane.showMessageDialog(null,"YOUR BALANCE IS LESS THAN THE AMOUNT BEING WITHDRAWN");
                       return;
                   }
                }
           c.statement.executeUpdate("insert into deposit11 values('"+pin+"','"+date+"','withdraw','"+money+"')");


            }



        }catch(Exception E ){
            E.printStackTrace();
        }
        setVisible(false);
        new home(pin,Form_No);

    }

    public static void main(String[] args) {
        new fast("");
    }

}
