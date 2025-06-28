package com.example.studentmanagement.util;

import javax.swing.*;
import java.awt.*;

public class Toast {

    public static void showToast(String message, int durationMillis) {
        JWindow toast = new JWindow();
        toast.setLayout(new BorderLayout());

        JLabel label = new JLabel(message, SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setOpaque(true);
        label.setBackground(new Color(0, 0, 0, 170)); // semi-transparent black
        label.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        toast.add(label, BorderLayout.CENTER);
        toast.pack();

        // 🧭 Position: bottom center of screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - toast.getWidth()) / 2;
        int y = screenSize.height - toast.getHeight() - 100;
        toast.setLocation(x, y);

        toast.setAlwaysOnTop(true);
        toast.setVisible(true);

        // 💥 Auto-close
        new Timer(durationMillis, e -> toast.dispose()).start();
    }
}
