package com.example.studentmanagement.view;

import javax.swing.*;

import com.example.studentmanagement.util.Toast;

import java.awt.*;

public class WelcomeScreen extends JFrame {

  public WelcomeScreen() {
    setTitle("Student Management System");
    setSize(1920, 1080);
    setMinimumSize(new Dimension(600, 400));
    setLayout(new BorderLayout());

    JLabel title = new JLabel("Welcome to Student Management System", SwingConstants.CENTER);
    title.setFont(new Font("Arial", Font.BOLD, 36));
    add(title, BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 300, 0));

    JButton loginBtn = new JButton("Login");
    JButton registerBtn = new JButton("Register");

    buttonPanel.add(loginBtn);
    buttonPanel.add(registerBtn);
    add(buttonPanel, BorderLayout.SOUTH);

    loginBtn.addActionListener(e -> {
        dispose();
        Toast.showToast("Login button clicked!", 2000); // 2 sec toast
        // new LoginForm();
    });

    registerBtn.addActionListener(e -> {
        dispose();
        // new RegisterForm();
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null); // center screen
    setVisible(true);
}
}