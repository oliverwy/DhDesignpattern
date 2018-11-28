package ch23commandpattern.commandpatternlightfcommand;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwitchButton extends JFrame {

	private JPanel contentPane;
	private Line line;

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
	private void assembly()
	{
		Appliance light=new Light();
		Appliance hifi=new Hifi();
		Command lightOn=new OnCommand(light);
		Command lightOff=new OffCommand(light);
		Command hifiOn=new OnCommand(hifi);
		Command hifiOff=new OffCommand(hifi);
		Line l=new Line();
	}
	
	private void lineAssemable()
	{
		line=new Line();
	}
	
//	private void lightOn
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
		
		JButton button = new JButton("开音响");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(43, 142, 117, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("关音响");
		button_1.setBounds(43, 183, 117, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("开灯");
		button_2.setBounds(192, 142, 117, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("关灯");
		button_3.setBounds(192, 183, 117, 29);
		contentPane.add(button_3);
	}

}
