package ch20_iteratorpattern.TVdemo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TvClient extends JFrame {

    private JPanel contentPane;
    private ConcreteTv tvCon;
    private TvIterator tvIte;
    private JTextField tfChanel;

    /**
     * Create the frame.
     */
    public TvClient() {
        setTitle("电视机应用实例");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        initTV();

        JLabel lblNewLabel_1 = new JLabel("电视品牌：");
        lblNewLabel_1.setBounds(176, 46, 76, 16);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("电视型号：");
        lblNewLabel_2.setBounds(176, 69, 76, 16);
        contentPane.add(lblNewLabel_2);

        JLabel lblplayInfo = new JLabel("当前频道");
        lblplayInfo.setBounds(176, 97, 225, 16);
        contentPane.add(lblplayInfo);

        JLabel lblBrand = new JLabel("New label");
        lblBrand.setBounds(251, 46, 61, 16);
        contentPane.add(lblBrand);

        JLabel lblType = new JLabel("New label");
        lblType.setBounds(251, 69, 61, 16);
        contentPane.add(lblType);


        JLabel lblNewLabel = new JLabel("当前播放：");
        lblNewLabel.setBounds(50, 97, 82, 16);
        contentPane.add(lblNewLabel);

        tfChanel = new JTextField();
        tfChanel.setBounds(271, 162, 130, 26);
        contentPane.add(tfChanel);
        tfChanel.setColumns(10);

        JLabel label = new JLabel("指定频道");
        label.setBounds(197, 167, 61, 16);
        contentPane.add(label);
        JButton btnNewButton_2 = new JButton("播放指定频道");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Chanel c;
                c = tvIte.getSpecifyChanel(Integer.valueOf(tfChanel.getText()));
                System.out.println(Integer.valueOf(tfChanel.getText()));
                lblBrand.setText(tvCon.getBrand());
                lblType.setText(tvCon.getType());
                lblplayInfo.setText(c.play());
            }
        });
        btnNewButton_2.setBounds(271, 200, 117, 29);
        contentPane.add(btnNewButton_2);
        JButton btnNewButton_3 = new JButton("首频道");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Chanel c;
                c = tvIte.firstChanel();
                lblBrand.setText(tvCon.getBrand());
                lblType.setText(tvCon.getType());
                lblplayInfo.setText(c.play());
            }
        });
        btnNewButton_3.setBounds(35, 241, 117, 29);
        contentPane.add(btnNewButton_3);
        JButton btnNewButton_1 = new JButton("前一频道");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Chanel c;
                c = tvIte.nextChanel();
                lblBrand.setText(tvCon.getBrand());
                lblType.setText(tvCon.getType());
                lblplayInfo.setText(c.play());

            }
        });
        btnNewButton_1.setBounds(35, 200, 117, 29);
        contentPane.add(btnNewButton_1);
        JButton btnNewButton = new JButton("后一频道");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Chanel c;
                c = tvIte.priorChanel();
                lblBrand.setText(tvCon.getBrand());
                lblType.setText(tvCon.getType());
                lblplayInfo.setText(c.play());
            }
        });
        btnNewButton.setBounds(148, 200, 117, 29);
        contentPane.add(btnNewButton);


    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TvClient frame = new TvClient();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void initTV() {
        List<Chanel> Chanels = new ArrayList<Chanel>();
        int i;
        String chanelName;
        Random random = new Random();
        Chanel c;
        for (i = 0; i < 40; i++) {
            chanelName = "安徽" + String.valueOf(random.nextInt(30)) + "台";
            c = new Chanel(chanelName, String.valueOf(i));
            Chanels.add(c);
        }
        tvCon = new ConcreteTv(Chanels, "开天50", "飞天系里", "长虹电视");
        tvIte = new ConcreteTvIterator(tvCon);

    }
}
