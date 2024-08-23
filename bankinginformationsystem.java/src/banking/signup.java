package banking;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class signup extends JFrame implements ActionListener {

    JButton next;
    JTextField textname, fathername,email,marriage,number,state,city,pin,address;
    JDateChooser dateChooser;
    JRadioButton c1,c2,m1,m2;
    String money;
Random ran =new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    signup(String money){
this.money=money;
        JLabel label1 = new JLabel("REGISTRATION NO. "+ first);
        label1.setBounds(280, 50, 350, 50);
        label1.setFont(new Font("Arial", Font.BOLD, 27));
        label1.setForeground(Color.BLACK);
        add(label1);

        JLabel label2 = new JLabel("PAGE 1 ");
        label2.setBounds(280, 60, 350, 100);
        label2.setFont(new Font("Arial", Font.BOLD, 22));
        label2.setForeground(Color.BLACK);
        add(label2);

        JLabel label3 = new JLabel("PERSONAL DETAILS ");
        label3.setBounds(280, 100, 350, 100);
        label3.setFont(new Font("Arial", Font.BOLD, 22));
        label3.setForeground(Color.BLACK);
        add(label3);

        JLabel label4 = new JLabel("NAME ");
        label4.setBounds(160, 175, 350, 90);
        label4.setFont(new Font("Arial", Font.BOLD, 22));
        label4.setForeground(Color.BLACK);
        add(label4);

        textname =new JTextField(50);
        textname.setBounds(350, 205, 350, 29);
        textname.setFont(new Font("Arial", Font.BOLD, 22));
        textname.setForeground(Color.BLACK);
        add(textname);

        JLabel label5 = new JLabel(" FATHER NAME ");
        label5.setBounds(150, 205, 350, 90);
        label5.setFont(new Font("Arial", Font.BOLD, 22));
        label5.setForeground(Color.BLACK);
        add(label5);

        fathername =new JTextField(50);
        fathername.setBounds(350, 235, 350, 29);
        fathername.setFont(new Font("Arial", Font.BOLD, 22));
        fathername.setForeground(Color.BLACK);
        add(fathername);

        JLabel dob = new JLabel(" DATE OF BIRTH ");
        dob.setBounds(150, 235, 350, 90);
        dob.setFont(new Font("Arial", Font.BOLD, 22));
        dob.setForeground(Color.BLACK);
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(Color.BLACK);
        dateChooser.setBounds(350, 265, 350, 29);
        add(dateChooser);

        JLabel label6 = new JLabel(" GENDER ");
        label6.setBounds(150, 265, 350, 90);
        label6.setFont(new Font("Arial", Font.BOLD, 22));
        label6.setForeground(Color.BLACK);
        add(label6);

        c1=new JRadioButton("Male");
        c1.setBounds(400, 305, 60, 15);
        c1.setForeground(Color.BLACK);
        add(c1);

        c2=new JRadioButton("Female");
        c2.setBounds(500, 305, 80, 15);
        c2.setForeground(Color.BLACK);
        add(c2);

        ButtonGroup buttons=new ButtonGroup();
        buttons.add(c1);
        buttons.add(c2);

        JLabel marriage1 = new JLabel(" MARITAL STATUS ");
        marriage1.setBounds(150, 295, 350, 90);
        marriage1.setFont(new Font("Arial", Font.BOLD, 22));
        marriage1.setForeground(Color.BLACK);
        add(marriage1);

        m1=new JRadioButton("Single");
        m1.setBounds(400, 330, 80, 15);
        m1.setForeground(Color.BLACK);
        add(m1);

        m2=new JRadioButton("Married");
        m2.setBounds(500, 330, 80, 15);
        m2.setForeground(Color.BLACK);
        add(m2);

        ButtonGroup but=new ButtonGroup();
        but.add(m1);
        but.add(m2);


        JLabel email1 = new JLabel(" EMAIL ADDRESS ");
        email1.setBounds(150, 325, 350, 90);
        email1.setFont(new Font("Arial", Font.BOLD, 22));
        email1.setForeground(Color.BLACK);
        add(email1);

        email =new JTextField(50);
        email.setBounds(358, 355, 350, 29);
        email.setFont(new Font("Arial", Font.BOLD, 22));
        email.setForeground(Color.BLACK);
        add(email);

        JLabel number1= new JLabel("PHONE NUMBER ");
        number1.setBounds(150, 355, 350, 90);
        number1.setFont(new Font("Arial", Font.BOLD, 22));
        number1.setForeground(Color.BLACK);
        add(number1);

        number =new JTextField(50);
        number.setBounds(358, 385, 350, 29);
        number.setFont(new Font("Arial", Font.BOLD, 22));
        number.setForeground(Color.BLACK);
        add(number);

        JLabel address1 = new JLabel(" ADDRESS ");
        address1.setBounds(150, 385, 350, 90);
        address1.setFont(new Font("Arial", Font.BOLD, 22));
        address1.setForeground(Color.BLACK);
        add(address1);

        address =new JTextField(50);
        address.setBounds(358, 415, 350, 29);
        address.setFont(new Font("Arial", Font.BOLD, 22));
        address.setForeground(Color.BLACK);
        add(address);

        JLabel state1 = new JLabel(" STATE ");
        state1.setBounds(150, 415, 350, 90);
        state1.setFont(new Font("Arial", Font.BOLD, 22));
        state1.setForeground(Color.BLACK);
        add(state1);

        state =new JTextField(50);
        state.setBounds(358, 445, 350, 29);
        state.setFont(new Font("Arial", Font.BOLD, 22));
        state.setForeground(Color.BLACK);
        add(state);

        JLabel city1 = new JLabel(" CITY ");
        city1.setBounds(150, 445, 350, 90);
        city1.setFont(new Font("Arial", Font.BOLD, 22));
        city1.setForeground(Color.BLACK);
        add(city1);

        city =new JTextField(50);
        city.setBounds(358, 475, 350, 29);
        city.setFont(new Font("Arial", Font.BOLD, 22));
        city.setForeground(Color.BLACK);
        add(city);

        JLabel pin1 = new JLabel(" PIN ");
        pin1.setBounds(150, 475, 350, 90);
        pin1.setFont(new Font("Arial", Font.BOLD, 22));
        pin1.setForeground(Color.BLACK);
        add(pin1);

        pin =new JTextField(50);
        pin.setBounds(358, 505, 350, 29);
        pin.setFont(new Font("Arial", Font.BOLD, 22));
        pin.setForeground(Color.BLACK);
        add(pin);

        next=new JButton("NEXT");
        next.setBounds(400, 570, 200, 40);
        next.setFont(new Font("Arial", Font.BOLD, 15));
        next.setForeground(Color.white);
        next.setBackground(Color.black);
        next.addActionListener(this);
        add(next);





        getContentPane().setBackground(new Color(248, 232, 211));
        setLocation(300, 50);
        setTitle("Registration Form ");
        setLayout(null);
        setSize(900, 700);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       String Form_No=first;
       String Name=textname.getText();
        String Father_Name=fathername.getText();
        String Date_of_birth=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(c1.isSelected()){
            gender = "Male";
        }
        else{
            gender="Female";
        }
        String Marital_Status=null;
        if(m1.isSelected()){
            Marital_Status = "Single";
        }
        else{
            Marital_Status="Married";
        }
        String Email=email.getText();
        String Phone_Number=number.getText();
        String Address=address.getText();
        String State=state.getText();
        String City=city.getText();
        String PIN=pin.getText();


        try{
            if (textname.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                connecting c = new connecting();
                String q = "insert into signup values('"+Form_No+"', '"+Name+"', '"+Father_Name+"','"+Date_of_birth+"','"+gender+"','"+Marital_Status+"','"+Email+"','"+Phone_Number+"','"+Address+"','"+State+"','"+City+"','"+PIN+"')";




                c.statement.executeUpdate(q);

                new signup2(Form_No);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }




    public static void main(String[] args) throws IOException {
        new signup("");
    }
}

