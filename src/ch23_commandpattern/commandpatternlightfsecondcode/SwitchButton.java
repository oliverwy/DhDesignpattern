package ch23_commandpattern.commandpatternlightfsecondcode;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchButton extends JFrame {

    private JPanel contentPane;
    private Line line;

    /**
     * Create the frame.
     */
    public SwitchButton() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        line = new Line();

        JButton btnNewButton = new JButton("开音响");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                line.connect();
            }
        });
        btnNewButton.setBounds(116, 120, 117, 29);
        contentPane.add(btnNewButton);

        JButton button = new JButton("关音响");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                line.disconnect();
            }
        });
        button.setBounds(245, 120, 117, 29);
        contentPane.add(button);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SwitchButton frame = new SwitchButton();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
