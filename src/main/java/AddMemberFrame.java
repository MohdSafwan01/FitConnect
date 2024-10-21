import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMemberFrame extends JFrame {
    public AddMemberFrame() {
        setTitle("Add Member");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField(20);
        JLabel membershipLabel = new JLabel("Membership Type:");
        JTextField membershipField = new JTextField(20);
        JButton addButton = new JButton("Add Member");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String membershipType = membershipField.getText();

                // Call the method to add a member to the database
                // Add your database logic here

                JOptionPane.showMessageDialog(null, "Member added successfully!");
                dispose(); // Close the frame
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(membershipLabel);
        panel.add(membershipField);
        panel.add(new JLabel()); // Empty cell
        panel.add(addButton);

        add(panel);
        setVisible(true);
    }
}
