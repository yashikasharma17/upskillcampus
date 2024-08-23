package banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class try3 extends JFrame  {
  try3(){
 SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Bank Transfer Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame. setLocation(300, 50);

        frame. setSize(900, 700);
        frame.setLayout(new GridLayout(5, 2));

        // UI Components
        JLabel fromLabel = new JLabel("From Account:");
        JComboBox<String> fromAccountComboBox = new JComboBox<>();
        JLabel toLabel = new JLabel("To Account:");
        JComboBox<String> toAccountComboBox = new JComboBox<>();
        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountTextField = new JTextField();
        JButton transferButton = new JButton("Transfer");


        // Add components to the frame
        frame.add(fromLabel);
        frame.add(fromAccountComboBox);
        frame.add(toLabel);
        frame.add(toAccountComboBox);
        frame.add(amountLabel);
        frame.add(amountTextField);
        frame.add(new JLabel());
        frame.add(transferButton);


        // Load account data into combo boxes
        loadAccountData(fromAccountComboBox);
        loadAccountData(toAccountComboBox);

        // Transfer button action
        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fromAccount = (String) fromAccountComboBox.getSelectedItem();
                String toAccount = (String) toAccountComboBox.getSelectedItem();
                String amountStr = amountTextField.getText();

                if (fromAccount == null || toAccount == null || amountStr.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields.");
                    return;
                }

                double amount;
                try {
                    amount = Double.parseDouble(amountStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid amount.");
                    return;
                }

                if (transferMoney(fromAccount, toAccount, amount)) {
                    JOptionPane.showMessageDialog(frame, "Transfer successful.");
                    loadAccountData(fromAccountComboBox);
                    loadAccountData(toAccountComboBox);
                } else {
                    JOptionPane.showMessageDialog(frame, "Transfer failed.");
                }
            }
        });

        frame.setVisible(true);
    });
}

private static void loadAccountData(JComboBox<String> comboBox) {
    comboBox.removeAllItems();
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_system","root","Mrgrey7171");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT account_name FROM accounts3")) {

        while (rs.next()) {
            comboBox.addItem(rs.getString("account_name"));
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private static boolean transferMoney(String fromAccount, String toAccount, double amount) {
    if (fromAccount.equals(toAccount)) {
        JOptionPane.showMessageDialog(null, "Cannot transfer to the same account.");
        return false;
    }

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_system", "root", "Mrgrey7171");
         // Begin transaction
         Statement stmt = conn.createStatement()) {

        conn.setAutoCommit(false);

        // Check if the 'from' account has sufficient balance
        ResultSet rs = stmt.executeQuery("SELECT balance FROM accounts3 WHERE account_name = '" + fromAccount + "'");
        if (rs.next()) {
            double fromBalance = rs.getDouble("balance");
            if (fromBalance < amount) {
                conn.rollback();
                return false;
            }
        }

        // Deduct amount from 'from' account
        stmt.executeUpdate("UPDATE accounts3 SET balance = balance - " + amount + " WHERE account_name = '" + fromAccount + "'");

        // Add amount to 'to' account
        stmt.executeUpdate("UPDATE accounts3 SET balance = balance + " + amount + " WHERE account_name = '" + toAccount + "'");

        // Commit transaction
        conn.commit();
        return true;

    }

    catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    public static void main(String[] args) {
        new try3();

}
}
