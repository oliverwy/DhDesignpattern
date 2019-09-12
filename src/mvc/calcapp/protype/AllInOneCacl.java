package mvc.calcapp.protype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;


public class AllInOneCacl extends JFrame {

    private static final String INITIAL_VALUE = "1";

    private JTextField m_userInputTf = new JTextField(5);
    private JTextField m_totalTf = new JTextField(20);
    private JButton m_multiplyBtn = new JButton("乘");
    private JButton m_clearBtn = new JButton("清除");
    private BigInteger m_total; // 总乘积.

    /**
     * 创建窗口.
     */
    public AllInOneCacl() {

        // 初始化面板组件
        m_totalTf.setText(INITIAL_VALUE);
        m_totalTf.setEditable(false);

        // 在窗口上布局控件
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("输入整数:"));
        content.add(m_userInputTf);
        content.add(m_multiplyBtn);
        content.add(new JLabel("总乘积:"));
        content.add(m_totalTf);
        content.add(m_clearBtn);

        // ...添加按钮上的点击事件.
        m_multiplyBtn.addActionListener(new MultiplyListener());
        m_clearBtn.addActionListener(new ClearListener());

        // ... 完成布局并设置窗口信息并显示.
        this.setContentPane(content);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("所有功能都在一起实现的简单计算器");
        reset();
    }

    /**
     * 程序入口点.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AllInOneCacl frame = new AllInOneCacl();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void reset() {
        m_total = new BigInteger(INITIAL_VALUE);
    }

    class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                m_total = m_total.multiply(new BigInteger(m_userInputTf.getText()));
                m_totalTf.setText(m_total.toString());
            } catch (NumberFormatException nfex) {
                JOptionPane.showMessageDialog(AllInOneCacl.this, "输入的数据错误: '" + m_userInputTf.getText() + "'，请输入数字！");
            }
        }
    }

    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            reset();
            m_totalTf.setText(m_total.toString());
        }
    }

}
