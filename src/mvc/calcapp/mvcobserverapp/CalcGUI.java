package mvc.calcapp.mvcobserverapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class CalcGUI extends JFrame {
    // ... Constants
    private static final String INITIAL_VALUE = "1";
    private static CalcModel m_model;
    private static TotalResultView t_view;
    // ... Components
    private JTextField m_userInputTf = new JTextField(5);
    private JTextField m_totalTf = new JTextField(20);
    private JButton m_multiplyBtn = new JButton("乘以");
    private JButton m_clearBtn = new JButton("重置");

    // ======================================================= constructor

    /**
     * Constructor
     */
    CalcGUI() {
        // ... Set up the logic
        m_model = new CalcModel();
        t_view = new TotalResultView(this, m_model);
        m_model.register(t_view);
//		m_model.setValue(INITIAL_VALUE);
        // ... Initialize components
        m_totalTf.setText(m_model.getValue());
        m_totalTf.setEditable(false);

        // ... Layout the components.
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("请输入："));
        content.add(m_userInputTf);
        content.add(m_multiplyBtn);
        content.add(new JLabel("总乘积:"));
        content.add(m_totalTf);
        content.add(m_clearBtn);
        CalcController objButtonHandler = new CalcController(m_model, this);
        // ... finalize layout
        // ... finalize layout
        this.setContentPane(content);
        this.pack();
        this.setVisible(true);
        this.setTitle("Simple Calc - MVC");
        // The window closing event should probably be passed to the
        // Controller in a real program, but this is a short example.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static public void main(String argv[]) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalcGUI();
            }
        });
    }

    void reset() {
        m_totalTf.setText(INITIAL_VALUE);
    }

    String getUserInput() {
        return m_userInputTf.getText();
    }

    void setTotal(String newTotal) {
        m_totalTf.setText(newTotal);
    }

    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    void addMultiplyListener(ActionListener mal) {
        m_multiplyBtn.addActionListener(mal);
    }

    void addClearListener(ActionListener cal) {
        m_clearBtn.addActionListener(cal);
    }

}