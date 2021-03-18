package ch02_strategepattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChargeSystem {

    private JFrame frame;
    private JTextField txtPrice;
    private JTextField txtNum;

    /**
     * Create the application.
     */
    public ChargeSystem() {
        initialize();
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ChargeSystem window = new ChargeSystem();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("商场收费系统");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("单价：");
        lblNewLabel.setBounds(21, 21, 61, 16);
        frame.getContentPane().add(lblNewLabel);

        txtPrice = new JTextField();
        txtPrice.setBounds(113, 16, 130, 26);
        frame.getContentPane().add(txtPrice);
        txtPrice.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("数量：");
        lblNewLabel_1.setBounds(21, 49, 61, 16);
        frame.getContentPane().add(lblNewLabel_1);

        txtNum = new JTextField();
        txtNum.setBounds(113, 44, 130, 26);
        frame.getContentPane().add(txtNum);
        txtNum.setColumns(10);

        JList lbxlist = new JList();
        lbxlist.setBounds(21, 77, 412, 151);
        frame.getContentPane().add(lbxlist);

        JLabel lblNewLabel_2 = new JLabel("总计：");
        lblNewLabel_2.setBounds(21, 240, 61, 16);
        frame.getContentPane().add(lblNewLabel_2);

        JLabel lblSum = new JLabel("");
        lblSum.setBounds(67, 240, 256, 16);
        frame.getContentPane().add(lblSum);

        DefaultListModel listModel = new DefaultListModel();
        lbxlist.setModel(listModel);
        JButton btnOk = new JButton("确定");
        btnOk.addMouseListener(new MouseAdapter() {
            float total = 0;

            @Override
            public void mouseClicked(MouseEvent e) {
                float totalPrice = Float.valueOf(txtPrice.getText()) * Float.valueOf(txtNum.getText());
                total = total + totalPrice;
                listModel.addElement("单价：" + txtPrice.getText() + "数量：" + txtNum.getText() + " 合计：" + String.valueOf(totalPrice));
                lblSum.setText(String.valueOf(total));
            }
        });
        btnOk.setBounds(291, 16, 117, 29);
        frame.getContentPane().add(btnOk);

        JButton btnReset = new JButton("重置");
        btnReset.setBounds(291, 44, 117, 29);
        frame.getContentPane().add(btnReset);

        JList list = new JList();
        list.setBounds(336, 21, 1, 1);
        frame.getContentPane().add(list);
    }
}
