package banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JComboBox combo1,combo2,combo3,combo4,combo5,combo6;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    JTextField textPan,textAadhar;
    String Form_No;
    String money;
    signup2(String Form_No){
        JLabel l2 = new JLabel("PAGE 2 ");
        l2.setBounds(280, 60, 350, 100);
        l2.setFont(new Font("Arial", Font.BOLD, 22));
        l2.setForeground(Color.DARK_GRAY);
        add(l2);

        JLabel l3 = new JLabel("ADDITIONAL DETAILS ");
        l3.setBounds(280, 100, 350, 100);
        l3.setFont(new Font("Arial", Font.BOLD, 22));
        l3.setForeground(Color.DARK_GRAY);
        add(l3);

        JLabel l4 = new JLabel("Religion: ");
        l4.setBounds(160, 195, 350, 90);
        l4.setFont(new Font("Arial", Font.BOLD, 22));
        l4.setForeground(Color.DARK_GRAY);
        add(l4);

        String Religion[]={"Hindu","Muslim","Christian","Sikh"};
        combo1=new JComboBox<>(Religion);
        combo1.setBounds(350, 225, 150, 35);
        combo1.setFont(new Font("Arial", Font.BOLD, 14));
        combo1.setBackground(new Color(0xD0BCF3));
        add(combo1);

        JLabel l5 = new JLabel("Community: ");
        l5.setBounds(160, 225, 350, 90);
        l5.setFont(new Font("Arial", Font.BOLD, 22));
        l5.setForeground(Color.GRAY);
        add(l5);

        String Community[]={"General","SC","ST","OBC","Other"};
        combo2=new JComboBox<>(Community);
        combo2.setBounds(350, 255, 150, 35);
        combo2.setFont(new Font("Arial", Font.BOLD, 14));
        combo2.setBackground(new Color(0xD0BCF3));
        add(combo2);

        JLabel l6 = new JLabel("Income : ");
        l6.setFont(new Font("Arial", Font.BOLD,22));
        l6.setBounds(160,260,350,90);
        l5.setForeground(Color.BLACK);
        add(l6);

        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        combo3 = new JComboBox(income);
        combo3.setBackground(new Color(0xD0BCF3));
        combo3.setFont(new Font("Arial",Font.BOLD,14));
        combo3.setBounds(350,290,150,35);
        add(combo3);

        JLabel l7 = new JLabel("Educational : ");
        l7.setFont(new Font("Arial", Font.BOLD,22));
        l7.setBounds(160,290,350,90);
        l5.setForeground(Color.BLACK);
        add(l7);

        String educational [] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        combo4 = new JComboBox(educational);
        combo4.setBackground(new Color(0xD0BCF3));
        combo4.setFont(new Font("Arial",Font.BOLD,14));
        combo4.setBounds(350,320,150,35);
        add(combo4);


        JLabel l8 = new JLabel("Occupation : ");
        l8.setFont(new Font("Arial", Font.BOLD,22));
        l8.setBounds(160,320,350,90);
        l5.setForeground(Color.BLACK);
        add(l8);

        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        combo5 = new JComboBox(Occupation);
        combo5.setBackground(new Color(0xD0BCF3));
        combo5.setFont(new Font("Arial",Font.BOLD,14));
        combo5.setBounds(350,350,150,35);
        add(combo5);

        JLabel l9 = new JLabel("PAN Number : ");
        l9.setFont(new Font("Arial", Font.BOLD,22));
        l9.setBounds(160,360,350,90);
        l5.setForeground(Color.BLACK);
        add(l9);

        textPan = new JTextField();
        textPan.setFont(new Font("Arial", Font.BOLD,18));
        textPan.setBounds(350,390,150,35);
        add(textPan);

        JLabel l10 = new JLabel("Aadhar Number : ");
        l10.setFont(new Font("Arial", Font.BOLD,22));
        l10.setBounds(160,410,350,90);
        l5.setForeground(Color.BLACK);
        add(l10);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Arial", Font.BOLD,18));
        textAadhar.setBounds(350,440,150,30);
        add(textAadhar);


        JLabel l11 = new JLabel("Senior Citizen : ");
        l11.setFont(new Font("Arial", Font.BOLD,22));
        l11.setBounds(160,470,350,90);
        l5.setForeground(Color.BLACK);
        add(l11);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Arial", Font.BOLD,14));
        r1.setBackground(new Color(0xD0BCF3));
        r1.setBounds(350,490,100,30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Arial", Font.BOLD,14));
        r2.setBackground(new Color(0xD0BCF3));
        r2.setBounds(460,490,100,30);
        add(r2);

        JLabel l12 = new JLabel("Existing Account : ");
        l12.setFont(new Font("Arial", Font.BOLD,22));
        l12.setBounds(150,518,350,80);
        add(l12);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Arial", Font.BOLD,14));
        e1.setBackground(new Color(0xD0BCF3));
        e1.setBounds(350,540,100,30);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Arial", Font.BOLD,14));
        e2.setBackground(new Color(0xD0BCF3));
        e2.setBounds(460,540,100,30);
        add(e2);

        JLabel l13 = new JLabel("Form No : ");
        l13.setFont(new Font("Arial", Font.BOLD,14));
        l13.setBounds(700,10,100,30);
        add(l13);

        JLabel l14 = new JLabel(Form_No);
        l14.setFont(new Font("Arial", Font.BOLD,14));
        l14.setBounds(760,10,60,30);
        add(l14);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,600,100,30);
        next.addActionListener(this);
        add(next);


        this.Form_No=Form_No;
        setLocation(300, 50);
        setLayout(null);
        setSize(900, 700);
        getContentPane().setBackground(new Color(153, 234, 231));
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) combo1.getSelectedItem();
        String cate = (String) combo2.getSelectedItem();
        String inc = (String) combo3.getSelectedItem();
        String edu = (String) combo4.getSelectedItem();
        String occ = (String) combo5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount ="No";
        }

        try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                connecting c = new connecting();
                String q = "insert into signup2 values('"+Form_No+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c.statement.executeUpdate(q);
                new signup3(Form_No,money);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }


    }
    public static void main(String[] args) {
        new signup2("");
    }
}
