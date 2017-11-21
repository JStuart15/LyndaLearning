import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextFields {

	private JFrame frame;
	private JTextField txtExample;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextFields window = new TextFields();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TextFields() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblName.setBounds(8, 10, 47, 23);
		frame.getContentPane().add(lblName);
		
		txtExample = new JTextField();
		txtExample.setBounds(54, 8, 166, 26);
		frame.getContentPane().add(txtExample);
		txtExample.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(8, 83, 436, 16);
		frame.getContentPane().add(label);
		
		JButton btnSayHi = new JButton("Say Hi");
		btnSayHi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtExample.getText();
				label.setText("Hi " + name + "!");
			}
		});
		btnSayHi.setBounds(5, 42, 117, 29);
		frame.getContentPane().add(btnSayHi);
		
		
	}
}
